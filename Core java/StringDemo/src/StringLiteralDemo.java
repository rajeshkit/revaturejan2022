public class StringLiteralDemo {
	public static void main(String[] args) {
		String companyName="Revature"; // string literal //char[] com=new char[]{'R','e','v','a','t','u','r','e'};
				
		String companyName1="Revature"; // string object 		//char[] com=new char[]{'R','e','v','a','t','u','r','e'};

		String traineeName=new String("Ankit");
		
		StringBuffer sb=new StringBuffer("welcome");
		
		StringBuilder sbb=new StringBuilder("to India");
		
		String c = traineeName.concat("kumar");
		
		System.out.println(c.contains("kumar"));
		System.out.println(c.replace("m", "v"));
	}
}
