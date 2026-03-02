package mate.academy

const val ZERO = 0

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val divisibleNumbers = mutableListOf<Int>()
    for (i in ZERO..(numbers.size - 1)) {
        if (numbers[i] > ZERO && numbers[i] % divider == 0) {
           divisibleNumbers.add(numbers[i])
        }
    }
    return divisibleNumbers.toIntArray()
}
