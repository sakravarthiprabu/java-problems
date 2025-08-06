//Find the greatest prime factor of given number.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n , i=2 , LF =0;
        n =sc.nextLong();
        while(n!=1){
                if(n%i==0){
                    LF=i;
                    n=n/i;
                }
              else{
                i++;
                }
            }
           System.out.println(LF);
           
        }
        
    }
