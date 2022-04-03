package Staticmtd;

public class ClassA
{

	public static int a=20;         //public access specifer
         static int b=30;           //default
  private static int c=40;         //private
  protected static int d=50;       //protected 

  public static void main(String[] args) 
 {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
}
