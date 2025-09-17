package example.collection;

import java.util.LinkedList;
public class LinkedListDemo {
	
	public static void main(String args[]) {
    LinkedList<Integer> ll1 = new LinkedList<>();
    ll1.add(1);
    ll1.add(2);
    ll1.add(4);
    ll1.add(1);
    
    ll1.addFirst(0);
    ll1.addLast(3);
    ll1.remove(4);
  
    System.out.println(ll1.getLast());
    
    
    
    
	}
    
}
