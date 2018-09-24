package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = { 5,6,9,10,15,1,3,4 };
        int[] b = { 5,5,1,3,4,5,5,5,5 };
        int[] c = { 1,2,3,3,4,4,4,4,4 };

        BinarySearch search = new BinarySearch();
        MergeSort mergeSort = new MergeSort();

        System.out.println(search.binarySearch(a, 5));
        System.out.println(search.binarySearch(a, 1));
        System.out.println(search.binarySearch(a, 4));
        System.out.println(search.binarySearch(a, 3));
        System.out.println(search.binarySearch(a, 8));
        System.out.println();
        System.out.println(search.binarySearch(b, 5));
        System.out.println(search.binarySearch(b, 3));
        System.out.println();
        System.out.println(search.binarySearch(c, 3));
        System.out.println(search.binarySearch(c, 2));

        int[] z = {7, 3, 18, 10, 9, 24, 17, 46, 32};
        mergeSort.sort(z);
        System.out.println(Arrays.toString(z));

    }


}
