package Step1.Lec1;

import java.util.Scanner;

public class UserIO {
    
    
     // Taking Input From The User In Java by using "Scanner" class .

     public static void main(String[] args) {

        /* To Take any input we use Scanner Class in java*/
        
        Scanner sc = new Scanner(System.in);
        
        //Taking an Integer
        System.out.print("Enter Integer : ");

        int variable = sc.nextInt(); // This Line takes an integer from Console

        System.out.println("Integer You have Entered : " +  variable);
      
        // use sc.next(DataType) for taking all datatypes of input in java except char and String
        
        sc.close();

     }
     
}
