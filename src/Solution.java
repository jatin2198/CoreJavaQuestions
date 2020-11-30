import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A="Hello";//sc.next();
        String B="Java";//sc.next();
        /* Enter your code here. Print output to STDOUT. */
        Solution sol=new Solution();
        sol.mulOp(A, B);
    }




public void mulOp(String A,String B){

 A=A.toLowerCase();
 B=B.toLowerCase();

int a=A.length();

int b=B.length();

System.out.println(a+b);

int temp=A.compareTo(B);
if(temp<0){
    System.out.println("No");
}

else{
    System.out.println("Yes");
}

String str=A.substring(0,1).toUpperCase()+A.substring(1,A.length());
String Str2=B.substring(0,1).toUpperCase()+B.substring(1,B.length());
System.out.println(str);
System.out.println(Str2);
//System.out.println(B.substring(0).toUpperCase()+B.substring(1,B.length()));
}
}