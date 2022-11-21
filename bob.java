 class bob
{
 String name;
 int price;
public bob(String names)
{
name=names;
}
 void hlo(int prices)
{
price=prices;
}
void get()
{
System.out.println("name is"+name);
System.out.println("price is"+price);
}
public static void main(String args[])
{
bob sc=new bob("red me");
sc.hlo(40000);
sc.get();
}
}
