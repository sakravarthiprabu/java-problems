/*
Write a program to accept a array elements from the user and display the smallest element in the array

Input Format: Accept an array elements from the user

Constraints: nil

Output Format : Display the smallest element in the array

Sample Input :
5
10 20 30 40 50

Sample Output : 10
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
       
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println(min);
    }
}
