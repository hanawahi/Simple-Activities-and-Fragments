package com.example.helloworld
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_state_change.*

class StateChangeActivity : AppCompatActivity() {

    override fun onSaveInstanceState(outState: Bundle?) {
        if (outState != null) {
            super.onSaveInstanceState(outState)
        }
        Log.i(TAG, "onSaveInstanceState")

        val userText = editText.text
        outState?.putCharSequence("savedText", userText)
    }