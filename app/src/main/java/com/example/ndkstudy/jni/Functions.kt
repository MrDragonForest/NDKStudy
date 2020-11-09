package com.example.ndkstudy.jni

/***
 *  create by DragonForest on 2020/11/7
 */
object Functions {

    init {
    }

    external fun getTimeStampFromNative():Long

    //动态注册的方法：
    external fun getDynmicResult():String

}