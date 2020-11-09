//
// Created by hanlonglin on 2020/11/7.
//

#include <jni.h>
#include <string>
#include <sys/time.h>
#include <stdio.h>
#include <unistd.h>


extern "C"
JNIEXPORT jlong JNICALL
Java_com_example_ndkstudy_jni_Functions_getTimeStampFromNative(JNIEnv *env, jobject thiz) {
    struct timeval tv;
    gettimeofday(&tv, NULL);
    long a = tv.tv_sec * 1000 + tv.tv_usec / 1000;
    return a ;
}