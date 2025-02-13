fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val nullableList = listOf(1, 2, null, 4, 5)
    val doubledNullableList = nullableList.mapNotNull { it?.let { it * 2 } }
    println(doubledNullableList) // This will print [2, 4, 8, 10]

    //Alternative Solution
    val doubledNullableList2 = nullableList.map { it?.times(2) ?: 0 }
    println(doubledNullableList2) //this will print [2,4,0,8,10]
}