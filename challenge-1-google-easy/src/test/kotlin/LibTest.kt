import Lib.canAdd
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


internal class LibTest {
    val k = 17
    val arraySizeGreaterThanTwoTrue = arrayOf(10, 15, 3, 7)
    val arraySizeGreaterThanTwoFalse = arrayOf(10, 15, 3, 17)
    val arraySizeGreaterThanTwoSumInsideTrue = arrayOf(15, 10, 7, 3 )
    val arraySizeLesserThanTwoFalse = arrayOf(10)
    val arraySizeTwoFalse = arrayOf(10,2)
    val arraySizeTwoTrue = arrayOf(10,7)
    val arrayEmptyFalse = emptyArray<Int>()

    @Test
    fun array_size_greater_than_two_should_be_true() {
        assertTrue(canAdd(arraySizeGreaterThanTwoTrue, k))
    }

    @Test
    fun array_size_greater_than_two_sum_inside_should_be_true() {
        assertTrue(canAdd(arraySizeGreaterThanTwoSumInsideTrue, k))
    }

    @Test
    fun array_size_greater_than_two_should_be_false() {
        assertFalse(canAdd(arraySizeGreaterThanTwoFalse, k))
    }

    @Test
    fun array_size_lesser_than_two_should_be_false() {
        assertFalse(canAdd(arraySizeLesserThanTwoFalse, k))
    }

    @Test
    fun array_size_two_should_be_false() {
        assertFalse(canAdd(arraySizeTwoFalse, k))
    }

    @Test
    fun array_size_two_should_be_true() {
        assertTrue(canAdd(arraySizeTwoTrue, k))
    }

    @Test
    fun array_empty_size_should_be_false() {
        assertFalse(canAdd(arrayEmptyFalse, k))
    }
}