package fees1;
import java.util.Scanner;
/**
 *
 * @author dizne
 */
public class FEES1 {

    public static void main(String[] args) {
        // TODO code application logic here
         int semester_one_fee;
    Scanner student = new Scanner (System.in);

     System.out.println("Enter the fee payable in semester one: ");
    semester_one_fee=student.nextInt();
     
       
   
     
    System.out.println("Using for loop:\n");
    for (int i = 1; i <= 7; ++i) 
    {  
      System.out.printf("Semester %d=%d \n",i + 1,(1500*i)+semester_one_fee);
    }
    
   
