package package2;

import package1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		
		Access3 obj1 = new Access3();
		//System.out.println(obj1.a);		
		//System.out.println(obj1.b);  //a,b are default in package1 so it is not accessed by another pacakge
		System.out.println(obj1.c);
		System.out.println(obj1.d);  //c,d are public in package1
		//System.out.println(obj1.e); 
		//System.out.println(obj1.f); //variable e,f are private so it is not accessable
		System.out.println(obj1.g);
		System.out.println(obj1.h);  //g,h are protected in package1
		
		Access1 obj2 = new Access1();
		//System.out.println(obj2.a);		
		//System.out.println(obj2.b);  //a,b are default in package1 so it is not accessed by another pacakge
		System.out.println(obj2.c);
		System.out.println(obj2.d);  //c,d are public in package1
		//System.out.println(obj2.e); 
		//System.out.println(obj2.f); //variable e,f are private so it is not accessable
		//System.out.println(obj2.g);
		//System.out.println(obj2.h);  //g,h are protected in package1 so it is not accessed by another pacakge

	}

}

