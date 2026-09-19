import java.util.Scanner;
public class TestMethods3 {
    static Scanner sc=new Scanner(System.in);
	static int square(int n) {
		return n*n;
	}
	static int cube(int n) {
		return n*n*n;
	}
	static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}
	static int countOfDigits(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		return cnt;
	}
	static int reverseNumber(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}
	static int power(int n,int k) {
		int pow=1;
		for(int i=1;i<=k;i++) {
			pow*=n;
		}
		return pow;
	}
	//method with return type no parameters
	static int sum() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	}
	static int evenSum() {
		int eSum=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				eSum+=i;
			}
		}
		return eSum;
	}
	static int oddSum() {
		int oSum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				oSum+=i;
			}
		}
		return oSum;
	}
	static void evenOrOdd(int n) {
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	static void printNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
	static void evenNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	static void oddNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	static void printDetails() {
		String name="yochitha";
		int age=21;
		String city="srikakulam";
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
	}
	static void ascii() {
		for(int i='A';i<='Z';i++) {
			System.out.print((char)i+" ");
		}
	}
	static void multiplesOf3() {
		for(int i=1;i<=15;i++) {
			System.out.println("3 * "+i+" = "+3*i);
		}
	}
	static void multiplesOf7() {
		for(int i=50;i<=70;i++) {
			if(i%7==0) {
				System.out.print(i+" ");
			}
		}
	}
	static void doubleNumber() {
		int num=2;
		for(int i=1;i<=10;i++) {
			System.out.print(num+" ");
			num=num*2;
		}
	}
	static void commonFactors() {
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
	static void pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	static void numberPattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void reverseNumberPattern() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=5-i+1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void alpPattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
	static void cntFactors(int n) {
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		System.out.println("count of factors :"+cnt);
	}
	static void cnt5(int n) {
		int cnt=0;
		while(n>0) {
			int rem=n%10;
			if(rem==5) {
				cnt++;
			}
			n=n/10;
		}
		System.out.println(" Count of 5 :"+cnt);
	}
	static void printMonths() {
		String[] months= {"Jan","feb","mar","apr","may","june","july","aug","sep","oct","nov","dec"};
		for(int i=0;i<months.length;i++) {
			System.out.print(months[i]+" ");
		}
	}
	static String name() {
		String name="yochitha";
		return name;
	}
	static String collegeName() {
		String name="srkr";
		return name;
	}
	static int number() {
		int num=2026;
		return num;
	}
	static int minimumInArray() {
		int[] arr= {2,5,7,3,9,1};
		int min=arr[0];
		for(int a:arr) {
			if(a<min) {
				min=a;
			}
		}
		return min;
	}
	static int sumOfAnArray() {
		int[] arr= {2,5,7,3,9,1};
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return sum;
	}
	static int secondMaxElement() {
		int[] arr= {2,8,7,3,9,1};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>max) {
				smax=max;
				max=a;
			}
			else if(a>smax&&a!=max) {
				smax=a;
			}
		}
		return smax;
	}
	static int stringCnt(String str) {
		int cnt=0;
		for(char ch:str.toCharArray()) {
			cnt++;
		}
		return cnt;
	}
	static int vowelsCnt(String str) {
		int cnt=0;
		for(char ch:str.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				continue;
			}else if(ch==' '){
				cnt++;
			}
		}
		return cnt;
	}
	static String reverse(String str) {
		StringBuilder s=new StringBuilder(str);
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char ch=s.charAt(i);
			s.setCharAt(i,s.charAt(j));
			s.setCharAt(j,ch);
			i++;
			j--;
		}
		return s.toString();
	}
	static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	static int search(int target,int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {	
//		System.out.println("cube of a number : "+cube(3));  
//		System.out.println("Enter the number is ");
//		int n=sc.nextInt();
//		System.out.println("Factorial of a number is : "+factorial(n));
//		System.out.println("Reverse of a number : "+reverseNumber(n));
//		System.out.println("Enter power of a number : ");
//		int k=sc.nextInt();
//		System.out.println("Power of the number is "+power(n,k));
//		System.out.println("Sum of 1 to 20 odd numbers is "+oddSum());
//		evenOrOdd(n);
//		printTable(n);
//		printNumbers(n);
//		oddNumbers(n);
//		printDetails();
//		ascii();
//		multiplesOf3();
//		multiplesOf7();
//		doubleNumber();
//		commonFactors();
//		alpPattern();
//		cntFactors(9);
//		cnt5(n);
//		printMonths();
//		System.out.println("Current year is : "+number());
//		System.out.println("sum of elements in an array :"+sumOfAnArray());
//		System.out.println("second max : "+secondMaxElement());
//		String str=sc.nextLine();
//////		System.out.println("vowels in the string : "+vowelsCnt(str));
////		System.out.println("Reverse of a string is : "+reverse(str));
//		if(isPalindrome(str)) {
//			System.out.println("It is a plaindromic string");
//		}else {
//			System.out.println("It is not a plaindromic string");
//		}
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Target element is");
		int t=sc.nextInt();
		System.out.println("Target element is at : "+search(t,arr));
	}
}
