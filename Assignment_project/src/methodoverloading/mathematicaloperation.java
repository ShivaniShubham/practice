package methodoverloading;

public class mathematicaloperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mathematicaloperation obj= new mathematicaloperation();
int c=obj.add(6, 7);
float d=obj.add(5.5f, 6);
int a=obj.sub(50);
float x=obj.sub(6.7f);
double y=obj.sub(5.9);

System.out.println(c);
System.out.println(d);
System.out.println(a);
System.out.println(x);
System.out.println(y);
	}
public int add(int a, int b) {
	int c= a+b;
	return c;
}
public float add(float a,int b) {
	float d=a+b;
	return d;
}
public int sub(int a) {
	return a;
	
}
public double sub(double a) {
	return a;
	
}
public float sub(float a) {
	return a;
}
}
