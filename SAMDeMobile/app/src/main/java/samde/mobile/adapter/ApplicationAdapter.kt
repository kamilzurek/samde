package samde.mobile.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import samde.mobile.R
import samde.mobile.model.Application

class ApplicationAdapter( private val context: Context,
                          private val applications: List<Application>) : BaseAdapter() {

    private val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getItem(position: Int): Any {
        return applications[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return applications.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.application_item, parent, false)
            holder = ViewHolder()
            holder.iconImageView = view.findViewById(R.id.application_icon) as ImageView
            holder.titleTextView = view.findViewById(R.id.application_name) as TextView
            holder.subtitleTextView = view.findViewById(R.id.application_package_name) as TextView
            holder.detailTextView = view.findViewById(R.id.application_status) as TextView
            view.tag = holder
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
        }

        val titleTextView = holder.titleTextView
        val subtitleTextView = holder.subtitleTextView
        val detailTextView = holder.detailTextView
        val iconImageView = holder.iconImageView

        val application = getItem(position) as Application

        titleTextView.text = application.name
        subtitleTextView.text = application.packageName
        detailTextView.text  = application.status
        if (application.status.isNotEmpty()) {
            if (application.status.equals("malicious", true)) {
                detailTextView.setTextColor(Color.rgb(231, 76, 60))
            } else if (application.status.equals("benign", true)) {
                detailTextView.setTextColor(Color.rgb(26, 188, 156))

            }
        }
        iconImageView.setImageDrawable(application.icon)

        return view
    }

    private class ViewHolder {
        lateinit var titleTextView: TextView
        lateinit var subtitleTextView: TextView
        lateinit var detailTextView: TextView
        lateinit var iconImageView: ImageView
    }

}