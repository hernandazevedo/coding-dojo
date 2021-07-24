
object Lib {
    /**
     * Returns true whether any two numbers from the list add up to k otherwise returns false
     * @param array The array to check
     * @param k the sum of any combinantion of two elements
     */
    fun canAdd(array: Array<Int>, k: Int): Boolean {

        var i = 0
        while (i <= array.size - 1) {
            var j = i + 1
            while (j <= array.size - 1) {
                if (checkIfSumsIsEqualTo(array, i, j, k)) {
                    return true
                }
                j++
            }
            i++
        }

        return false
    }

    private fun checkIfSumsIsEqualTo(
        array: Array<Int>,
        i: Int,
        j: Int,
        k: Int
    ) = array[i] + array[j] == k
}

