fun main() {
    fun getUserName(username: String): String {
        return username
    }

    val username = getUserName("Rijal Arfani")
    println(username)

    // one expression
    fun getName(fullName: String): String = fullName
    var fullName: String = getName("Arfani Rijal")
    println(fullName)


    //Named argument function
    fun getFullName(first: String, last: String): String {
        return "$first $last"
    }
    println(getFullName(first = "Mohamad Rijal", last = "Arfani"))

    //Default argument
    fun getAddress(addres: String = "Tegal"): String {
        return addres
    }
}