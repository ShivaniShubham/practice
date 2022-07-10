package conditions;

public class vowel {
public static char test= 'o';
	public static void main(String[] args) {
		
		
		//vowels are a,e,i,o,u so the cases will be a,e,i,o,u
switch(test) {
case 'a':
System.out.println('a');
break;
case 'e':
	System.out.println('e');
break;
case 'i':
	System.out.println('i');
	break;
case'o':
	System.out.println('o');
	break;
case'u':
	System.out.println('u');
	break;
	default:
		System.out.println("i am consonant");
}
	}

}