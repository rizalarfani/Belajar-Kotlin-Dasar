fun main() {
    // int(32 bit)
    val intNumber = 100
    // int(64 bit)
    val longNumber: Long = 100L
    // Double
    val doubleNumber: Double = 3.45

    println(intNumber)
    println(longNumber)
    println(doubleNumber)

    // Konfersi tipe Data
    val byteNumber: Byte = 25
    val convertByteToInt = byteNumber.toInt()
    print(convertByteToInt)
}