package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes
		 * add,peek,remove,retrieve elements. Use For Each loop and while loop
		 * with Iterator to retrieve data. Store all the sorted data into one of
		 * the databases.
		 *
		 */
		List<String> lst = new ArrayList<String>();
		lst.add("alpha");
		lst.add("beta");
		lst.add("charlie");
		lst.remove("beta");
		System.out.println(lst);

		Iterator<String> iter = lst.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (String fe : lst) {
			System.out.println(fe);
			Iterator it = lst.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}

}