### Daily Coding Problem: Problem #1 [Easy] Google

Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

source: https://www.dailycodingproblem.com/



### Analyzing the steps

if we run trough the array with a index i starting from 0
```kotlin
i = 0  -> a[i] + a[i +1] == k || a[i] + a[i+2] == k || a[i] + a[i + 3] == k
i = 1  -> a[i] + a[i +1] == k || a[i] + a[i+2] == k
i = 2  -> a[i] + a[i +1] == k
```

### Verification 

* The array size should not be lesser than two, otherwise there is no how to sum two numbers


Note that the second operator of the sum can be alwasy i + 1
If we call it an index j, should be started with i + 1

```kotlin
  
  var i = 0
  while(i <= arraySize -1) {
		var j = i + 1
		while(j <= arraySize -1){
			//Checks if sum is equal to k
			if(array[i] + array[j] == k)
				return true
				
			j++	
		}
		i++
  }
```
Also the code above can be done with only one iteration, and moving i and j together until 

```kotlin
var i = arraySize - 2  //last index - 1
var j = arraySize - 1 //last index
```

```kotlin

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
	
```

### Unit Tests

* assert canAdd([10, 7], 17) = true
* assert canAdd([10, 15, 3, 7], 17) = true
* assert canAdd([10, 15, 3, 1], 17) = false
* assert canAdd([any], any) = false
* assert canAdd([], any) = false


