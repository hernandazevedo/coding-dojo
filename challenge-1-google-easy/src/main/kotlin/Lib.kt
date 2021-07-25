
object Lib {
    /**
     * Returns true whether any two numbers from the list add up to k otherwise returns false
     * @param array The array to check
     * @param k the sum of any combinantion of two elements
     */
    fun canAdd(array: Array<Int>, k: Int): Boolean {

        var leftOperandIndex = 0
        var rightOperandIndex = leftOperandIndex + 1
        var arraySize = array.size
        var lastLeftOperandIndex = arraySize - 2
        var lastRightOperandIndex = arraySize - 1

        while (leftOperandIndex <= lastLeftOperandIndex && rightOperandIndex <= lastRightOperandIndex) {
            if (checkIfSumsIsEqualTo(array, leftOperandIndex, rightOperandIndex, k)) {
                return true
            }

            if(rightOperandIndex == lastRightOperandIndex) {
                leftOperandIndex++
                rightOperandIndex = leftOperandIndex + 1
            } else {
                rightOperandIndex++
            }
        }

        return false
    }

    private fun checkIfSumsIsEqualTo(
        array: Array<Int>,
        leftOperandIndex: Int,
        rightOperandIndex: Int,
        k: Int
    ) = array[leftOperandIndex] + array[rightOperandIndex] == k
}

