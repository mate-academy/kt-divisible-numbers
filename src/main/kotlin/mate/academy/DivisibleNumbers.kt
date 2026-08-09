package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray = numbers
    .filter { it > 0 && it % divider == 0 }
    .toIntArray()
