package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    require(divider != 0) {"Divider cannot be zero"}
    return numbers
        .filter {it > 0 && it % divider == 0}
        .toIntArray()
}
