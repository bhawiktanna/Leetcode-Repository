import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); //24
		int n2 = sc.nextInt(); //36
		int on1 = n1, on2 = n2;
		//Use the long division method
		int rem = 0;
		while(n1 % n2 != 0){
		   rem = n1 % n2;
		   n1 = n2;
		   n2 = rem;
		   /*
		   *1=> rem = 24%36=24, n1=n2=36, n2=rem=24
		   *2=> rem = 36%24=12, n1=n2=12, n2=rem=24
		   */
		}
		int gcd = rem;
		int lcm = (on1*on2)/gcd;
		System.out.println(lcm);
		System.out.println(gcd);
	}
}