
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
        String str = "";
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();                // Reading input from STDIN
        int i = Integer.parseInt(line)*2;
        
        // Write your code here
        while ((line = br.readLine()) != null) {
            str += line + " ";
        }

        System.out.println(i + "\n" + str);    // Writing output to STDOUT

    }
}
