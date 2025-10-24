package mate.academy
private const val EVEN_REMAINDER = 0
// Реалізувати функцію для повернення масиву
// лише з додатними числами, які діляться на `дільник` без ділення

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val result = numbers.filter { number -> number > EVEN_REMAINDER
            && number > EVEN_REMAINDER && number % divider == EVEN_REMAINDER
    }
    return result.toIntArray()

}
