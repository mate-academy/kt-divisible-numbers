package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
   val list = numbers.asSequence().filter { it >= 0}.filter { it % divider == 0 } .toList()
   return list.toIntArray()
}
