package com.example.ndkstudy

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ndkstudy.samples.DynicRegisterJniTest
import com.example.ndkstudy.samples.JavaCallNativeTest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_java_call_native.setOnClickListener {
            start(JavaCallNativeTest::class.java)
        }

        btn_jni_dynmic_register.setOnClickListener {
            start(DynicRegisterJniTest::class.java)
        }


    }

    private fun start(ac: Class<out Activity>) {
        startActivity(Intent(this,ac))
    }

}

