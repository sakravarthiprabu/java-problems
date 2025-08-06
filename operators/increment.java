//Given 2 integer values, print their pre increment and post increment values
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("Pre increment:"+ (++a ) );
        System.out.println("Post increment:"+b++);
        System.out.println("Final values:" + a +" "+ b);

    }
}