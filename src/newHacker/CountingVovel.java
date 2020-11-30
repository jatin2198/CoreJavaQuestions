package newHacker;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String findSubstring(String s, int k) {
    // Write your code here
    
    String temp=s;
    
    int K=k;
    
    char[] vovel=new char[]{'a','e','i','o','u'};
    String str="";
     
     HashMap<Integer,String> getstr=new HashMap<>();
    for(int i=0;i<K-1;i++){
        
       
       str=str.substring(i, K+i);
        
        int count=0;
        for(int j=0;j<str.length();j++){
            
            for(int f=0;f<vovel.length;f++){
                
                if(str.charAt(j)==vovel[f]){
                    
                    count++;
                }
            }
            
           
        }getstr.put(count, str);
         
        
    }
    
    int keyp=Collections.max(getstr.keySet());
    
    String sunvalue=getstr.get(keyp);
    
    return sunvalue;

    }

}

public class CountingVovel {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:\\Users\\Admin\\Desktop\\JatinUpdated\\result.txt")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.findSubstring(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
