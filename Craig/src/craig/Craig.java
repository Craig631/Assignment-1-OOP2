
package craig;

import java.util.Scanner;
public class Craig {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner zetech= new Scanner(System.in);
        int l,w;
        double r,areaCircle,areaRectangle,answer;
        System.out.println("Enter radius=");
        r=zetech.nextDouble();
        System.out.println("Enter length=");
        l=zetech.nextInt();
        System.out.println("Enter width=");
        w=zetech.nextInt();
        areaCircle=3.142*r*r;
        areaRectangle=l*w;
        answer=areaRectangle-areaCircle;
        System.out.printf("Area not covered by carpet=%.2f \n",answer);

    }
    
}
