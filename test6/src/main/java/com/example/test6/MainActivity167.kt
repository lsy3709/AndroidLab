package com.example.test6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test6.databinding.ActivityMain167Binding
import com.example.test6.databinding.ActivityMainBinding

class MainActivity167 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain167Binding.inflate(layoutInflater)
        // 액티비티 화면 출력
        setContentView(binding.root)
        // 뷰 객체 이용
        binding.visibleBtn.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }
        binding.invisibleBtn.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }


    }
}