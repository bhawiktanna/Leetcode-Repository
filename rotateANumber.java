import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int temp = n, nod=0;
		while(temp != 0){. //Counting number of digits
		    temp /= 10;
		    nod++;
		}
		
		k %= nod; // for bigger numbers
		if(k<0){. // for negative numbers
		    k += nod;
		}
		
		int div = 1, mult = 1;
		for(int i=1;i<=nod;i++){ // n = 21453 & k = 2
		    if(i<=k){ //this is to bifurcate last 2 digits from back - 100
		        div *= 10;
		    }
		    else{ //this is to bifurcate first 3 digits from front - 1000
		        mult *= 10;
		    }
		}
		
		int q = n / div; // take out front 3 digits - 214
		int r = n % div; // take out last 2 digits - 53
		
		int rot = r * mult + q;  // multiply last 2 digits with mult i.e 53 * 1000 = 53000
		                        // add front 3 digits ie. 214
		                        //rot = 53000 + 214 = 53214
		System.out.println("Rotated Number: "+rot);
	}
}