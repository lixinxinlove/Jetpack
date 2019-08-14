package com.lixinxinlove.jetpack.fragment


import android.animation.Animator
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieAnimationView
import com.lixinxinlove.jetpack.R


class Fragment3 : Fragment(), View.OnClickListener {


    lateinit var lottie1: LottieAnimationView
    lateinit var lottie2: LottieAnimationView
    lateinit var lottie3: LottieAnimationView
    lateinit var lottie4: LottieAnimationView

    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView
    lateinit var image4: ImageView

    lateinit var tv1: TextView
    lateinit var tv2: TextView
    lateinit var tv3: TextView
    lateinit var tv4: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        var view = inflater.inflate(R.layout.fragment3, container, false)

        var layout1: RelativeLayout = view!!.findViewById(R.id.layout1)
        var layout2: RelativeLayout = view!!.findViewById(R.id.layout2)
        var layout3: RelativeLayout = view!!.findViewById(R.id.layout3)
        var layout4: RelativeLayout = view!!.findViewById(R.id.layout4)


        lottie1 = view!!.findViewById(R.id.lottie1)
        lottie2 = view!!.findViewById(R.id.lottie2)
        lottie3 = view!!.findViewById(R.id.lottie3)
        lottie4 = view!!.findViewById(R.id.lottie4)

        image1 = view!!.findViewById(R.id.image1)
        image2 = view!!.findViewById(R.id.image2)
        image3 = view!!.findViewById(R.id.image3)
        image4 = view!!.findViewById(R.id.image4)


        tv1 = view!!.findViewById(R.id.tv1)
        tv2 = view!!.findViewById(R.id.tv2)
        tv3 = view!!.findViewById(R.id.tv3)
        tv4 = view!!.findViewById(R.id.tv4)


        layout1.setOnClickListener(this)
        layout2.setOnClickListener(this)
        layout3.setOnClickListener(this)
        layout4.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.layout1 -> {
                cleanItem()
                lottie1.visibility=View.VISIBLE
                lottie1.addAnimatorListener(object : Animator.AnimatorListener {

                    override fun onAnimationStart(animation: Animator?) {
                        image1.visibility = View.GONE
                    }

                    override fun onAnimationEnd(animation: Animator?) {
                        tv1.setTextColor(Color.parseColor("#FF4D7BFE"))
                        image1.visibility = View.VISIBLE
                        image1.setImageResource(R.mipmap.tab_saltlakecity)
                        lottie1.visibility = View.GONE
                    }

                    override fun onAnimationCancel(animation: Animator?) {
                        tv1.setTextColor(Color.parseColor("#FF777892"))
                        image1.visibility = View.VISIBLE
                        image1.setImageResource(R.mipmap.tab_saltlakecity_no)
                        lottie1.visibility = View.GONE
                    }


                    override fun onAnimationRepeat(animation: Animator?) {

                    }

                })
                lottie1.playAnimation()
            }
            R.id.layout2 -> {
                cleanItem()
                lottie2.visibility=View.VISIBLE
                lottie2.addAnimatorListener(object : Animator.AnimatorListener {
                    override fun onAnimationRepeat(animation: Animator?) {

                    }

                    override fun onAnimationEnd(animation: Animator?) {

                        tv2.setTextColor(Color.parseColor("#FF4D7BFE"))
                        image2.visibility = View.VISIBLE
                        image2.setImageResource(R.mipmap.tab_saltlakecity)
                        lottie2.visibility = View.GONE
                    }

                    override fun onAnimationCancel(animation: Animator?) {
                        tv2.setTextColor(Color.parseColor("#FF777892"))
                        image2.visibility = View.VISIBLE
                        image2.setImageResource(R.mipmap.tab_saltlakecity_no)
                        lottie2.visibility = View.GONE
                    }

                    override fun onAnimationStart(animation: Animator?) {
                        image2.visibility = View.GONE
                    }
                })
                lottie2.playAnimation()
            }
            R.id.layout3 -> {
                cleanItem()
                lottie3.visibility=View.VISIBLE
                lottie3.addAnimatorListener(object : Animator.AnimatorListener {
                    override fun onAnimationRepeat(animation: Animator?) {

                    }

                    override fun onAnimationEnd(animation: Animator?) {

                        tv3.setTextColor(Color.parseColor("#FF4D7BFE"))
                        image3.visibility = View.VISIBLE
                        image3.setImageResource(R.mipmap.tab_saltlakecity)
                        lottie3.visibility = View.GONE
                    }

                    override fun onAnimationCancel(animation: Animator?) {
                        tv3.setTextColor(Color.parseColor("#FF777892"))
                        image3.visibility = View.VISIBLE
                        image3.setImageResource(R.mipmap.tab_saltlakecity_no)
                        lottie3.visibility = View.GONE
                    }

                    override fun onAnimationStart(animation: Animator?) {
                        image3.visibility = View.GONE
                    }
                })
                lottie3.playAnimation()
            }
            R.id.layout4 -> {
                cleanItem()
                lottie4.visibility=View.VISIBLE
                lottie4.addAnimatorListener(object : Animator.AnimatorListener {
                    override fun onAnimationRepeat(animation: Animator?) {

                    }

                    override fun onAnimationEnd(animation: Animator?) {

                        tv4.setTextColor(Color.parseColor("#FF4D7BFE"))
                        image4.visibility = View.VISIBLE
                        image4.setImageResource(R.mipmap.tab_saltlakecity)
                        lottie4.visibility = View.GONE
                    }

                    override fun onAnimationCancel(animation: Animator?) {
                        tv4.setTextColor(Color.parseColor("#FF777892"))
                        image4.visibility = View.VISIBLE
                        image4.setImageResource(R.mipmap.tab_saltlakecity_no)
                        lottie4.visibility = View.GONE
                    }

                    override fun onAnimationStart(animation: Animator?) {
                        image4.visibility = View.GONE
                    }
                })
                lottie4.playAnimation()
            }
            else -> {
            }
        }
    }


    private fun cleanItem() {
        image1.setImageResource(R.mipmap.tab_saltlakecity_no)
        image2.setImageResource(R.mipmap.tab_garden_no)
        image3.setImageResource(R.mipmap.tab_trip_no)
        image4.setImageResource(R.mipmap.tab_my_no)

        tv1.setTextColor(Color.parseColor("#FF777892"))
        tv2.setTextColor(Color.parseColor("#FF777892"))
        tv3.setTextColor(Color.parseColor("#FF777892"))
        tv4.setTextColor(Color.parseColor("#FF777892"))

        lottie1.cancelAnimation()
        lottie2.cancelAnimation()
        lottie3.cancelAnimation()
        lottie4.cancelAnimation()
    }
}



