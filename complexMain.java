import java.util.Scanner;
class complex {
double real,img;
//Default constructor(required for creating result objects)
complex() {
real=0;
img=0;
}
//parameterized constructor
complex(double r,double i) {
real=r;
img=i;
}
//add method
complex add(complex c2) {
complex result=new complex();
result.real=real+c2.real;
result.img=img+c2.img;
return result;
//return new complex(real+c2.real,img+c2.img);
}
//subtract method
complex subtract(complex c2) {
complex result=new complex();
result.real=real-c2.real;
result.img=img-c2.img;
return result;
}

complex multiply(complex c2) { //multiply method
complex result=new complex();
result.real=(real*c2.real)-(img*c2.img);
result.img=(real*c2.img) + (img * c2.real);
return result;
}
//display method
void display() {
System.out.println(real+"+"+img+"i");
}
}
public class complexMain {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//input first number
System.out.println("Enter Real and Imaginary part of First Number:");
double r1=sc.nextDouble();
double i1=sc.nextDouble();
complex c1=new complex(r1,i1);
//input second number
System.out.println("Enter Real and Imaginary part of Second Number:");
double r2=sc.nextDouble();
double i2=sc.nextDouble();
complex c2=new complex(r2,i2);
System.out.println("\n--Results--");
//perform operations
complex sum=c1.add(c2);
complex diff=c1.subtract(c2);
complex prod=c1.multiply(c2);
//display
System.out.print("Sum:");
sum.display();
System.out.print("Difference:");
diff.display();
System.out.print("Product:");
prod.display();
}
}


























