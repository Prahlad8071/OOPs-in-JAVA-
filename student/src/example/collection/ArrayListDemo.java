package example.collection;
import java.util.ArrayList;
public class ArrayListDemo {
	
	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(5);
		list1.add(9);
		list1.add(2,10);
		//list1.remove(Integer.valueOf(2));
		list1.set(2, 30); //replaces the value
	
	System.out.println(list1);
	
//	for(int i=0;i<list1.size();i++) {
//		System.out.println(list1.get(i));
//	}
	
//	for(Integer x : list1) {
//		System.out.println(x);
//	  }
	System.out.println(list1.contains(1));
	
	}
}
