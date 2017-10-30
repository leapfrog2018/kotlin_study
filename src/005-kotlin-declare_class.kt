/**
 * 类和属性
 * Created by Mark on 2017/10/30.
 */
fun main(args: Array<String>) {
    val boy = Boy("Mark")
    println(boy)
    boy.name = "周杰伦";
    println(boy.name)
    val girl = Girl("小泽", "F", 23)
    println(girl.isAdult)
    println(girl.service(100.3))
}
/*
1. 在kotlin中直接使用Java代码定义的类 用对象.属性底层是调用getter方法
给属性赋值相当于调setter方法
2. 在Java中也可以直接调用kotlin中的代码
3. kotlin中定义类的套路：class 类名(val/var 属性:类型,...)  底层会根据val/var来生成
不同的getter/setter，如var name-->getName,setName val name则只用getName
 需要注意的是：isOk这样的值-->getter=isOk setter=setOk
 4. kotlin中创建对象不用new关键字
 */
/**
 * 自定义转换器  根据年龄判断girl是否成年
 */
class Girl(var name: String, var cupSzie: String, var age: Int) {
    val isAdult: Boolean
        get() {
            return age >= 18
        }
    fun service(money:Double):String = if (money>1000) "rich man" else "poor guy"
}