package school1;

import school.Test1;
import school2.Test3;
//constructor for practice
public class Test2 {
public int k;
int l;
private int m;
protected int n;
public Test2() {
	k=11;
	l=88;
	m=66;
	n=55;
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 obj2 = new Test2();
Test1 obj1=new Test1();
Test3 obj3= new Test3();
obj1.a=12;
obj2.k=6;
obj2.l=7;
obj2.m=8;
obj2.n=9;
obj3.w=22;
System.out.println(obj1.a);
System.out.println(obj1.a);
System.out.println(obj3.w);

System.out.println(obj2.k);
System.out.println(obj2.l);
System.out.println(obj2.m);
System.out.println(obj2.n);
	}

}
