package com.patrickchow.conductor.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler
import com.patrickchow.conductor.R
import kotlinx.android.synthetic.main.home_controller_layout.view.*

class HomeController :Controller(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.home_controller_layout, container, false)
        view.tv_home_text_view.text = "Hello Conductor! ${router.backstackSize}"

        return view
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)

        if(view != null){
            view?.findViewById<Button>(R.id.btn_next)?.setOnClickListener {
                router.pushController(RouterTransaction.with(HomeController())
                    .pushChangeHandler(HorizontalChangeHandler())
                    .popChangeHandler(HorizontalChangeHandler()))
            }

            val previousButton = view?.btn_previous
            if(router.backstackSize <= 1){
                previousButton?.visibility = View.GONE

                previousButton?.setOnClickListener {

                    router.popCurrentController()
                }
            }

        }
    }
}