/*
 * Combine two grocery List
 * and remove duplicacies if any
 */


import java.io.*;
import java.util.*;

class GroceryList{

	LinkedList<String> l1 , l2;
	HashMap<String , Integer> h;

	public GroceryList(){
		l1 = new LinkedList<String>();
		l2 = new LinkedList<String>();
		h  = new HashMap<String , Integer>();
	}	

	public void readList() throws IOException{

		char ch = 'N';
		String entry;
		System.out.println("__Enter entries for grocery list one__");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Enter Grocery Item..!!");
			entry = reader.readLine();
			this.l1.add(entry);
			System.out.println("Do you want to continue..!!(Y or N)");
			ch = reader.readLine().charAt(0);
		}while(ch == 'Y' || ch == 'y');

		System.out.println("__Enter entries for grocery list two__");
		do{
			System.out.println("Enter Grocery Item..!!");
			entry = reader.readLine();
			this.l2.add(entry);
			System.out.println("Do you want to continue..!!(Y or N)");
			ch = reader.readLine().charAt(0);
		}while(ch == 'Y' || ch == 'y');

	}

	public void displayList(){

		System.out.println("__Printing List One__");

		Iterator<String> it = this.l1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("__Printing List two__");
		it = this.l2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public void combineList(){
		Iterator<String> it = this.l1.iterator();
		String name = null;
		while(it.hasNext()){
			name = it.next();
			if(this.h.containsKey(name))
				continue;
			else{
				this.h.put(name , 1);
			}
		}
		it = this.l2.iterator();
		while(it.hasNext()){
			name = it.next();
			if(this.h.containsKey(name))
				continue;
			else{
				this.h.put(name , 1);
			}
		}
	}

	public void displayMap(){

		Iterator it = this.h.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println("Value: " + pairs.getKey());
		} 
	}

	public static void main(String[] love) throws IOException{
		GroceryList obj = new GroceryList();
		obj.readList();
		obj.displayList();
		obj.combineList();
		obj.displayMap();

	}

}