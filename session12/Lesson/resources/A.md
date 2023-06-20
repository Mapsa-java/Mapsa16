###   Big O notation

-------------------------------------

Big O notation is used to analyze the time complexity and space complexity of algorithms.
It allows us to understand how the runtime and memory requirements of an algorithm scale as the input size increases.


O(1) :

```java
public void printFirstElement(int[] arr) {
        if (arr.length > 0) {
        System.out.println(arr[0]);
        }
        }
```

O(n) - Linear Time Complexity:

```java
public void printArrayElements(int[] arr) {
    for (int num : arr) {
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
    }
}

```


O(n^2) - Quadratic Time Complexity:

```java
public void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}

```


O(log n) - Logarithmic Time Complexity:

```java
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}

```

This method performs binary search on a sorted array to find the target value. It divides the search space in half at each step, resulting in a logarithmic number of iterations. Thus, it has a time complexity of O(log n).