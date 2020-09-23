package com.example.setbackgroundcolorsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraint: View = findViewById(R.id.constraint)
        val backgroundColor = getDrawable(R.color.colorAccent)
        constraint.background = backgroundColor

    }
}