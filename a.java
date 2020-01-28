import java.io.*;
class a
{

void test (int count)
	{
	if (count == 0)
	System.out.println("B");
	else
	{
	System.out.println( "Bye" + count);	
	test(--count );
	System.out.println("H" + count);	
	}
	}
public static void main(String args[])
{a a1=new a();
a1.test(4);
}
}

