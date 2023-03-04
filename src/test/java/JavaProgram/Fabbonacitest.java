package JavaProgram;

import java.util.Scanner;

public class Fabbonacitest {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1; i<8;i++) {
			
			int c=a+b;
			System.out.println("fabbonaci series are->"+c);
			a=b;
			b=c;
		}
		

	}

}
