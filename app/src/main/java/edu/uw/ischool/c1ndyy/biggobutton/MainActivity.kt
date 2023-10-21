package edu.uw.ischool.c1ndyy.biggobutton

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushMe = findViewById<Button>(R.id.button)

        pushMe.setOnClickListener (View.OnClickListener {
            clickCount++

            if (clickCount == 1) {
                pushMe.text = "You have pushed me 1 time!"
            } else {
                pushMe.text = "You have pushed me $clickCount times!"
            }
        })
    }
}