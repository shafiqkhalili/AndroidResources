package com.shafigh.androidresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingsTextview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingsTextview = findViewById(R.id.textView)

    }
    fun buttonPressed(view:View){
        greetingsTextview.text = getString(R.string.thank_you)
    }
}
