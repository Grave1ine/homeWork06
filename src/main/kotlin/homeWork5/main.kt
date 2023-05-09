package homeWork5

fun main() {

    println( time {  for (i in 0..1000){
        println("слова слова слова")} } )

}

inline fun time(name: () -> Unit): Long{
    val first = System.currentTimeMillis()
    name()
    return System.currentTimeMillis() - first
}