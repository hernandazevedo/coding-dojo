import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


internal class MainTest {
    val k = 17
    val arraySizeGreaterThanTwoTrue = arrayOf(10, 15, 3, 7)
    val arraySizeGreaterThanTwoFalse = arrayOf(10, 15, 3, 17)
    val arraySizeLesserThanTwoFalse = arrayOf(10)
    val arraySizeTwoFalse = arrayOf(10,2)
    val arraySizeTwoTrue = arrayOf(10,7)
    val arrayEmptyFalse = emptyArray<Int>()

    @Test
    fun array_size_greater_than_two_should_be_true() {
        assertTrue(Main.canAdd(arraySizeGreaterThanTwoTrue, k))
    }

    @Test
    fun array_size_greater_than_two_should_be_false() {
        assertFalse(Main.canAdd(arraySizeGreaterThanTwoFalse, k))
    }

    @Test
    fun array_size_lesser_than_two_should_be_false() {
        assertFalse(Main.canAdd(arraySizeLesserThanTwoFalse, k))
    }

    @Test
    fun array_size_two_should_be_false() {
        assertFalse(Main.canAdd(arraySizeTwoFalse, k))
    }

    @Test
    fun array_size_two_should_be_true() {
        assertTrue(Main.canAdd(arraySizeTwoTrue, k))
    }

    @Test
    fun array_empty_size_should_be_false() {
        assertFalse(Main.canAdd(arrayEmptyFalse, k))
    }
}