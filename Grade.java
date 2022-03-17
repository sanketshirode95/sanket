package day3;

import java.util.Scanner;

public class Grade
{

	public static void main(String[] args) 
	{
	String sname;
	int marks;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Name");
	sname=s.next();
	System.out.println("Enter Marks");
    marks=s.nextInt();
	
	if(marks<25)
		System.out.println("F");
	else if(marks<45)
		System.out.println("E");
	else if(marks<50)
		System.out.println("D");
	else if(marks<60)
		System.out.println("C");
	else if(marks<80)
		System.out.println("B");
	else if(marks>80)
		System.out.println("A");
	


    }

}
