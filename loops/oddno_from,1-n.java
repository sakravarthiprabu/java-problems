import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        for( int i =1 ; i <= n; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}