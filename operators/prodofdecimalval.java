//Multiply two decimals and print the product with a precision of 2 decimal places .

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        double pro = a*b;
        System.out.printf("%.2f",pro);
    }
}