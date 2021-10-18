import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int counter=1;
        while(scanner.hasNextLine()){
            String new_val=scanner.nextLine();
            System.out.println(counter + " " + new_val);
            counter++;
        }
    }
}
