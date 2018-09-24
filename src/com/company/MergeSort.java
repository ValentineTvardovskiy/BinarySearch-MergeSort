package com.company;

public class MergeSort {


    public static void sort(int[] arr) {
        sortArr(arr, 0, arr.length - 1);
    }
    private static void sortArr(int[] arr, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            sortArr(arr, lowerBound, mid);
            sortArr(arr, mid + 1, upperBound);
            merge(arr, lowerBound, mid, upperBound);
        }
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int counter = start + 1;
        int len = end - counter;
        int cursor = 0;

        if (arr[mid] <= arr[mid + 1]) {
            return;
        }
        for (int i = 0; i <= len; i++) {
            if (arr[cursor] > arr[counter]) {
                arr[counter] += arr[cursor];
                arr[cursor] = arr[counter] - arr[cursor];
                arr[counter] -= arr[cursor];

                cursor = counter;
            }
            if (counter == end) {
                if (arr[cursor] == arr[start]) {
                    start++;
                }
                cursor = start;
                counter = start;
                i = 0;
            }
            if (start >= end) {
                return;
            }
            counter++;
        }

    }
}
