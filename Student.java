import java.util.*;
public class Student{
public static void main(string[] args);
String name;
int id;
int m1,m2,m3,m4,m5;
int total;
float average;
Scanner S1 = new Scanner(System.in);
System.out.println("enter the name");
name=S1.nextLine();
System.out.println("enter a id");
id=S1.nextInt();
System.out.println("enter the marks");
m1=S1.nextInt();
m2=S1.nextInt();
m3=S1.nextInt();
m4=S1.nextInt();
m5=S1.nextInt();
total=m1+m2+m3+m4+m5;
average=(total/500)*100;
System.out.println("the total is"+total);
System.out.println("the avearge is"+average);
}
}
