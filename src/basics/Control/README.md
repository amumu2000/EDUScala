# 流程控制语句

## if-else 语句

与 *C* 语言语法相同，嵌套 *if - else* 与并列的 *if - else
if - else* 同理，此处不进行实例

```scala
package basics.Control

object Condition {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 4
    val c = 5
    if (a * a + b * b == c * c) {
      println("可以构成直角三角形")
    }
    if (a > b) {
      println("a大于b")
    } else {
      println("a不大于b")
    }
  }
}

```