package com.nghiemtuananh.customadapterlistviewkpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arrayTraiCay = ArrayList<TraiCay>()
    var adapter: TraiCayAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayTraiCay.add(TraiCay("Quả Bưởi", "Bưởi 5 roi", R.drawable.qua_buoi))
        arrayTraiCay.add(TraiCay("Quả Cam", "Cam sành Bắc Giang", R.drawable.qua_cam))
        arrayTraiCay.add(TraiCay("Quả Chuối", "Chuối Hà Đông siêu ngon", R.drawable.qua_chuoi))
        arrayTraiCay.add(TraiCay("Quả Roi", "Roi miền Nam 10k 1 cân", R.drawable.qua_roi))
        arrayTraiCay.add(TraiCay("Quả Táo", "Táo nhập khẩu giá siêu tốt", R.drawable.qua_tao))
        arrayTraiCay.add(TraiCay("Quả Bưởi", "Bưởi 5 roi", R.drawable.qua_buoi))
        arrayTraiCay.add(TraiCay("Quả Cam", "Cam sành Bắc Giang", R.drawable.qua_cam))
        arrayTraiCay.add(TraiCay("Quả Chuối", "Chuối Hà Đông siêu ngon", R.drawable.qua_chuoi))
        arrayTraiCay.add(TraiCay("Quả Roi", "Roi miền Nam 10k 1 cân", R.drawable.qua_roi))
        arrayTraiCay.add(TraiCay("Quả Táo", "Táo nhập khẩu giá siêu tốt", R.drawable.qua_tao))
        arrayTraiCay.add(TraiCay("Quả Bưởi", "Bưởi 5 roi", R.drawable.qua_buoi))
        arrayTraiCay.add(TraiCay("Quả Cam", "Cam sành Bắc Giang", R.drawable.qua_cam))
        arrayTraiCay.add(TraiCay("Quả Chuối", "Chuối Hà Đông siêu ngon", R.drawable.qua_chuoi))
        arrayTraiCay.add(TraiCay("Quả Roi", "Roi miền Nam 10k 1 cân", R.drawable.qua_roi))
        arrayTraiCay.add(TraiCay("Quả Táo", "Táo nhập khẩu giá siêu tốt", R.drawable.qua_tao))
        adapter = TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay)
        lv_traicay.adapter = adapter
    }
}