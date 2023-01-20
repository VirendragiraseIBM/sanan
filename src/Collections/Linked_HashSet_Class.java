package Collections;

import java.util.LinkedHashSet;

public class Linked_HashSet_Class {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Anky");
		lhs.add('A');
		lhs.add(200);
		lhs.add(null);
		lhs.add(null);
		lhs.add("Anky");
		//print all the data
		System.out.println(lhs);//order of insertion is maintained
		
	}
}
