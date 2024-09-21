import java.io.*;
import java.util.*;

public class Solution {
    public static String toReverse(String text){
        String result="";

        for(int i=text.length()-1;i>=0;i--)
        {
            result+=text.charAt(i);
        }
        
        return result;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        A = A.toLowerCase();
        

        String reverseA=Solution.toReverse(A);
       
       

        if (A.equals(reverseA)) {
           
            System.out.println("Yes");
        }else{
           
            System.out.println("No");
        }
        
        // System.out.println(Solution.toReverse(A));


    }
}



