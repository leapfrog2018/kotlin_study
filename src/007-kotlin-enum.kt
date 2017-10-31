/**
 * Created by Mark on 2017/10/30.
 */
package com.baidu.kotlin

/*
    1.Kotlin中的包类似Java,在文件第一行使用package关键字定义
    2.enum的定义使用enum class
    3.和Java中的枚举一样，可以有属性和方法
    4.enum在自己内部创建自己的实例作为枚举类的属性，结尾必需用分号将属性与方法分开
 */
fun main(args: Array<String>) {
    println(Color.BLUE)
    println(RGB.BLUE.rgb())
}

/**
 * declare a enum
 */
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET
}

enum class RGB(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}



