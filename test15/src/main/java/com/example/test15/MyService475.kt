package com.example.test15

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.*
import android.util.Log
import android.widget.Toast

class MyService475 : Service() {

    lateinit var messenger: Messenger
    lateinit var replyMessenger: Messenger


    inner class IncomingHandler(
        context: Context,
        private val applicationContext: Context = context.applicationContext
    ) : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            when (msg.what) {
                10 -> {
                    replyMessenger = msg.replyTo
                    val bundle = msg.obj as Bundle
                    Toast.makeText(applicationContext, "outer ${bundle["data1"]}, ${bundle["data2"]}", Toast.LENGTH_SHORT).show()

                    val replyMsg=Message()
                    val replyBundle=Bundle()
                    replyBundle.putString("replyData1", "hello world")
                    replyMsg.obj=replyBundle
                    replyMessenger.send(replyMsg)
                }

                20 ->
                    Toast.makeText(applicationContext, "outer ${msg.obj}", Toast.LENGTH_SHORT).show()
                else -> super.handleMessage(msg)
            }
        }
    }
    override fun onBind(intent: Intent): IBinder? {
        //messenger 이용 방법
        messenger = Messenger(IncomingHandler(this))
        return messenger.binder
    }
}