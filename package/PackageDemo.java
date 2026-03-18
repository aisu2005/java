import java.util.Scanner;
import mathutils.Calculator;

public class PackageDemo {
   public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   Calculator calc= new Calculator();
   System.out.println("Enter the first number:");
   double num1 = sc.nextDouble();
   System.out.println("Enter the second nuumber:");
   double num2 = sc.nextDouble();
   
   System.out.println("\n---Results---");
   System.out.printf("Addition:%.2f\n",calc.add(num1,num2));
   System.out.printf("Subtraction:%.2f\n",calc.subtract(num1,num2));
    System.out.printf("Multipilcation:%.2f\n",calc.multiply(num1,num2));
    if(num2==0) {
        System.out.println("cannot divide by zero");
        }
        else
        {
    System.out.printf("Division:%.2f\n",calc.divison(num1,num2));
    }
    }
    }
