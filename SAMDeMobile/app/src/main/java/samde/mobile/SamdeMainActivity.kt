package samde.mobile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import samde.mobile.adapter.ApplicationAdapter
import samde.mobile.listener.ApplicationOnItemClickListener

class SamdeMainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samde_main)

        listView = findViewById(R.id.application_list_view)
        val applications = ApplicationPopulator().getApplications(packageManager)
        val adapter = ApplicationAdapter(this, applications)
        listView.adapter = adapter

        val context = this
        listView.onItemClickListener = ApplicationOnItemClickListener(context, applications)
    }
}
