package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = { 5,6,9,10,15,1,3,4 };
        int[] b = { 5,5,1,3,4,5,5,5,5 };
        int[] c = { 1,2,3,3,4,4,4,4,4 };

        System.out.println(search(a, 5));
        System.out.println(search(a, 1));
        System.out.println(search(a, 4));
        System.out.println(search(a, 3));
        System.out.println(search(a, 8));
        System.out.println();
        System.out.println(search(b, 5));
        System.out.println(search(b, 3));
        System.out.println();
        System.out.println(search(c, 3));
        System.out.println(search(c, 2));


    }

    public static int search(int a[], int x) {
        return search(a, 0, a.length - 1, x);
    }


    public static int search(int a[], int left, int right, int x) {
        int mid = (left + right) / 2;

        if (x == a[0]){
            return 0;
        }
        if (x == a[mid]) {
            return (a[mid] == a[mid - 1]) ? search(a, left, mid - 1, x) : mid;
        }
        if (right < left) {
            return -1;
        }

        if (a[left] < a[mid]) {
            return (x >= a[left] && x < a[mid]) ?
                    search(a, left, mid - 1, x) : search(a, mid + 1, right, x);
        } else if (a[mid] < a[left]) {
            return (x > a[mid] && x <= a[right]) ?
                    search(a, mid + 1, right, x) : search(a, left, mid - 1, x);
        } else if (a[left] == a[mid]) {
            return  (a[mid] != a[right]) ?
                    search(a, mid + 1, right, x) : search(a, left, mid - 1, x);
        }
        return -1;
    }
}
