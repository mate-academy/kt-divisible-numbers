package mate.academy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class GetDivisibleNumbersTest {

    @Test
    fun getDivisibleNumbers_WithPositiveNumbersAndDivider_ReturnsFilteredArray() {
        // given
        val numbers = intArrayOf(2, 4, 5, 6, 8)
        val divider = 2

        // when
        val result = getDivisibleNumbers(numbers, divider)

        // then
        assertArrayEquals(intArrayOf(2, 4, 6, 8), result)
    }

    @Test
    fun getDivisibleNumbers_WithNegativeNumbersAndDivider_ReturnsEmptyArray() {
        // given
        val numbers = intArrayOf(-2, -4, -6)
        val divider = 2

        // when
        val result = getDivisibleNumbers(numbers, divider)

        // then
        assertArrayEquals(intArrayOf(), result)
    }

    @Test
    fun getDivisibleNumbers_WithMixedNumbersAndDivider_ReturnsFilteredPositiveArray() {
        // given
        val numbers = intArrayOf(-2, 3, 6, 9, -12, 15)
        val divider = 3

        // when
        val result = getDivisibleNumbers(numbers, divider)

        // then
        assertArrayEquals(intArrayOf(3, 6, 9, 15), result)
    }

    @Test
    fun getDivisibleNumbers_WithNoDivisibleNumbers_ReturnsEmptyArray() {
        // given
        val numbers = intArrayOf(1, 3, 5, 7)
        val divider = 2

        // when
        val result = getDivisibleNumbers(numbers, divider)

        // then
        assertArrayEquals(intArrayOf(), result)
    }
}
