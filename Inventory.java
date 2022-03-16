package pack;

import java.util.Scanner;

public class Inventory 
{
   String pname;
   int price,quantity;
   String Discount;
   void input()
   {
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter Product Name");
	  pname =s.next();
	  System.out.println("Enter Price");
	  price =s.nextInt();
	  System.out.println("Enter Product Name");
	  quantity =s.nextInt();
	  
	   
   }
   void show()
   {
	   System.out.println(pname +" "+ price+" "+  quantity);
   }
   void calculatediscount()
   {
	   if(price>3000)
	   {
		   System.out.println("Discount=10%");
	   }
	   else
	   {
		   System.out.println("Discount=9%");
	   }
	   
   }
	public static void main(String[] args) 
	{
		Inventory i= new Inventory();
		i.input();
		i.show();
		i.calculatediscount();
		
	}

}
