@file:JvmName("FizzBuzzProcessor")

package processor

class FizzBuzzProcessor {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val fb = FizzBuzzProcessor()
      for (i in 1..100) {
        println(fb.convert(i))
      }
    }
  }

  fun convert(fizzBuzz: Int): String {
    if (fizzBuzz % 15 == 0) {
      return "FizzBuzz"
    }
    if (fizzBuzz % 3 == 0) {
      return "Fizz"
    }
    return if (fizzBuzz % 5 == 0) {
      "Buzz"
    }
    else fizzBuzz.toString()
  }
}