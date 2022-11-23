package com.example.test10

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.example.test10.databinding.ActivityMain282Binding

class MainActivity282 : AppCompatActivity() {
    val eventHandler = object : DialogInterface.OnClickListener {
        override fun onClick(p0: DialogInterface?, p1: Int) {
            if (p1 == DialogInterface.BUTTON_POSITIVE) {
                Log.d("kkang", "positive button click")
            } else if (p1 == DialogInterface.BUTTON_NEGATIVE) {
                Log.d("kkang", "negative button click")

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain282Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            AlertDialog.Builder(this).run {
                setTitle("test dialog")
                setIcon(android.R.drawable.ic_dialog_info)
                setMessage("정말 종료하시겠습니까?")
                setPositiveButton("OK", eventHandler)
                setNegativeButton("Cancel", eventHandler)
                show()
            }
        }
        binding.button2.setOnClickListener {
            val items = arrayOf<String>("사과", "복숭아", "수박", "딸기")
            AlertDialog.Builder(this).run {
                setTitle("items test")
                setIcon(android.R.drawable.ic_dialog_info)
                setItems(
                    items,
                    object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {
                            Log.d(
                                "kkang",
                                "선택한 과일 : ${items[p1]}}"
                            )
                        }
                    })
                setPositiveButton("닫기", null)
                show()
            }
        }
        binding.button3.setOnClickListener {
            val items = arrayOf<String>("사과", "복숭아", "수박", "딸기")
            AlertDialog.Builder(this).run {
                setTitle("items test")
                setIcon(android.R.drawable.ic_dialog_info)
                setMultiChoiceItems(
                    items,
                    booleanArrayOf(true, false, true, false),
                    object : DialogInterface.OnMultiChoiceClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int, p2: Boolean) {
                            Log.d(
                                "kkang",
                                "${items[p1]} 이 ${if (p2) "선택되었습니다." else "선택 해제되었습니다."}"
                            )
                        }
                    })
                setPositiveButton("닫기", null)
                show()
            }
        }
        binding.button4.setOnClickListener {
            val items = arrayOf<String>("사과", "복숭아", "수박", "딸기")
            AlertDialog.Builder(this).run {
                setTitle("items test")
                setIcon(android.R.drawable.ic_dialog_info)
                setSingleChoiceItems(
                    items,
                    1,
                    object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {
                            Log.d(
                                "kkang",
                                "${items[p1]} 이 선택되었습니다.}"
                            )
                        }
                    })
                setPositiveButton("닫기", null)
                show()
            }
        }
    }
}