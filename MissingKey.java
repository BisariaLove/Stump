import java.io.*;
import java.util.*;

/*
 * In 1-9 keypad one key is not working. If 
 * some one enters a password then not working
 * key will not be entered. You have given expected 
 * password and entered password. Check that entered 
 * password is valid or not .
 *
 * Ex: entered 164, expected 18684 (you need to take 
 * care as when u enter 18684 and 164 only both will 
 * be taken as 164 input)
 *
 */

class MissingKey{

	boolean isAMatch(String actual, String expected)
	{
		char faultyKey = '\0';
		int i = 0, j = 0;
		for(; i < expected.length() && j < actual.length(); ++i)
		{
			if(actual.charAt(j) != expected.charAt(i))
			{
				if('\0' != faultyKey)
				{
					if(faultyKey != expected.charAt(i))
					return false;
				}
				else
				{
					faultyKey = expected.charAt(i);
					
				}
			}
			else
			{
				++j;
			}
		}

		return ((i == (expected.length()) )&& (j == (actual.length() )))? true : false;
	}
	public static void main(String[] love){
		MissingKey key = new MissingKey();
		boolean answer = key.isAMatch("164" , "18684");
		System.out.println(answer);

	}
}