/**
 * Created by Mark on 2017/10/30.
 */
//kotlin函数定义的套路
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int, c: Int): Int {
    var result = 0
    if (a - b > 0) result = b else result = a
    return if (result - c > 0) c else result
}

fun main(args: Array<String>) {
    println(max(3, 7))
    println(min(3, 7, 2))
    println(sayHelloToMe("Mark"))
    println(sayHelloToMe(""))
}
fun sayHelloToMe(name:String):String = if(name!=null && name!="") "你好呀！ "+name else "我不说话"
//静态语言不会像python在下面定义的函数上面引用会出错 QAQ
/**
 * 在IDEA中绿色的文档注释我很喜欢
 * 1.与python一样  函数可以在文件中直接定义 不像Java必须在class中
 * 2.Java中参数是类型 形参名 这与C C++一样
 *  不过kotlin中是 形参名 :类型
 * 3.函数返回值类型居然放在参数列表后面，括号结束后用冒号接返回值类型，也是够奇葩的
 * if语句的三元表达式跟python中一样 好棒啊！
 * 4.重点来了：kotlin中的函数分为代码块体和表达式体，以上在{}中写代码并使用return返回值的
 * 形式称为代码块体
 * 将整个代码块替换为表达式用等号与函数签名连接称为表达式体  非常的神奇哦
 * */
