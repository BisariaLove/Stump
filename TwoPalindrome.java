/*
 * The decimal and octal values of some 
 * numbers are both palindromes sometimes. 
 * Find such numbers within a given range.
 *
 * Checkout the logic for converting 
 * decimal to octal.
 *
 * @author Love Bisaria
 * 
 */

import java.io.*;
import java.util.*;
public class TwoPalindrome{

	public boolean isPalindrome(String s){

		int start = 0;
		int end = s.length() - 1;

		while(start < end){
			if(s.charAt(start) != s.charAt(end)){

				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public String decimalToOctal(int decimal){
		StringBuilder octal = new StringBuilder();
		int remain = -1;

		while(decimal != 0){
			remain = decimal % 8;
			decimal /= 8;
			octal.append(String.valueOf(remain)); 
		}
		octal.reverse();
		return octal.toString();
	}

	public void twoPalindromes(int bound){

		String decimal = null , octal = null;
		
		for(int i = 0 ; i < bound ; i++){
			decimal = Integer.toString(i);
			if(isPalindrome(decimal)){
				octal = decimalToOctal(i);
				if(isPalindrome(octal)){
					System.out.println(i);
				}
			}
		}

	}

	public static void main(String[] love){

		TwoPalindrome obj = new TwoPalindrome();
		obj.twoPalindromes(1000000);
	}

}