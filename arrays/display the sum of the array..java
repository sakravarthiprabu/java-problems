/*Write a java program to accept the elements into an array and display the sum of the array.

Input Format : Number of elements followed by array as input elements

Constraints : NIL

Output Format : Print the sum of the array elements

Sample Input :
10
1 2 3 4 5 6 7 8 9 10

Sample Output :
55 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum =0;
        int[]a = new int[s];
        for(int i =0 ; i< s ; i++){
            a[i]= sc.nextInt();
            sum = sum+a[i];
        }
       
        System.out.println(sum);
    }
}