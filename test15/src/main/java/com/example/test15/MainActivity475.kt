package com.example.test15

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.example.test15.databinding.ActivityMain475Binding
import com.example.test15.databinding.ActivityMainBinding

class MainActivity475 : AppCompatActivity() {
    lateinit var messenger: Messenger
    lateinit var replyMessenger: Messenger

    val connection: ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            messenger = Messenger(service)
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.d("kkang", "onServiceDisconnected...")
        }
    }

    internal class HandlerReplyMsg : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            val bundle = msg.obj as Bundle

            Log.d("kkang", "activity.....${bundle["replyData1"]}")
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain475Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bindServiceButton.setOnClickListener {
            //외부앱 이용.........messenger.....
            val intent = Intent(this, MyService475::class.java)
            bindService(intent, connection, Context.BIND_AUTO_CREATE)
            replyMessenger=Messenger(HandlerReplyMsg())

        }
        binding.unbindServiceButton.setOnClickListener {
            unbindService(connection)
        }

        binding.sendButton1.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("data1", "hello")
            bundle.putInt("data2", 10)

            val msg = Message()
            msg.replyTo=replyMessenger
            msg.what=10
            msg.obj=bundle
            messenger.send(msg)
        }
        binding.sendButton2.setOnClickListener {
            val msg = Message()
            msg.what=20
            msg.obj="world"
            messenger.send(msg)

        }
    }
}