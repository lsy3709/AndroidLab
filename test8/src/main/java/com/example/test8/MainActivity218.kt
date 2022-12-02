package com.example.test8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent

class MainActivity218 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main218)
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_BACK -> Log.d("kkang", "BACK Button을 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("kkang", "Volume Up 키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("kkang", "Volume Down 키를 눌렀네요")
        }
        return super.onKeyDown(keyCode, event)
    }
}