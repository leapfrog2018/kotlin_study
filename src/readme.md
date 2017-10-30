先复习一下markdown语法
标题：#  1-6级标题
列表：
    无序列表 - xxx
    有序列表 1. xxx
超链接：[百度]（www.baidu.com）
图片：![我是图片](图片地址)
引用：  > 子曰：学而时习之，不亦乐乎？
星号的作用：1个*是斜体  2个*是加粗
代码块：```  ```
表格：

### 表格
|任务|学习Java|学习kotlin|
| ----:|------:|:----|
|sf   | fff    |ddd  |

---
好了 现在开始kotlin

### kotlin hello world 
```
fun main(args:Array<String>){
    println("Hello World!")
}
```    
- 可以看到，与Java有一小点像，不过有很大不同
- fun main 这样定义函数有点脚本语言的感觉，像是JavaScript、python
- main函数的参数，和Java一样需要一个字符串数组，只不过写法不同了，像C语言main函数就无参数
- main方法的参数args是形参，可以换成其他合法标识符
- 控制台输出语句没什么好说的，但是有一点成功引起了我的注意，那就是结尾没有分号';'
这有点意思，习惯了python之后写Java被这种结尾分号折磨得欲仙欲死的，kotlin就没这烦恼了，不过为
了兼容Java，加了分号也是可以执行的


