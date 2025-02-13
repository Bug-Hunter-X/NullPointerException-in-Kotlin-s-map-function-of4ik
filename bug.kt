fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    //This will print [2, 4, 6, 8, 10]

    val nullableList = listOf(1, 2, null, 4, 5)
    val doubledNullableList = nullableList.map { it * 2 }
    println(doubledNullableList) //this will result in an error
}