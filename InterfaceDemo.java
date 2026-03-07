import java.util.Scanner;
interface shape {
double area();
double perimeter();
}

class circle implements shape {
private double radius;
public circle (double radius) {
this.radius=Math.abs(radius);
}

public double area() {
return Math.PI*radius* radius;
}

public double perimeter() {
return 2*Math.PI*radius;
}
}

class Rectangle implements shape {
private double length;
private double width;

public Rectangle(double length,double width) {
this.length=Math.abs(length);
this.width=Math.abs(width);
}

public double area() {
return length * width;
}

public double perimeter() {
return 2 * (length + width);
}
}
public class InterfaceDemo {
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);

shape currentshape=null;

while (true) {
System.out.println("\n---Shape calculator---");
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Exit");
System.out.print("Select an option:");

int choice=sc.nextInt();
if (choice==3) {
System.out.println("Execution terminated");
break;
}

switch (choice) {
case 1:
System.out.print("Enter radius:");
double r=sc.nextDouble();

currentshape=new circle(r);
break;

case 2:
System.out.print("Enter length and width:");
double l=sc.nextDouble();
double w=sc.nextDouble();

currentshape=new Rectangle(l,w);
break;
default:
System.out.println("error:Invalid selection.Try again!");
continue;
}
System.out.println("Area:" + currentshape.area());
System.out.println("Perimeter:" + currentshape.perimeter());
}
sc.close();
}
}



























































