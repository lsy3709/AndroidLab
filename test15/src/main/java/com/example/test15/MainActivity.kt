package com.example.test15

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import com.example.test15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val connection: ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            Log.d("kkang", "onServiceConnected...")        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.d("kkang", "onServiceDisconnected...")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startServiceButton.setOnClickListener {
            val intent = Intent(this, MyService::class.java)
            startService(intent)
        }

        binding.stopServiceButton.setOnClickListener {
            val intent = Intent(this, MyService::class.java)
            stopService(intent)
        }

        binding.bindServiceButton.setOnClickListener {
            val intent = Intent(this, MyService::class.java)
            bindService(intent, connection, Context.BIND_AUTO_CREATE)

        }
        binding.unbindServiceButton.setOnClickListener {
            unbindService(connection)
        }
    }
}