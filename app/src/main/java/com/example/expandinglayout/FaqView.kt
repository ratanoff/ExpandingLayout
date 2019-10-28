package com.example.expandinglayout

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.view_faq.view.*

class FaqView(context: Context, attrs: AttributeSet) : MotionLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_faq, this, true)

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.FaqView,
            0, 0
        ).apply {
            try {
                title.text = getString(R.styleable.FaqView_title)
                description.text = getString(R.styleable.FaqView_description)
            } finally {
                recycle()
            }
        }


    }

}