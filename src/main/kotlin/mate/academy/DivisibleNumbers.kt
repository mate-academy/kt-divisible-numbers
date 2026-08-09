package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter { e -> e % divider == 0 && e > 0 }.toIntArray()
}
