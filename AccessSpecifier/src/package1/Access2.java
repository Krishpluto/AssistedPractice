package package1;

public class Access2 {

	public static void main(String[] args) {
		
 
		Access1 obj1 = new Access1();
		System.out.println(obj1.a);		
		System.out.println(obj1.b);  //a,b are default
		System.out.println(obj1.c);
		System.out.println(obj1.d);  //c,d are public
		//System.out.println(obj1.e); //variable e is private so it is not accessable
		//System.out.println(obj1.f); //variable f is private so it is not accessable
		System.out.println(obj1.g);
		System.out.println(obj1.h);  //g,h are protected
	}

}
