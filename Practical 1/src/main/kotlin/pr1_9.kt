fun findmax(a:Array<Int>) {
    var max = a[0]
    var count = 0
    for (i in a) {
        println("ar[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is:")
    println(max)
}
fun main()
{
    var a = arrayOf(70, 66, 46, 83, 20, 99)
    findmax(a)

}