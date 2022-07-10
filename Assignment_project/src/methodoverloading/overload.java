package methodoverloading;

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int m1(int a,int b) {
		int c=a+b;
		return c;
	}
	public float m1(int a, int b) {
		int c=a+b;
		return c;
		//returntype has nothing to do with duplicate in methodoverloading
	}
public int a1(int a) {
	return a;
}
private int a1(int a) {
	
}

}
