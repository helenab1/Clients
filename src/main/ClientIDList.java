package main;
import java.util.ArrayList;
import java.util.List;

import stdlib.*;

public class ClientIDList {
	
	private String[] myLists = new String[10]; // 10 is max number of lists
	private String currList;
	
	public static void createList(String listName) {
		List<Client> clientIDs = new ArrayList<>();
		
		// add test client 0
		//clientIDs.add(McTest, 0);
	}
	
	public static void loadList(String listName) {
		// display all saved list names (iterate)
		// enter name to load
	}
	
	public static ClientIDList loadLastList(int lastPos) {
		return null;
		//return ClientIDList[lastPos];
	}
			
	
	public static void main(String[] args) {
		
		// load (from file) last worked on list
		StdOut.println("Type 1 to continue or 2 to create new list.");
		int choice = StdIn.readInt();
		
		
		
		
		
		
	}
}


