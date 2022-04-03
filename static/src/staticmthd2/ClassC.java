package staticmthd2;

 import Staticmtd.ClassA;
 
 public class ClassC extends ClassA 
{
 public static void main(String[] args) 
 {
		System.out.println(ClassA.a);
		//System.out.println(ClassA.b);
		//System.out.println(ClassA.c);
		System.out.println(ClassA.d);
}
}
