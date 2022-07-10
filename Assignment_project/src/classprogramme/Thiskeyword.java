package classprogramme;

public class Thiskeyword {
static	int a;
static	int b;
public	Thiskeyword(int a,int b) {
	a=5;
	b=20;
System.out.println(a);
System.out.println(b);
}
public Thiskeyword() {
	this(60, 30);
	System.out.println("i am from with parameter constructor "+a);
}
	public static void main(String[] args) {
		Thiskeyword obj= new Thiskeyword(a,b);
		Thiskeyword obj1=new Thiskeyword();
		obj.m1(40, 50);
		System.out.println(a);
	}
public void m1(int a, int b) {
	this.a=a;
	this.b=b;
}
public void m2() {
	
}
public static void m3() {
	
}
}
