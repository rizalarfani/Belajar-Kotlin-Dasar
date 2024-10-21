fun main() {

    val textString = "Dicoding"
    println(textString[3])

    for (char in textString){
        print(char)
    }

    println()

    //Escaped String
    val statment = "Kotlin is \"Awasome\""
    println(statment)

    //Raw String
    val line = """
        Saya
        adalah
        seorang
        programmer
        poltek harber
    """.trimIndent()

    println(line)
}