package array;

import java.util.Arrays;

public class arrayinbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,4,5,6,7,8,1,3};
		System.out.println("before sorting"+ a[1]); 
		Arrays.sort(a);
System.out.println("after sorting"+ a[1]);
System.out.println(Arrays.toString(a));
System.out.println(a.length);
//through for loop print all values of array
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println(".....using for each loop...");
//for each loop
for(int i:a) {
	System.out.println(i);
	//we are transfering each elemment of array into i one by one
}
double []p= {3,1,2,2};
for(double j:p) {
	System.out.println(j);
	System.out.println(p.length);
}
	}

	
	

}
