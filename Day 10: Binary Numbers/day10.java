import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static void mod(int n){
        int count = 0;
        int max = 0;
        int s=0;
        while (n>0){
            s = n%2;
            n = n/2;
            //System.out.println(s);
            if (s==1){
                count++;
                if(count>=max){
                  max = count;  
                }
            }else{
                count=0;
            }
        }
        System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        mod(n);
        scanner.close();
    }
}