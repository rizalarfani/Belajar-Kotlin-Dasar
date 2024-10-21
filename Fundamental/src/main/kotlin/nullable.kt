fun main() {
    val text: String? = null
    if(text != null){
        println(text.length)
    }

    //safe calls operator
    println(text?.length)
    //Elvis operator
    println(text?.length ?: 0)
    //non-null assertion
    println(text!!.length)
}