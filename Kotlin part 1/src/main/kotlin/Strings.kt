fun main() {
    val wordOne = "Modern"
    val wordTwo = "Concise"
    val wordThree = "Pragmatic"
    val wordFour = "Safe"

  val baris = """
      Kotlin is $wordOne
      Kotlin is $wordTwo
      Kotlin is $wordThree
      Kotlin is $wordFour
      """.trimIndent()
    print(baris)
}