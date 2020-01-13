import java.util.Scanner;

public class NumbersGame {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
   Scanner input=new Scanner(System.in);
	System.out.println("Enter an Integer : ");
   int N= input.nextInt();
   //checkIsPrime(N);
	//printallPrime(N);
   printFibonacciSeries(N);
	}

	private static void printFibonacciSeries(int n) {
		// TODO Auto-generated method stub
		int next = 0;
	System.out.println("Fibonacci Series: ");
	if(n==0) {System.out.println(n );}
	if(n==1) {
		System.out.println(n-1 );
	System.out.println(n );}
	if (n>=2) {
		System.out.println("0 ,1 ");
		int first=0,second=1;
		for(int i=2;i<=n;i++)
		{
			next=first+ second;
			System.out.println(","+next );
			first=second;
			second=next;
		}
	}
	
	
	}

//	private static int fibo(int i) {
//		// TODO Auto-generated method stub
//		if(i==0) {return 0;}
//		if(i==1) {return 1;}
//		return fibo(i-1);
//	}

	private static void printallPrime(int x) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
	//System.out.println(isPrime);
	
	for(int n=1;n<=x;n++) {
		boolean isPrime = false;
	if(n<2) {isPrime=false;}
	
	if(n==2) {isPrime=true;}
	if(n==3) {isPrime=true;}
	
	for(int d=2;d<n/2;d++) 
	{
	if(n%d==0) {isPrime=false;break;}
	else {isPrime=true;}
	}
	if(isPrime) {System.out.println("Number "+n+" is Prime. ");}
	//else {System.out.println("Number "+n+" is NOT Prime.");}
	}
	
	}	
	

	private static  void checkIsPrime(int n) {
		// TODO Auto-generated method stub
	boolean isPrime = false;	
	//System.out.println(isPrime);
	
	if(n<2) {isPrime=false;}
	
	if(n==2||n==3) {isPrime=true;}
	
	
	for(int d=2;d<n/2;d++) 
	{
	if(n%d==0) {isPrime=false;break;}
	else {isPrime=true;}
	}
	if(isPrime) {System.out.println("Number "+n+" is Prime. ");}
	else {System.out.println("Number "+n+" is NOT Prime.");}
	
	}

}
