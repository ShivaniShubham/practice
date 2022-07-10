package covariant;
class Methodhidingparent{
	public void defect() {
		
		System.out.println("i am defect of parent class");
	}
	
	public static void bug() {
		System.out.println("i am bug of parent class");
	}
}
public class Methodhiding extends Methodhidingparent {

	public static void main(String[] args) {
		Methodhidingparent obj=new Methodhidingparent();
		obj.defect();
		obj.bug();
		Methodhiding test=new Methodhiding();
		test.defect();
		test.bug();
		Methodhidingparent you = new  Methodhiding();
		you.defect();
		you.bug();
	}
	public void defect() {
		System.out.println("i am defect of child class");

	}
		public static void bug() {
			System.out.println("i am bug of child class");

	}

}
