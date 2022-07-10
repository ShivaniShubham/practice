package school2;

import school.Test1;
import school1.Test2;

public class Test3 {
public int w;
int x;
private int y;
protected int z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test3 obj3 = new Test3();
Test1 obj1 = new Test1();
Test2 obj2=new Test2();
obj3.w= 60;
obj3.x = 30;
obj3.y=70;
obj3.z= 40;
obj1.a=30;
obj2.k=60;
System.out.println(obj3.w);
System.out.println(obj3.x);
System.out.println(obj3.y);
System.out.println(obj3.z);
	}

}
