
object Main {
    fun canAdd(array: Array<Int>, k: Int): Boolean {

        var i = 0
        while (i <= array.size - 1) {
            var j = i + 1
            while (j <= array.size - 1) {
                if (array[i] + array[j] == k) {
                    return true
                }
                j++
            }
            i++
        }

        return false
    }
}

