package com.lixinxinlove.jetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.lixinxinlove.jetpack.R


class Fragment2 : Fragment() {


    lateinit var btn:Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

       val view=inflater.inflate(R.layout.fragment2, container, false)

        btn = view.findViewById(R.id.btn_2)

        btn.setOnClickListener {

            val navOption = navOptions {
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }
            // 参数设置
            val bundle = Bundle()
            bundle.putString("name","TeaOf")
            findNavController().navigate(R.id.f3, bundle,navOption)
        }

        return view
    }
}
