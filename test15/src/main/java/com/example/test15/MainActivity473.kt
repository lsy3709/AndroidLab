package com.example.test15

import android.content.ComponentName
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import com.example.test15.databinding.ActivityMain473Binding
import com.example.test15.databinding.ActivityMainBinding

class MainActivity473 : AppCompatActivity() {
    lateinit var servideBinder: MyService.MyBinder
    val connection: ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            Log.d("kkang", "onServiceConnected...")
            servideBinder = service as MyService.MyBinder
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.d("kkang", "onServiceDisconnected...")
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain473Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bindFunACallButton.setOnClickListener {
            servideBinder.funA(10)
        }
        binding.bindFunBCallButton.setOnClickListener {
            Log.d("kkang", "${servideBinder.funB(20)}")
        }
    }
}