package pack;

public class Calculator
{
	int a=100,b;
	void add()
	{
		System.out.println("a=" + a + "   bye");
	}
    void sub()
    {
    	int y;
    	//System.out.println("a=" - a - " bye");
    }
    void display()
    {
    	int a=11;
    	System.out.println(a);
    	System.out.println(this.a);
    }
	public static void main(String[] args) 
	{
		Calculator c= new Calculator();
		
		c.add();
		
	}

}
