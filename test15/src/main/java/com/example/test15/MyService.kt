package com.example.test15

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.*
import android.util.Log
import android.widget.Toast

class MyService : Service() {
    lateinit var messenger: Messenger

    override fun onCreate() {
        super.onCreate()
        Log.d("kkang", "service onCreate...")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("kkang", "service onStartCommand...")
        return super.onStartCommand(intent, flags, startId)
    }

    class MyBinder: Binder() {
        fun funA(arg: Int) {
            Log.d("kkang", "funA....$arg")
        }
        fun funB(arg: Int): Int {
            Log.d("kkang", "funB....$arg")
            return arg * arg
        }
    }


    override fun onBind(intent: Intent): IBinder? {
        Log.d("kkang", "service onBind...")
        return MyBinder()


    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.d("kkang", "service onUnbind...")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("kkang", "service onDestroy...")
    }
}