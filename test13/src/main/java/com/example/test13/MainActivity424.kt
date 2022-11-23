package com.example.test13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test13.databinding.ActivityMain424Binding

class MainActivity424 : AppCompatActivity() {
    var count = 0
    lateinit var binding: ActivityMain424Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain424Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusCountButton.setOnClickListener {
            count++
            binding.countResultView.text="$count"
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val data1 = savedInstanceState.getString("data1")
        val data2 = savedInstanceState.getInt("data2")

        binding.countResultView.text="$data1 - $data2"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("kkang","onSaveInstanceState..........")
        outState.putString("data1", "hello")
        outState.putInt("data2", 10)
    }
}