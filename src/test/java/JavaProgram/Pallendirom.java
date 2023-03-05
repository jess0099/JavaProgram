package JavaProgram;

import java.util.Scanner;

public class Pallendirom {
	//Pallendirom program
	public static void main() {
		//system initlize output
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int rev=0;
		int f=num;
	//reverse program	
		while(num>0) {
			
			int remind=num%10;
			rev=rev*10+remind;
			num=num/10;
			
		}if(f==rev) {
			
			System.out.println("pallendirom number is -->"+rev);
		}else {
			
			System.out.println(" not a pallendirom number-->"+rev);
		}
	}

}
