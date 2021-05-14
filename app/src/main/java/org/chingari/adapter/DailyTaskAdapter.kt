package org.chingari.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_daily_tasks.view.*
import org.chingari.R
import org.chingari.model.DailyModel

class DailyTaskAdapter(var list: List<DailyModel> = listOf()) : RecyclerView.Adapter<DailyTaskAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_daily_tasks, parent, false))

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindItems(model: DailyModel) {
            itemView.run {
                // Glide.with(context).load(model.avatar).into(ivProfileUser)

                tv_name.text = model.name
                img_header.setImageResource(model.avatar)
                img_type.setImageResource(model.type)
                tv_typename.text = model.typename
            }
        }
    }
}