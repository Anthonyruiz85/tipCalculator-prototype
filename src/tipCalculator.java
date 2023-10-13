import java.util.Scanner;
   
 public class tipCalculator {
     public static void main(String [] args) {
    try (Scanner userInput = new Scanner(System.in)) {//Scanner created named userInput
        System.out.println("enter amount paid");
         double amountPaid =userInput.nextDouble();//this stores user input under amountPaid
   System.out.println("enter the percentage you would like to tip example 10");

       // initialization
        double tipRate = userInput.nextDouble();
        double tipAmount = tipRate *amountPaid/100,  totalAmount = tipAmount + amountPaid;
       
        System.out.println("you paid: " + amountPaid + " and wish to tip:"+ tipRate +" percent");
        System.out.println("which equals: "+tipAmount + " so your total will come out to:"+ totalAmount );
        
   
     }  
    
  }
}
