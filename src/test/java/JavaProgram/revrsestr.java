package JavaProgram;

public class revrsestr {

	public static void main(String[] xyz) {
		
		String str="Sherlin1111";
		String b="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			
			b=b+str.charAt(i);
		}
	System.out.println("revrse number is "+b);
	}
}
