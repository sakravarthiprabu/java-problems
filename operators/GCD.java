//Find a GCD of given two numbers.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        while( b!=0){
            int temp = b;
            b = a%b;
            a = temp;
            }
         System.out.println("GCD of two number is "+a);
    }
}

