package classprogramme;

public class swapwithoutmethod {
int a;
int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
swapwithoutmethod obj= new swapwithoutmethod();
obj.a=50;
obj.b=70;

System.out.println("before swapping a to b" + obj.a + obj.b);
int c=obj.a;
obj.a=obj.b;
obj.b=c;
System.out.println("after swapping a to b" + obj.a + obj.b);

	}

}
