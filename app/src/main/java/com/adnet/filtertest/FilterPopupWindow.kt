package com.adnet.filtertest

import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.dailog_language.view.*

object FilterPopupWindow {
    fun showPopup(
        window: PopupWindow,
        imageView: ImageView,
        layoutInflater: LayoutInflater
    ) {
        val view = layoutInflater.inflate(R.layout.dailog_language, null)
        window.setBackgroundDrawable(null)
        if (!window.isShowing) {
            view.startAnimation(translateYAnimation)
            window.contentView = view
            window.showAsDropDown(imageView)
        } else {
            window.dismiss()
        }

        view.textViewCancel.setOnClickListener {
            window.dismiss()
        }

        view.textViewSave.setOnClickListener {
            window.dismiss()
        }
    }
}