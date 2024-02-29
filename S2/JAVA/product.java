class product1 {
String pcode;
String pname;
int price;
product1(String pc,String pn,int p) 
{
pcode=pc;
pname=pn;
price=p;
}
}
class product {
public static void main(String args[]) {
product1 p1=new product1("s11","pen",500);
product1 p2=new product1("s12","book",350);
product1 p3=new product1("s13","box",100);
if(p1.price<p2.price&&p1.price<p3.price) {
System.out.println(p1.pname+" has lesser price");
}
else if(p2.price<p3.price)
{
System.out.println(p2.pname+" has lesser price");
} else
{
System.out.println(p3.pname+" has lesser price");
}
}
}
