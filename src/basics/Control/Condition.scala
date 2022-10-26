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
