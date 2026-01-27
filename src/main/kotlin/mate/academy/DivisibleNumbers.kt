package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter {it > 0 && it % divider == 0}.toIntArray()
}

fun main() {
    val result = intArrayOf(2, 76, 9, 1, 98, 67, 55)
    println(getDivisibleNumbers(result, 2).contentToString())
}
