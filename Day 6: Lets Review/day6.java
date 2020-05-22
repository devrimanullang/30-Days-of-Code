import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void tes(String S){
        String kata="";
        String kita="";
        char[] Sar = S.toCharArray();
        for(int i = 0; i<S.length();i++){
            if (i%2==0){
                kata+=Sar[i];
            }else{
                kita+=Sar[i];
            }
        }
        System.out.println(kata+" "+kita);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String S = sc.next();
            tes(S);
            T--;            
        }
    }
}