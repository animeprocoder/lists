fun main(){
    val colors = listOf("blue", "red", "blue", "green")
    println( colors.size ) //4
    println(colors.contains("red")) //True
    println(colors.contains("acticacna")) //False
    val Thenewcolors = listOf("red", "blue")
    println(colors.containsAll(Thenewcolors)) // True
    println(colors.indexOf("blue"))//0
    
}