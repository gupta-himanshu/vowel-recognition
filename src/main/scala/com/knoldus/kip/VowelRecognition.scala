package com.knoldus.kip

import scala.io.StdIn

object VowelRecognition extends App {
  val stringToBeChecked = StdIn.readLine()

  println(recognizeVowel(stringToBeChecked))

  def recognizeVowel(stringToBeChecked: String): Long = {
    // Tail Recursion
    def calculateVowelSum(stringToBeChecked: String, vowelSum: Long, idx: Int): Long =
      if (idx < stringToBeChecked.length()) {
        stringToBeChecked(idx) match {
          case 'a' | 'e' | 'i' | 'o' | 'u' | 'A' | 'E' | 'I' | 'O' | 'U' => calculateVowelSum(stringToBeChecked,
            vowelSum + ((stringToBeChecked.length() - idx).toLong * (idx + 1)), idx + 1)
          case _ => calculateVowelSum(stringToBeChecked, vowelSum, idx + 1)
        }
      } else {
        vowelSum
      }

    calculateVowelSum(stringToBeChecked, 0L, 0)
  }
}
