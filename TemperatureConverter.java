import java.util.Scanner;
public class TemperatureConverter {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  while(true) {
  System.out.println("\n---MENU---");
  System.out.println("\n1.Celsisus to Fahrenheit \n2.Fahrenheit to Celsius \n3.Exit");
  System.out.println("\nEnter your choice:");
   int choice=sc.nextInt();
   sc.nextLine();
  
  if (choice==3){
     System.out.println("Execution terminted");
     break;
     }
  
  System.out.println("Temperature to convert:");
   String t=sc.nextLine();
   
   try{
     double temperature = Double.parseDouble(t);
     double convertedTemp;
  
  switch(choice) {
    case 1:
           convertedTemp = (temperature * 9 / 5) + 32;
           System.out.printf("%.2f C is equal to %.2f F\n", temperature, convertedTemp);
           break;
    case 2:
           convertedTemp = (temperature - 32) * 5 / 9;
           System.out.printf("%.2f °F is equal to %.2f °C\n", temperature, convertedTemp);
           break;

    default:
           System.out.println("Error: Invalid menu selection.");
           break;
         }
      } 
   catch (NumberFormatException e) {
        System.out.println("Error: Invalid input. You must enter a numerical value.");
        
        System.out.println("Exception details: " + e);
        System.out.println("Reason: " + e.getMessage());
        }
        }

        sc.close();
    }

  }             
