package com.example.testproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "helloworld"

        binding.button.setOnClickListener {
            binding.textView.text = "world"
        }

        binding.button.setOnClickListener {
            binding.textView.text = "hello"
        }
    }
}