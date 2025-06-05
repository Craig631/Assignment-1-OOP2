//By method

package BILL2;
import java.util.Scanner;
public class BILL2 
{
    double units,standingcharge,total;
    
    void compute()
    {
     Scanner BSE = new Scanner (System.in);
    System.out.println("Enter units consumed=");
    units=BSE.nextDouble();
    System.out.println("Enter Standing Charge=");
    standingcharge=BSE.nextDouble();
    total=units*55 + standingcharge;
    System.out.printf("Amount payable=%.2f",total);   
    }
    public static void main(String[] args) 
    {
    BILL2 client=new BILL2(); // Object Created
    client.compute();
    }
}
