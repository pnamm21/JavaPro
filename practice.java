package _2023_05_25;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        practice test = new practice();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {23, 6, -78, 4, 6, 3, 43, -2, -34};
        int[] arr2 = {6, 5, 4, 3, 2, 1};
        int[] arr3 = {2, 4, 1, 5, 3, 6};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"mama", "road", "write"};
        Integer[] array = {2, 66, 3, 4, 2, 2, 75, 3, 45, 2, 9, 0, -12, -23, 123};

//        findSummaAllElem(arr);
//        System.out.println(findAverage(arr1));
//        findTheSmallestNumber(arr1);
//        findTheBiggestNumber(arr1);
//        countAmountOfEvenNumber(arr);
//        countNumbers(arr1,6);
//        System.out.println(checkNumberInArray(arr1, 6));
//        System.out.println(findSecondLargest(arr));
//        System.out.println(checkMassive(arr));
//        System.out.println(checkMassive(arr1));
//        System.out.println(checkMassiveGoUpOrDown(arr));
//        System.out.println(checkMassiveGoUpOrDown(arr2));
//        System.out.println(checkMassiveGoUpOrDown(arr3));
//        deleteNumberFromArray(array);
//        findSumAllElemAtEvenPosition(arr4);
//        findMultiplicationAllOddPosition(arr4);
//        findTheSmallestDifference(arr);
//        findTheSmallestDifference(arr1);
//        System.out.println(checkArrayHasSubArray(arr4, 20));
//        System.out.println(checkArrayHasSubArray(arr4, 50));
//        System.out.println(checkArrayHasSubArrayMulti(arr4,3840));
//        System.out.println(checkArrayHasSubArrayMulti(arr4,30));

    }

    //Найти сумму всех элементов в массиве.
    public static void findSummaAllElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Summa:" + sum);
    }

    //Найти среднее значение элементов в массиве.
    public static int findAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

    //Найти наименьший элемент в массиве.
    public static void findTheSmallestNumber(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The Smallest Number is " + min);
    }

    //Найти наибольший элемент в массиве.
    public static void findTheBiggestNumber(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The Biggest Number is " + max);
    }

    //Посчитать количество четных элементов в массиве.
    public static void countAmountOfEvenNumber(int[] arr) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                even++;
            }
        }
        System.out.println("Amount of even Number:" + even);
    }

    //Посчитать количество элементов, больших заданного числа.
    public static void countNumbers(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                count++;
            }
        }
        System.out.println("" + count);
    }

    //Проверить, содержит ли массив заданное число.
    public static boolean checkNumberInArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    //    Найти второй наибольший элемент в массиве.
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    //Проверить, является ли массив возрастающей последовательностью.
    public static boolean checkMassive(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //Проверить, является ли массив строго монотонным
    // (возрастающим или убывающим).
    public static boolean checkMassiveGoUpOrDown(int[] arr) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                inc = false;
            }
            if (arr[i] > arr[i - 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

    //Удалить из массива все повторяющиеся элементы.
    public static void deleteNumberFromArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
        // Удаление повторяющихся элементов
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].equals(array[j])) {
                    // Перемещение повторяющегося элемента в конец массива
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }

        // Создание нового массива без повторяющихся элементов
        Integer[] resultArray = Arrays.copyOf(array, array.length);
        for (Integer element : resultArray) {
            System.out.print(element + " ");
        }
    }

    //Найти сумму элементов на четных позициях (индексах) в массиве.
    public static void findSumAllElemAtEvenPosition(int[] arr) {
        int sum = 0;
        System.out.println("At the Even position");
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.println("Summa элементов на четных позициях:" + sum);
    }

    //Найти произведение элементов на нечетных позициях (индексах) в массиве.
    public static void findMultiplicationAllOddPosition(int[] arr) {
        int multi = 1;
        System.out.println("At the Odd position");
        for (int i = 1; i < arr.length; i += 2) {
            multi = arr[i] * multi;
        }
        System.out.println("Произведение элементов на нечетных позициях: " + multi);
    }

    //Найти наименьшую разность между двумя элементами в массиве
    public static void findTheSmallestDifference(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int difference = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            difference = arr[i] - arr[arr.length - i - 1];
        }
        System.out.println("The smallest difference between two numbers:" + difference);
    }

    //Проверить, существует ли в массиве подмассив
    // (подпоследовательность) с заданной суммой.
    public static boolean checkArrayHasSubArraySum(int[] arr, int targetMulti) {
        int currentMulti = 0;
        for (int i = 0; i < arr.length; i++) {
            currentMulti = arr[i];
            if (currentMulti == targetMulti) {
                return true;
            }
            for (int j = i + 1; j < arr.length; j++) {
                currentMulti *= arr[j];
                if (currentMulti == targetMulti) {
                    return true;
                }
            }
        }
        return false;
    }

    //Проверить, существует ли в массиве подмассив с заданным произведением.
    public static boolean checkArrayHasSubArrayMulti(int[] arr, int targetSum) {
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = arr[i];
            if (currentSum == targetSum) {
                return true;
            }
            for (int j = i + 1; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }
}
