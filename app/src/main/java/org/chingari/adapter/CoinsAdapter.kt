package org.chingari.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_header_coins.view.*
import org.chingari.R
import org.chingari.model.CoinsModel

class CoinsAdapter(var list: List<CoinsModel> = listOf()) : RecyclerView.Adapter<CoinsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_header_coins, parent, false))

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindItems(model: CoinsModel) {
            itemView.run {
                // Glide.with(context).load(model.avatar).into(ivProfileUser)

                if(adapterPosition==0) {
                    view_card.setBackgroundResource(0)
                    img_header.alpha=0.5f
                    tv_days.alpha=0.5f
                    img_sign.visibility=View.VISIBLE
                }
                if(adapterPosition==1) {
                    view_card.setBackgroundResource(0)
                    img_header.alpha=0.5f
                    tv_days.alpha=0.5f
                    img_sign.visibility=View.GONE
                }

                img_header.setImageResource(model.avatar)
                tv_days.text = model.name
            }
        }
    }
}