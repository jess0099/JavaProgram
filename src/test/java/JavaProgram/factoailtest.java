package JavaProgram;

import java.util.Scanner;

public class factoailtest {
	
	public static void main(String [] xyz) {
	
	Scanner sc=new Scanner(System.in);
	
	int fact=sc.nextInt();
	
	for(int i=fact-1;i>0;i--) {
		
		fact=fact*i;
	}
System.out.println("factorial are--"+fact);
}
}