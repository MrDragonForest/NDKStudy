package com.example.ndkstudy.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ndkstudy.R
import com.example.ndkstudy.jni.Functions
import kotlinx.android.synthetic.main.activity_java_call_native_test.*
import java.text.SimpleDateFormat
import java.util.*

class JavaCallNativeTest : AppCompatActivity() {
    var sdf = SimpleDateFormat("YYYY/MM/dd HH:mm:ss SSS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_call_native_test)
        btn_update.setOnClickListener {
            updateTime()
        }
    }

    init {
        System.loadLibrary("native_lib")
    }

    private fun updateTime() {
        updateJavaTime()
        updateNativeTime()
    }

    private fun updateJavaTime() {
        var time = System.currentTimeMillis()
        tv_time_java.text = sdf.format(Date(time))
    }

    private fun updateNativeTime() {
        var time = Functions.getTimeStampFromNative() ?: return
        tv_time_native.text = sdf.format(Date(time))
    }
}
