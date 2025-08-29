/*Write a  java program to accept the array and count the number of odd and even numbers in the given array

Input Format: Number of elements followed by array as an input

Constraints: NIL

Output Format: Display the number of Odd and Even numbers in the given array

Sample Input 1:
10
77 67 55 44 25 14 87 95 45 92

Sample Output 1:
Odd = 7
Even = 3
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
        int[]a = new int[s];
        int count=0;
        for(int i =0;i<s;i++){
            a[i]=sc.nextInt();
        if(a[i]%2==0){
            count++;  
            }
        }
         System.out.println("Odd = "+ (s-count));
             System.out.println("Even = " + count);
    }
}