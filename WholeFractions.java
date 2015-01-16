/*
* Let the user enter a decimal number. 
* The range allowed is 0.0001 to 0.9999. 
* Only four decimal places are allowed. 
* The output should be an irreducible fraction. 
* Eg: If the user enters 0.35, the irreducible 
* fraction will be 7/20.
* 
* 
* Key Concept: GCD of Two Numbers
*/
import java.io.*;
import java.util.*;
class WholeFractions{

	double number;
	public WholeFractions(double num){
		number = num;

	}

	public long gcd(long a , long b){

		if(a == 0)
			return b;

		while(a != b){
			if(a > b)
				a = (a - b);
			else if(b > a)
				b = (b - a);
		}
		return a;
	}

	public String wholeFrac(){
		long x = (long)(this.number * 10000);
		long z = gcd(x , 10000);

		String frac = Long.toString(x/z) + " / "+Long.toString(10000/z); 

		return frac;
	}

	public static void main(String[] love) throws IOException{

		System.out.println("Enter the number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double num = Double.parseDouble(reader.readLine());
		WholeFractions obj = new WholeFractions(num);


		System.out.println("Value: " + obj.number);
		System.out.println("Fraction: " + obj.wholeFrac());
	}
	
}