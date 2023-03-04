package JavaProgram;

public class revrsestring {
	
	
	public static void main(String [] xyz) {
	
	String name="Amitbhati1344556";
	String b="";
	
	for(int i=name.length()-1;i>=0;i--) {
		
		b=b+name.charAt(i);
	}
                    System.out.println("revrse --"+b);

}

}