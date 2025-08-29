/*
Write a java program to accept the elements into an array and display the array from right to left

Input Format :  Number of elements followed by array as an input

Constraints: NIL

Output Format : Print the array elements after modification

Sample Input :

10
1 2 3 4 5 6 7 8 9 10

Sample Output :
10 9 8 7 6 5 4 3 2 1
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt(); 
         }
        for(int i = n-1 ; i >=0 ; i-- ){
            System.out.print(a[i]+" ");
        }
    }
    
}
