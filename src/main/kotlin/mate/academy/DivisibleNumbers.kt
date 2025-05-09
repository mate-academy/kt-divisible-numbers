package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val resultList = MutableList<Int>(0) {0}
    numbers.forEach {
        if (it > 0 && it % divider == 0) resultList.add(it)
    }
    return resultList.toIntArray()
}

// mentors solution
//  return numbers.filter { it > 0 && it % divider == 0 }.toIntArray()