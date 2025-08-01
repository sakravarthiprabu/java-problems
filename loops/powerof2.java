import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) { 
        Scanner sc  = new Scanner(System.in);
        int n, p = 2, flag =0 ;
        n = sc.nextInt();
        while ( n >= p){
            if( n== p){
                flag =1;
            }
            p=p*2;
        }
        if( flag == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}