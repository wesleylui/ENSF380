/*
	@author Wesley Lui
	
	@version 1.3
	@since 1.0
*/

//practicing running this program from command prompt

public class MyFirstProgram {
	
	public static void main (String[] args){
		System.out.println("Hello World. My name is Wesley.");
		
		char character = 'a';
		boolean good = true;
		byte what = 2;
		short huh  = 2;
		int integer = 5;
		long huhuh = 256464;
		float butterfly = 4;
		double a= 3.1415;
		
		//automatic cast
		double b = integer;
		
		//explicit cast
		int c = (int)a;
		
		System.out.println(b);
		System.out.println(c);
		
	}

}