import java.util.Scanner;

public class mern1 {
		public static void main(String[] args){
			String name="MANOJ";
			System.out.println("My name is " + name);
		
			
//operations		
			int a=10,b=5,c=4;
			System.out.println("a+b+c="+(a+b+c));
			System.out.println("a-b-c="+(a-b-c));
			System.out.println("a%b="+(a%b));
			System.out.println("a*b*c="+(a*b*c));
			System.out.println("a/b+c="+(a/b+c));
			
			
//boolean operations		
			boolean electricity=false;
			if(electricity==true){
				System.out.println("On");
			}
			else{
				System.out.println("Off");
			}
			
			
//odd or even		
			if(b%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
			
			
//prime
			int flag=0,n=7;
			int m=n/2,i;
			if(n==0||n==1) {
				System.out.println(n+ "is not prime");
			}
			else {
				for(i=2;i<=m;i++) {
					if(n%i==0) {
						System.out.println("The given number is not a prime");
						flag=1;
						break;
					}
				}
			}
			if(flag==0) {
				System.out.println("The given number is prime");
			}
			
			
//reverse			
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int number = scanner.nextInt();
	        int reversed = 0;
	        while (number != 0) {
	            reversed = reversed * 10 + number % 10;
	            number /= 10;
	        }
            System.out.println("Reversed Number: " + reversed);

	        	        
//sum of digits	        
	        int sum=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number:");
	        a=s.nextInt();
	        while(a>0)
	        {
	            n=a%10;
	            sum=sum+n;
	            a=a/10;
	        }
	        System.out.println("Sum of Digits:"+sum);
	       
	        
//fibonacci
	       
           Scanner s1 = new Scanner(System.in);
           System.out.println("Enter a num for fibbo:");
           n = s1.nextInt();
           int num1 = 0, num2 = 1;
           System.out.print("Fibonacci Series: " + num1 + " " + num2);
           for( i=2; i<n; i++) {
        	   int nextnum = num1 + num2;
        	   System.out.println("nextnum");
        	   num1 = num2;
        	   num2 = nextnum;
		}
           
           
//leap year or not
           Scanner s2=new Scanner(System.in);
           System.out.println("Enter the year: ");
           int year=s2.nextInt();
           boolean isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
           if(isLeapYear) {
        	   System.out.println(year+"is a leap year.");
           }
           else {
        	   System.out.println(year+"is not a leap year.");
           }
           s1.close();
           
		}
}


