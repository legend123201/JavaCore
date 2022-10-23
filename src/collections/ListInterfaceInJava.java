package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceInJava {
	public static void initialize() {
		List<String> listString = new ArrayList<String>();
		// array list base on normal array, so we can initial with specified size
		List<Float> listFloat = new ArrayList<Float>(1000); 
		List<Integer> listInteger = new LinkedList<Integer>();
	}

	public static void loops() {
		List<String> listString = new LinkedList<String>();
		// thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");

		for (int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}

		for (String element : listString) {
			System.out.println(element);
		}

		// khai báo một Iterator
		Iterator<String> iterator = null;
		iterator = listString.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// khai báo ListIterator
		ListIterator<String> listIterator = null;
		listIterator = listString.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

	public static void addToList() {
		List<Integer> integerList = new ArrayList<Integer>(1000);
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		integerList.add(2, 10); // add() with specified index
		System.out.println(integerList.toString()); // -> [1, 2, 10, 3]
		
		List<Integer> integerList2 = new ArrayList<Integer>(1000);
		integerList2.add(11);
		integerList2.add(12);
		
		integerList.addAll(integerList2); // addAll() to the end of list
		integerList.addAll(0, integerList2); // addAll() with specified index

		System.out.println(integerList.toString()); // -> [1, 2, 10, 3, 11, 12]
	}
	
	public static void get_Set_Remove() {
		List<Integer> integerList = new LinkedList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		
		// get
		System.out.println(integerList.get(0)); // -> 1
		
		// set
		integerList.set(2, 10);
		System.out.println(integerList.toString()); // -> [1, 2, 10]
		
		// remove
		integerList.remove(0);
		System.out.println(integerList.toString()); // -> [2, 10]
	}

	public static void main(String[] args) {
		get_Set_Remove();
	}
}
