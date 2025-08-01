import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a , b , c=2;
        a = sc. nextInt();
        b = sc.nextInt();
        while(true){
            if(c%a==0&&c%b==0){
                break;
            }
            c++;
        }
        System.out.println(c);
    }
}