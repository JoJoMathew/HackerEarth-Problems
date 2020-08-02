//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();                // Reading input from STDIN
        StringBuffer newStr=new StringBuffer(input);    

         for(int i = 0; i < input.length(); i++) { 
              
            if(Character.isLowerCase(input.charAt(i))) {      
                newStr.setCharAt(i, Character.toUpperCase(newStr.charAt(i)));  
            } else if(Character.isUpperCase(input.charAt(i))) {       
                newStr.setCharAt(i, Character.toLowerCase(newStr.charAt(i)));    
            } 
         }

        System.out.println(newStr);    // Writing output to STDOUT
    }
}
