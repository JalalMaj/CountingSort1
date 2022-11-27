fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here
    var result = mutableListOf<Int>()
    var count = 0
    var maximum = 0
//    for(i in arr){
//        if(i>maximum){
//            maximum = i
//        }
//    }
   // println(maximum)
    for (i in 0..99) {
        for (j in 0..arr.size-1) {
            if (arr[j] == i) {
                count++
            }
        }
        result.add(i, count)
        count = 0
    }
    //result.add(maximum+1,0)

    //println(result)
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}
