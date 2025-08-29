/*
Write a program to accept the array elements ,position from the user and delete the element at the given position

Input Format:number of elements ,array elements ,position to be deleted



Output Format: updated array

Sample Input :

5
1 2 3 4 5 
6

Sample Output :

Deletion not possible

Sample Input :

10
1 2 3 4 5 6 7 8 9 10
1

Sample Output :

2 3 4 5 6 7 8 9 10

 */


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        if (pos < 1 || pos > n) {
            System.out.println("Deletion not possible.");
        } else {

            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i]);
                if (i < n - 2) {
                    System.out.print(" ");
                }
            }
        }
    }
}
