package com.example.test15

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.*
import android.util.Log
import android.widget.Toast

class MyService473 : Service() {

    lateinit var messenger: Messenger

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
}