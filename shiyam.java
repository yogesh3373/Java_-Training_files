class yogesh{
String Name;
int Id;
public void setName(String Name){
this.Name=Name;
public void setId(int Id){
this.Id=Id;
}
public String getName(){
return Name;
}
public int getId(){
return Id;
public class yogesh extends shiyam{
public static void main(String[] args){
yogesh s= new yogesh();
s.Name("krish");
s.Id(1001);
}
}