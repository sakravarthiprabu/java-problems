/*
Write a program to accept the array and position in which the new element to be inserted from the user and display the array.

Input Format: number of elements , array elements ,element to be inserted, position where insertion should be done

Output Format: Updated array

Sample Input :
10
1 2 3 4 5 6 7 8 9 10
5
2

Sample Output :
1 5 2 3 4 5 6 7 8 9 10

Sample Input :
7
2 3 4 5 6 7 8 
1
8

Sample Output :

2 3 4 5 6 7 8 1

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
       
        int pos = sc.nextInt();
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = element;

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]);
            if (i < n) {
                System.out.print(" ");
            }
        }
    }
}

