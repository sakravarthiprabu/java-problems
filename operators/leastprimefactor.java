//Find the least prime factor of a given number.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n , i=2;
        n =sc.nextLong();
        while(n!=1){
            if(n%i==0){
                System.out.println(i+ " ");
                break;
            }
            i++;
           
        }
        
    }
}