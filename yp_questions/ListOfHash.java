package yp;

import java.util.*;
import java.io.*;

public class ListOfHash {
	LinkedList<HashMap<String, String>> list;

	public ListOfHash() throws IllegalArgumentException , NullPointerException{
		list = new LinkedList<HashMap<String, String>>();
	}
	
	void putHash(String id, String name, String city, String state, String zip, String category){
		
		HashMap<String,String> hash = new HashMap<String,String>();
		
		hash.put( "id", id);
		hash.put("name", name);
		hash.put("city", city);
		hash.put("state", state);
		hash.put("zip", zip);
		hash.put("category", category);
		
		this.list.add(hash);
	}

	LinkedList<String> printBookStore(LinkedList<HashMap<String, String>> ls){
		
		LinkedList<String> ll = new LinkedList<String>();
		HashMap<String, String> temp = null;
		Iterator<HashMap<String, String>> it1 = ls.iterator();
		
		while(it1.hasNext()){
			temp = it1.next();
			if(temp.containsKey("name")){
				System.out.println(temp.get("name"));
				ll.add(temp.get("name"));
			}
			
		}
		return ll;
		
	}

	public static void main(String[] love)throws IllegalArgumentException , NullPointerException, IOException{

		BufferedReader  rd = new BufferedReader(new InputStreamReader(System.in));
		ListOfHash obj = new ListOfHash();
		String id, name, city, state, zip, category;
		char choice = 'n';
		
		do{
			System.out.println("Enter the BookStore entries..!!");
			
			System.out.println("Please Enter id");
			id = rd.readLine();
			System.out.println("Please Enter name");
			name =  rd.readLine();
			System.out.println("Please Enter city");
			city = rd.readLine();
			System.out.println("Please Enter state");
			state = rd.readLine();
			System.out.println("Please Enter zip");
			zip = rd.readLine();
			System.out.println("Please Enter category");
			category = rd.readLine();
			
			obj.putHash(id, name, city, state, zip, category);
			
			System.out.println("Do you want to continue..(y or n)!!");
			choice = rd.readLine().charAt(0);	
		}while(('y' == choice) || ('Y' == choice));
		
		obj.printBookStore(obj.list);
		

	}
}
