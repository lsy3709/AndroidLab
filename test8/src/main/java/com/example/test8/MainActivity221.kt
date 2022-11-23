package com.example.test8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.test8.databinding.ActivityMain221Binding

class MyEventHandler : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("kkang", "체크박스 클릭")
    }
}

class MainActivity221 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain221Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}