package yp;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

public class ListOfHashTest {
	
	ListOfHash obj = new ListOfHash();
	
	@Test
	public void testPrintBookStore() {
		LinkedList<String> tl= new LinkedList<String>();
		LinkedList<String> rl = null;
		
		obj.putHash("id1", "book_store1", "city1", "state1", "zip1", "Book Stores");
		tl.add("book_store1");
		obj.putHash("id2", "book_store2", "city2", "state2", "zip2", "Book Stores");
		tl.add("book_store2");
		obj.putHash("id3", "book_store3", "city3", "state3", "zip3", "Book Stores");
		tl.add("book_store3");
		
		rl = obj.printBookStore(obj.list);
		
		assertEquals(tl.size(), rl.size());
		
		Iterator<String> it1 = tl.iterator();
		Iterator<String> it2 = rl.iterator();
		
		while(it1.hasNext() && it2.hasNext()){
			assertEquals(it1.next(), it2.next());
		}
	}
	
	@Test
	public void testDuplicateEntry(){
		
		LinkedList<String> rl = null;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int count=0 ;
		String temp = null;
		
		obj.putHash("id1", "book_store1", "city1", "state1", "zip1", "Book Stores");
		obj.putHash("id2", "book_store2", "city2", "state2", "zip2", "Book Stores");
		obj.putHash("id3", "book_store3", "city3", "state3", "zip3", "Book Stores");
		//obj.putHash("id3", "book_store3", "city3", "state3", "zip3", "Book Stores");
		
		rl = obj.printBookStore(obj.list);
		
		
		Iterator<String> it = rl.iterator();
		
		while(it.hasNext()){
			temp = it.next();
			if(hm.containsKey(temp)){
				count = hm.get(temp);
				count = count + 1;
				hm.put(temp, count);
			}
			else{
				hm.put(temp, 1);
			}
		}
		
		Iterator<Map.Entry<String, Integer>> it2 = hm.entrySet().iterator();
		while(it2.hasNext()){
			Map.Entry<String, Integer> pairs = it2.next();
			assertEquals(pairs.getValue(), new Integer(1));
		}
	}

}
