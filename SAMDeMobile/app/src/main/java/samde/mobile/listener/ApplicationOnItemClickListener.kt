package samde.mobile.listener

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import samde.mobile.adapter.ApplicationAdapter
import samde.mobile.model.Application
import samde.mobile.model.ClassificationResponse
import samde.mobile.rest.RestClient


class ApplicationOnItemClickListener(private val context: Context,
                                     private val applications: List<Application>)
        : AdapterView.OnItemClickListener {

    private val restClient = RestClient(context)

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val selectedApp = applications[position]
        restClient.getApi().classify(selectedApp.manifest).enqueue(object : Callback<ClassificationResponse> {
            override fun onFailure(call: Call<ClassificationResponse>?, t: Throwable?) {
                Log.e("samde response", "Failure", t)
            }

            override fun onResponse(call: Call<ClassificationResponse>?, response: Response<ClassificationResponse>?) {
                if (response!!.isSuccessful) {
                    val status = response.body()!!.status
                    val adapter = parent?.adapter as ApplicationAdapter

                    selectedApp.status = status
                    adapter.notifyDataSetChanged()
                    Log.d("samde response", status)
//                    Toast.makeText(context, status, Toast.LENGTH_SHORT).show()
                } else {
                    Log.d("samde response ns", response.code().toString())
                    Log.d("samde response ns", response.errorBody()!!.string())
                }
            }
        })
        Log.d("samde", "Selected App: " + selectedApp.name)
    }

}