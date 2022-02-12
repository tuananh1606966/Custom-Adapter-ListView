package com.nghiemtuananh.customadapterlistviewkpt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService

class TraiCayAdapter(var context: Context,var layout: Int,var traiCayList: List<TraiCay>): BaseAdapter(){
    class ViewHolder (row: View) {
        var tvTen: TextView
        var tvMoTa: TextView
        var ivHinh: ImageView

        init {
            tvTen = row.findViewById(R.id.tv_ten)
            tvMoTa = row.findViewById(R.id.tv_mota)
            ivHinh = row.findViewById(R.id.iv_hinh)
        }
    }

    override fun getCount(): Int {
        return traiCayList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(layout, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var traiCay = traiCayList.get(position)
        viewHolder.tvTen.text = traiCay.ten
        viewHolder.tvMoTa.text = traiCay.moTa
        viewHolder.ivHinh.setImageResource(traiCay.hinh)

        var animation = AnimationUtils.loadAnimation(context, R.anim.scale_list)
        view.startAnimation(animation)

        return view
//        var inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        var view = inflater.inflate(layout, null)
//        var tvTen = view.findViewById(R.id.tv_ten) as TextView
//        var tvMoTa = view.findViewById(R.id.tv_mota) as TextView
//        var ivHinh = view.findViewById(R.id.iv_hinh) as ImageView
//        var traiCay = traiCayList.get(position)
//        tvTen.text = traiCay.ten
//        tvMoTa.text = traiCay.moTa
//        ivHinh.setImageResource(traiCay.hinh)
//        return view
    }
}