import java.util.Scanner;
public class Prabhu{
public static void main(String[] args){
String name;
int id;
int m1,m2,m3,m4,m5;
int total;
float average;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Name");
name=s.nextLine();
System.out.println("Enter the id");
id=s.nextInt();
System.out.println("Enter the marks");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
total=m1+m2+m3+m4+m5;
average=(total/500)*100;
System.out.println("The total is :"+total);
System.out.println("The average is :"+average);
}
}
