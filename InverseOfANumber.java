import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int inv = 0, op = 1;
		
		while(n != 0){
		    int od = n % 10;
		    int ip = od;
		    int id = op;
		    
		    inv += id * (int)Math.pow(10, ip-1); 
		    n /= 10;
		  op++;
		}
		System.out.println("Inverted Number: "+inv);
		
	}
}
//Input - 21453
//Output - Inverted Number: 23154