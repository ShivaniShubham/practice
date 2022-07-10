package classprogramme;

public class finalkeyword {
final int a=5;
final int b;
final int c;

public finalkeyword(){
	b=20;
	c=50;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalkeyword obj= new finalkeyword();
		
		System.out.println(obj.a);
		System.out.println(obj.a + obj.b);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.a+obj.b+obj.c);
	}

}
