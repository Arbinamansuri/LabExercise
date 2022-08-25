import java.util.Scanner;
public class Exceptionexample{
	public static void main(String[] args){
		try{
			try{
				int a,b,c;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter two numbers : ");
				a = s.nextInt();
				b= s.nextInt();
				c = a/b;
				System.out.println(c);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("A number cannot be divided by 0 !!!");
			}
			catch(Exception e3)
			{
				System.out.println("Enter numbers only!!!");
			}
			String z= null;
			if (z.equals("xyz"))
                System.out.print("Same");
            else
                System.out.print("Not match");
		}
		catch(Exception ee)
		{
			System.out.println("The String is assigned with a null value");
		}
	}
}