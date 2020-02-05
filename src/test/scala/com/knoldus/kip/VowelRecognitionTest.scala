package com.knoldus.kip

import org.scalatest.flatspec.AnyFlatSpec

import scala.io.Source

class VowelRecognitionTest extends AnyFlatSpec {
  it should "recognize 0 vowels if they are not present" in {
    val noVowelInput = readInputFromFile("src/test/resources/NoVowelInput.txt")
    assert(VowelRecognition.recognizeVowel(noVowelInput) === 0L)
  }

  it should "recognize vowels if they are present" in {
    val vowelInput = readInputFromFile("src/test/resources/VowelInput.txt")
    assert(VowelRecognition.recognizeVowel(vowelInput) === 15530068540170L)
  }

  private def readInputFromFile(fileName: String): String = {
    Source.fromFile(fileName).getLines.toList.head
  }
}
