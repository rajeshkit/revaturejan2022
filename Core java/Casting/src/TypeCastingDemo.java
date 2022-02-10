
public class TypeCastingDemo {
	
	public void show() {
		float cgpa=7.86554f; //32 bits
		int k=10; //32 bits
		
//		cgpa=k;
//		System.out.println(cgpa);
		k=(int)cgpa;
		System.out.println(k);
		byte b=34; //8 bits
		int a=100; //32 bits
		
		a=b;  //  32bits = 8bits implicit casting or Widening
		
		b=(byte)a;  //  8bits = 32bits Explicit casting or narrowing
		
		long phone=45667;
		int phone1=767;
		
		phone=phone1;
		phone1=(int)phone;
		
		char ch = 'r'; //16bits
		int count=56; //32 bits
		
		count=ch;
		ch=(char)count;
		
	}
	public static void main(String[] args) {
		// 45,78,56,78,46,98	
		// 45 primitive ---> 45 reference
		int a=45;
		Integer in=Integer.valueOf(a);// it converts
		Integer in1=45; // it converts
		// Integer - Wrapper class - converts primitive type to object type
		
		float percentage=8.6f;
		Float f=Float.valueOf(percentage);
		
		//collection -> 45,78,56,78,46,98
		
		char ch='t';
		Character c=Character.valueOf(ch);
		
		float cgpa=7.86554f; //32 bits
		int k=230334; //32 bits
		
		cgpa=k;
		System.out.println(cgpa);
//		k=(int)cgpa;
//		System.out.println(k);
	}
}
