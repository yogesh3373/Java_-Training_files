import java.util.*;
public class Stack{
static final int MAX=2;
int top=1;
int[] stack= new int[MAX];
public static void main(String[] args)
{
Stack s=new Stack();
int opt,val;
do
{
System.out.println("1.PUSH");
System.out.println("2.POP");
System.out.println("3.TOP");
System.out.println("4.DISPLAY");
System.out.println("5.EXIT");
System.out.println("Enter your option:");
Scanner s1=new Scanner(System.in);
opt=s1.nextInt();

switch(opt)
{
case 1:
System.out.println("Enter the value to be addded to the stack:");
for(int i=1;i<3;i++)
{
val=s1.nextInt();
s.push(val);
}
break;
case 2:
s.pop();
break;
case 3:
s.top();
case 4:
s.display();
break;
case 5:
System.out.println("Stack exited successfully");
break;
}
}while(opt!=5);
}
public void push(int val)
{
if(top==MAX-1)
{
System.out.println("Stack is FULL!");
}
else
{
top++;
stack[top]=val;
System.out.println("Element added to the stack is:"+val);
display();
}
}
public void pop()
{
int x;
if(top==-1)
{
System.out.println("Stack is EMPTY!");
}
else
{
x=stack[top];
System.out.println("The element is deleted from the stack is:"+x);
top--;
display();
}
}
public void top()
{
int n;
n=stack[top];
System.out.println("The value at the top of the stack is:"+n);
}
public void display()
{
int i;
if(top==-1)
System.out.println("STACK IS EMPTY!");
else
{
for(i=0;i<top;i++)
System.out.println("The element in the stack are:"+stack[i]);
}
}
}
