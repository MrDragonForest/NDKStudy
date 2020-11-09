package com.example.ndkstudy.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ndkstudy.R
import com.example.ndkstudy.jni.Functions
import kotlinx.android.synthetic.main.activity_dynic_register_jni_test.*

class DynicRegisterJniTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynic_register_jni_test)
        btn_show.setOnClickListener {
            tv_str.text = Functions.getDynmicResult()
        }
    }
}