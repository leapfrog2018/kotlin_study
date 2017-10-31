/**
 * Created by Mark on 2017/10/30.
 */
package com.baidu.kotlin

import com.baidu.kotlin.Color.*;

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getComment(60))
    println(getComment(90))
    println(getComment(85))
    println(mix(RED, YELLOW))
    println(getMax(2, 3, 7))
}

/*
    1.when表达式，成功匹配之后用->返回值，when表达式中必需穷尽枚举中的值或者加else分支，保证能处理所有情况
    2.when对照Java中的switch,没有break,Java中漏掉break会出现switch穿透，而when不会
    3.想要when在一个分支上合并多个选项，可以将多个选项用逗号跟开 后面用->"returnvalue"
    4.通过import引入Color.*;之后访问枚举属性可以直接用属性名，替代类名.属性名的方式

 */
fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.BLUE -> "Battle"
            Color.ORANGE -> "Of"
            Color.GREEN -> "Gave"
            VIOLET -> "Vain"
            YELLOW -> "York"
        }

fun getComment(score: Int): String =
        when (score) {
            100, 95, 90 -> "优秀"
            85, 80 -> "良好"
            75, 70, 65 -> "还行"
            else -> "岂有此理！"
        }

/*
Java中的switch只能用于匹配字符串、枚举常量、数字字面值
when可以匹配任意对象 、表达式
 */
fun mix(c1: Color, c2: Color) =
        when (setOf<Color>(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            else -> VIOLET
        }

//无参数的when
fun getMax(n1: Int, n2: Int, n3: Int) =
        when {
            (n1 - n2 > 0 && n1 - n3 > 0) -> n1
            (n2 - n1 > 0 && n2 - n3 > 0) -> n2
            else -> n3
        }