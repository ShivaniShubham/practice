package school;

import school1.Test2;
import school2.Test3;

public class Test1 {
public int a;
int b;
private int c;
protected int d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 obj1 = new Test1();
Test2 obj2 = new Test2();
Test3 obj3 = new Test3();
obj1.a = 5;
obj1.b= 10;
obj1.c = 15;
obj1.d=20;
obj2.k=5;
obj3.w= 6;
System.out.println(obj2.k);
System.out.println(obj3.w);
System.out.println("i am instance variable" + obj1.a);
System.out.println("hello" + obj1.b);
System.out.println(obj1.c);
System.out.println(obj1.d);

	}

}
