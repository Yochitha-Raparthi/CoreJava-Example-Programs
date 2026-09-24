import java.util.Scanner;
public class Fibanocci {
	static int fibanocci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibanocci(n-1)+fibanocci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
//		boolean flag=false;
	     for(int i=2;i<=n;i++) {
			int next=a+b;
			a=b;
			b=next;
			sum+=a;
		}
	     System.out.println("Sum of a fibanocci series is : "+sum);
//		if(flag) {
//			System.out.println(n+" is a fibanocci number");
//		}else {
//			System.out.println(n+" is not a fibanocci number");
//		}
//		System.out.println(c);
//		System.out.println(fibanocci(n));

	}

}
