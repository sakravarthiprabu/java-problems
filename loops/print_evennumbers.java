import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for( int i =n1 ; i<=n2; i++){
            if(i %2 ==0){
                System.out.print(i+" ");
            }
            
        }
        
    }
}