package com.example.test10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.test10.databinding.ActivityMain288Binding
import com.example.test10.databinding.DialogInputBinding

class MainActivity288 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain288Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val dialogBinding = DialogInputBinding.inflate(layoutInflater)
            AlertDialog.Builder(this).run {
                setTitle("Input")
                setView(dialogBinding.root)
                setPositiveButton("닫기", null)
                show()
            }
        }
    }
}