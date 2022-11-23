package com.example.test13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test13.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("kkang","DetailActivity..onCreate..........")
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data1 = intent.getStringExtra("data1")
        val data2 = intent.getIntExtra("data2", 0)

        binding.detailResultView.text = "data1: $data1, data2: $data2"

        binding.detailButton.setOnClickListener {
            intent.putExtra("result","world")
            setResult(RESULT_OK, intent)
            finish()
        }



    }
}