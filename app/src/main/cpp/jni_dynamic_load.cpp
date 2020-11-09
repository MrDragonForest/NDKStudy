//
// Created by hanlonglin on 2020/11/9.
//


#include <base.h>

#include <jvm.h>

jstring getMessage(JNIEnv* env,jobject jobj){
    return env->NewStringUTF("I am String from Dynamic native");
}

/**
 * 注册native函数
 *
 * @param env
 * @param name
 * @param method
 * @param nMethods
 * @return
 */
int registerNativeMethods(JNIEnv *env,const char *name,JNINativeMethod *method,jint nMethods){

}

JNIEXPORT int JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv *env;
    if (vm->GetEnv(reinterpret_cast<void **>(env), JNI_VERSION_1_6) != JNI_OK) {
        return JNI_FALSE
    }
    env->RegisterNatives()
}