package com.adnet.filtertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val window = PopupWindow(this)
        imageViewFilter.setOnClickListener {
          //  FilterDialog.languageDialog(this)
            FilterPopupWindow.showPopup(window,imageViewFilter,layoutInflater)
        }
    }
}
