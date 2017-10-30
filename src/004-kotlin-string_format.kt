/**
 * kotlin中的字符串格式化
 * Created by Mark on 2017/10/30.
 */
fun main(args:Array<String>){
    val name = if (args.size>0) args[0] else "Kotlin"
    println("Hello,$name")
    println("Hello,${args[0]}")
    println("Hello,${if (args.size>0) args[0] else "java"}")
}
/*
1. 字符串格式化使用$引用变量，表达式
2. 引用变量直接 $变量  而表达式需要  ${表达式}
3. 表达式中使用的双引号跟外面字符串双引号不冲突
4. $如果想在字符串中使用需要转义  \$

 */