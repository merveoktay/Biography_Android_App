package com.example.merve_oktay_odev3.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.merve_oktay_odev3.R
import com.example.merve_oktay_odev3.models.UserProjects

class UserProjectsCustomAdapter(private val context: Activity, private val list: List<UserProjects>) : ArrayAdapter<UserProjects>(context, R.layout.custom_list_item, list ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item, null, true)

        val r_title = rootView.findViewById<TextView>(R.id.r_title)
        val r_content = rootView.findViewById<TextView>(R.id.r_content)
        val r_image = rootView.findViewById<ImageView>(R.id.r_img)

        val userProject = list.get(position)

        r_title.text = "${userProject.projectName} "
        r_content.text = userProject.projectContents

        Glide.with(context).load(userProject.projectImage).into(r_image)

        return rootView
    }
}