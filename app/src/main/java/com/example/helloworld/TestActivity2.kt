package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TestActivity2 : AppCompatActivity() {
    //TODO: This activity will be either transparent, or a dialog.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
    }
}