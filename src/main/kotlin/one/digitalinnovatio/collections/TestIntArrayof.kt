package one.digitalinnovatio.collections

  fun main() {
      val values = intArrayOf(2, 3, 4, 1, 11, 7)
 values.forEach {
     println(it)
 }

      println("..................")
      values.sort()
      values.forEach {
          println(it)
      }
}