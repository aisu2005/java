import java.util.Scanner;
public class Matrixoperations {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("---Enter Dimensions for Matrix A---");
System.out.println("Rows:");
int r1=sc.nextInt();
System.out.print("Columns:");
int c1=sc.nextInt();

System.out.println("---Enter Dimensions for Matrix B---");
System.out.println("Rows:");
int r2=sc.nextInt();
System.out.print("Columns:");
int c2=sc.nextInt();

int[][] A=new int[r1][c1];
int[][] B=new int[r2][c2];
//Reading matrix A
System.out.println("Enter elements for Matrix A:");
for(int i=0;i<r1;i++) {
for(int j=0;j<c1;j++) {
A[i][j]=sc.nextInt();
}
}

System.out.println("Enter elements for Matrix B:");
for(int i=0;i<r2;i++) {
for(int j=0;j<c2;j++) {
B[i][j]=sc.nextInt();
}
}
//Menu driven loop
while (true) {
System.out.println("\n--MENU--");
System.out.println("1.Addition");
System.out.println("2.Multiplication");
System.out.println("3.Exit");
System.out.println("Enter Choice:");
int choice=sc.nextInt();
if(choice==3) break;
switch(choice) {
case 1: //addition
if(r1==r2 && c1==c2) {
System.out.println("Sum Matrix:");
for(int i=0;i<r1;i++) {
for(int j=0;j<c1;j++) {
System.out.print( A[i][j]+B[i][j]+"\t");
}
System.out.println();
}
}else {
System.out.println("Error;Dimensions must be same for Addition");
}
break;
case 2:
if(c1==r2) {
System.out.println("Product Matrix:");
int [][] c=new int [r1][c2];
for(int i=0;i<r1;i++) {
for(int j=0;j<c2;j++) {
c[i][j]=0;
for(int k=0;k<c1;k++) {
c[i][j]+=A[i][k]*B[k][j];
}
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}else{
System.out.println("Error:col of A must equal Row of B");
}
break;
default:
System.out.println("Invalid Choice!");
}
}
}
}










