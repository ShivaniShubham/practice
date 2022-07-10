package covariant;
class A{
public A m1() {
	System.out.println("i am parent class method");
	A obj=new A();
	return obj;
}
}
public class C extends A {
public C m1() {
	System.out.println("i am child class method");
	C obj = new C();
	return obj;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj1=new A();
obj1.m1();
 C obj2=new C();
 obj2.m1();
 A obj3=new C();
 obj3.m1();
 

	}

}
