package oops;

import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
	

		    {
		        // Creating object of the
		        // class linked list
		        LinkedList<String> ll = new LinkedList<String>();
		 
		        // Adding elements to the linked list
		        ll.add("Automation");
		        ll.add("Manual");
		        ll.addLast("jira");
		        ll.addFirst("Agile");
		        ll.add(2, "CRM");
		         
		        System.out.println(ll);
		 
		        ll.remove("Anil");
		        ll.remove(3);
		        ll.removeFirst();
		        ll.removeLast();
		 
		        System.out.println(ll);
		    }
		}
		// TODO Auto-generated method stub

	}


