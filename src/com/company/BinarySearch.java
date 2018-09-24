package com.company;

public class BinarySearch {
    public static int binarySearch(int a[], int x) {
        return binarySearch(a, 0, a.length - 1, x);
    }
    private static int binarySearch(int a[], int left, int right, int x) {


        int mid = (left + right) / 2;

        if (x == a[0]){
            return 0;
        }
        if (x == a[mid]) {
            return (a[mid] == a[mid - 1]) ? binarySearch(a, left, mid - 1, x) : mid;
        }
        if (right < left) {
            return -1;
        }
        if (a[left] < a[mid]) {
            return (x >= a[left] && x < a[mid]) ?
                    binarySearch(a, left, mid - 1, x) : binarySearch(a, mid + 1, right, x);
        } else if (a[mid] < a[left]) {
            return (x > a[mid] && x <= a[right]) ?
                    binarySearch(a, mid + 1, right, x) : binarySearch(a, left, mid - 1, x);
        } else if (a[left] == a[mid]) {
            return  (a[mid] != a[right]) ?
                    binarySearch(a, mid + 1, right, x) : binarySearch(a, left, mid - 1, x);
        }
        return -1;
    }
}
