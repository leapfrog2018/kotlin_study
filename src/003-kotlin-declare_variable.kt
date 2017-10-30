/**
 * 定义变量
 * Created by Mark on 2017/10/30.
 */
fun main(args: Array<String>) {
    var age: Int = 18
    var name:String
    val sleep:Int
    sleep =10086
    name="Mark"
    println(age)
    println(name)
}
/*
### kotlin中的变量定义
套路是：关键字 变量标识符：类型 = 值
需要注意的是：如果定义变量的时候赋了初始值，因为类型推导机制的存在，类型可以省略
但是如果没有初始值，类型必须有

### 变量定义的关键字
1. val-->value  不可变引用 相当于Java中的final变量 赋值之后不能再修改
2. var-->variable 可变引用 这个跟JavaScript一样了呢 类似Java中的非final变量

### 注意
1. kotlin中推荐多使用val,仅在必要的时候用var
2. val声明的变量与Java中final变量有个很大的区别，Java中final常量声明必须赋值kotin中却不必
3. val变量如果是引用类型,引用不可变而该引用指向的对象却是可变的
4. var声明的变量值是可变的 但是类型不可变


*/