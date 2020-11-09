

#指定cmake的最小支持版本
cmake_minimum_required(VERSION 3.4.1)

#添加动态库
add_library(
        native_lib
        SHARED
        functions.cpp
)

add_library(
        dynamic-lib
        SHARED
        jni_dynamic_load.cpp
)

target_link_libraries(
        dynamic-lib
        log
)

include_directories(${CMAKE_SOURCE_DIR}/base/)


