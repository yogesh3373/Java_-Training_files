import java.util.*;
public class Student{
public static void main (String args[])
{
String name;
int id;
int s1,s2,s3,s4,s5;
int total;
float average;
char grade=' ' ;

Scanner n=new Scanner(System.in);

System.out.println("Enter name");
name= n.nextLine();


System.out.println("Enter Id");
id = n.nextInt();

System.out.println("Enter marks");
s1 = n.nextInt();
s2 = n.nextInt();
s3 = n.nextInt();
s4 = n.nextInt();
s5 = n.nextInt();

total=s1+s2+s3+s4+s5;

System.out.println("Total ="+total);
average=total/5; 

System.out.println("Average ="+average);


if(s1>=50&&s2>=50&&s3>=50&&s4>=50&&s5>=50)
{
if(average>=50 && average<=60)
{
grade = 'D';
}

if(average>=61 && average<=70)
{
grade = 'C';
}

if(average>=71 && average<=80)
{
grade = 'B';
}

if(average>=81 && average<=90)
{
grade = 'A';
}

if(average>=91 && average<=100)
{
grade = 'O';
}


}
else
{
grade = 'F';
}

System.out.println("Grade = "+grade);
}
}