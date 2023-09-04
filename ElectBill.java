import java.util.Scanner;
class ElectBill
{
int ConsumerNo;
String ConsumerName;
int PrevReading;
String EBConn;
int choice;
double Bill;
void input_data()
{
Scanner sc = new Scanner(System.in);
System.out.println("\n Enter Consumer Number: ");
ConsumerNo = sc.nextInt();
System.out.println("\n Enter Consumer Name: ");
ConsumerName = sc.next();
System.out.println("\n Enter Previous Units: ");
PrevReading = sc.nextInt();
System.out.println("Enter the types of EB Connection");
System.out.println("(Domestic = 1 or commercial = 2)");
choice = sc.nextInt();
}
double calculate_bill()
{
;
switch(choice)
{
case 1:
EBConn = "Domestic";
if(PrevReading>=0 && PrevReading<=100)
Bill=PrevReading*1;
else if(PrevReading>100 && PrevReading <= 200)
Bill=PrevReading*2.50;
else if(PrevReading>200 && PrevReading <= 500)
Bill=PrevReading*4.00;
else
Bill=PrevReading*6.00;
break;
case 2:
EBConn = "Commercial";
if(PrevReading>=0 && PrevReading<=100)
Bill=PrevReading*2;
else if(PrevReading>100 && PrevReading <= 200)
Bill=PrevReading*4.50;
else if(PrevReading>200 && PrevReading <= 500)
        Bill=PrevReading*6.00;
else
Bill=PrevReading*7.00;
break;

default :
System.out.println("ENTER CORRECT CHOICE");
}
return Bill;
}
void display()
{

System.out.println("----------------------------------");
System.out.println("ELCTRICITY BILL");
System.out.println("----------------------------------");
System.out.print("Consumer Number: "+ConsumerNo+"\t");
System.out.print("Consumer Name: "+ConsumerName+"\t");
System.out.print("Consumer Previous Units: "+PrevReading+"\t");
System.out.print("Type of EBConnection: "+EBConn+"\t");
System.out.print("Total Amount(Rs.): "+Bill+"\t");
}
}
class ElectBillGen
{
    public static void main (String[] args)
    {
    ElectBill b=new ElectBill();
    b.input_data();
    b.calculate_bill();
    b.display();
    }
}
