/*  Write a java program to accept the array from the user and print the array from left to right

Input Format: Number of elements followed by array as input elements

Constraints: NIL

Output Format :Print the array elements

Sample Input :
10
1 2 3 4 5 6 7 8 9 10

Sample Output : 1 2 3 4 5 6 7 8 9 10 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        int[]a = new int[s];
        for(int i =0; i<s;i++){
            a[i] = sc.nextInt();
            System.out.print(a[i]+" ");
        }
        
    }
}