# 流程控制语句

## 选择语句

近似 *C* 语言

```scala
package basics.Control

object Condition {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 4
    val c = 5
    if (a * a + b * b == c * c) {
      println("直角三角形")
    }
  }
}
```