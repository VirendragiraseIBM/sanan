package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Veer");
		v.add(100);
		v.add('A');
		v.add(null);
		
		//print entire data
		System.out.println(v);
		
//		//empty or not
//	System.out.println(v.isEmpty()); //false
		
//		//size of collection
//	System.out.println(v.size());//4
		
//		//contains or not
//		System.out.println(v.contains(200));//false
//		//get index
		//System.out.println(v.get(3));
		//iterator
		Iterator itr=v.iterator();
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
	//	}
		//listiterator
	//ListIterator Litr=v.listIterator();
	//while(Litr.hasNext()) {
		//	System.out.println(Litr.next());
//  }
		//enumation
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		//using for each loop
				for(Object a1:v) {
					System.out.println(a1);
				}	
	}	

	}


