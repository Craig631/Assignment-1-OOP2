
package baf;

import java.util.Scanner;

/**
 *
 * @author dizne
 */
public class BAF {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner BAF = new Scanner(System.in);
System.out.print("Enter Country code=");
char code=BAF.next().charAt(0);
if ((code=='K') || (code=='k'))
System.out.println("Kenya-Highly talented sportsmen");
else if ((code=='I') || (code=='i'))
 System.out.println("India-Sporting affected by their culture");
 else if ((code=='U') || (code=='u'))
  System.out.println("United States-Good in short races");
  else if ((code=='N') || (code=='n'))
System.out.println("Nigeria-Give a good attempt in short races");
else
      System.out.println("All other Countries-General performance is low");

    }
    
}
