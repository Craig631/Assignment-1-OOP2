
package zetech;
import java.util.Scanner;

public class Zetech {

    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner BBIT = new Scanner(System.in);
    System.out.println("Enter rank=");
    int rank;
    rank=BBIT.nextInt();
    if(rank==1)
    System.out.println("Amount=ksh 1000000");  
    else if(rank==2)
    System.out.println("Amount=ksh 500000");
    else if(rank==3)
    System.out.println("Amount=ksh 250000");
    else
    System.out.println("Amount=ksh 0");

    }
    
}
