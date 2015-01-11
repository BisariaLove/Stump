import java.io.*;
import java.util.*;

class HashMapDemo{
	public static void main(String[] love) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader (new File("input.txt")));
		String inputLine = null;

		HashMap<String , Integer> dictionary = new HashMap<String , Integer>();

		while( (inputLine = reader.readLine()) != null){
			String[] words = inputLine.split("\\s+");

			//Ignore Empty Lines
			if(inputLine.equals(""))
				continue;

			for(String word : words){
				word = word.replace("." , " ");
				word = word.replace("," , " ");

				if(dictionary.containsKey(word)){
					Integer val = dictionary.get(word);
					dictionary.put(word , val+1);
				}
				else{
					dictionary.put(word , 1);
				}
			}

		}

		Iterator it = dictionary.entrySet().iterator();
    	while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	System.out.println(pairs.getKey() + " = " + pairs.getValue());
    }
	}
}