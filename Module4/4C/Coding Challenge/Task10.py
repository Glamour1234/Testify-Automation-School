#Create a function that filters out negative numbers

def filterNegative(arr):
#Create a new array to store only positive numbers
    newArr = []

#Now traverse the array arr, and push positive element in newArr.
    for i in range(0, len(arr)):
        if(arr[i] >= 0):
            newArr.append(arr[i])

    for i in range(0, len(newArr)):
#Return newArr as the answer.
        print(newArr[i], end=' ')


numbers = [12, 13, -15, -8, 21]
filterNegative(numbers)
