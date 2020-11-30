import java.util.Scanner;

public class ABC {

   static char[] sorting(char[] str){

       for(int i=0;i<str.length-1;i++) {
            
            for(int j=i+1;j<str.length;j++) {
            
                
                if(str[i]>str[j]) {
                    
                    char c=str[i];
                    
                    str[i]=str[j];
                    str[j]=c;
                }
            }
        }
	return str;
   }
    static boolean isAnagram(String a, String b) {
        // Complete the function

     a=a.toLowerCase();
        b=b.toLowerCase();
boolean flag=false;
    if(a.length()==b.length()){

        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();

          ch1=  sorting(ch1);
            ch2=sorting(ch2);


            
            // flag=Arrays.equals(ch1, ch2);

            for(int i=0;i<ch1.length;i++){

                for(int j=0;j<ch2.length;j++){

                    if(ch1[i]==ch2[j]){

                        flag=true;
                    }
                }
            }
    }

if(flag){

    return true;
}
      
      return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
