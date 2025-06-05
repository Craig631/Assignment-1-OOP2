
package bbit;

import java.util.Scanner;
public class BBIT {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner BBIT = new Scanner(System.in);
    System.out.println("Enter rank=");
    int rank;
    rank=BBIT.nextInt();
    switch(rank)
    {
    case 1:System.out.println("Amount=ksh 1000000");  
           break;
    case 2:System.out.println("Amount=ksh 500000");  
           break;
    case 3:System.out.println("Amount=ksh 250000");  
           break;
    default:System.out.println("Amount=ksh 0");

    }
    }
    }
