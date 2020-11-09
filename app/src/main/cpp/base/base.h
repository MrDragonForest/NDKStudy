//
// Created by hanlonglin on 2020/11/9.
//

#ifndef NDKSTUDY_BASE_H
#define NDKSTUDY_BASE_H

#include <android/log.h>

#include <jni.h>

#define LOG_TAG "NDK_STUDY"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN,LOG_TAG,__VA_ARGS__)
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG,LOG_TAG,__VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_EROR,LOG_TAG,__VA_ARGS__)

#endif //NDKSTUDY_BASE_H
