package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    if (numbers.isEmpty()) {
        return intArrayOf()
    }
    var count = 0;
    for (number in numbers) {
        if (number > 0 && number % divider == 0) {
            count++
        }
    }
    val array = IntArray(count)
    var count1 = 0
    for (i in numbers) {
        if (i > 0 && i % divider == 0) {
            array[count1] = i
            count1++
        }
    }
    return array
}
