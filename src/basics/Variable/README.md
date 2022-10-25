# basics.Variable 变量

## var 与 val

类比 **JavaScript ES6** 中新增的 *const* 与 *let* 关键字，
直接定义出变 量和常量，而非像 **Java** 语言那样使用 *final* 关键字。

## 类型推断

如果在定义变量的时候，给变量初始化，那么编译器会根据初始化值推断出改变了的类型，
从而简化代码，降低程序员心智负担。

## Code

```scala
package basics.Variable

object Variable {
  def main(args: Array[String]): Unit = {
    val a: Int = 4
    var b: Int = 10
    val c = 20
    b = 20
    println(a + b + c)
  }
}
```