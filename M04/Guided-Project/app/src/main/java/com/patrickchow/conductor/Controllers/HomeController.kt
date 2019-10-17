package com.patrickchow.conductor.Controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.patrickchow.conductor.R
import kotlinx.android.synthetic.main.home_controller_layout.view.*

class HomeController ():Controller(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.home_controller_layout, container, false)
        view.tv_home_text_view.text = "Hello Conductor!"

        return view
    }

}