package main;
import stdlib.*;

public class Client {
	
	public static String lastName;
	public static Integer ID;
		
	public Client(String lastName, Integer ID) {
		Client.lastName = lastName;
		Client.ID = ID;
	}

	public String setName() {
		StdOut.println("Enter the new client's last name: ");
		Client.lastName = StdIn.readString();
		return lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int setID() {
		// must consolidate with array ID from 1-10 next in line
		return Client.ID = 1;
	}
		
	public Integer getID() {
		return ID;
	}
	
	public static void main(String[] args) {
		
		Client testClient = new Client(lastName, ID);
		testClient.setName();
		testClient.setID();
		StdOut.println(testClient.getLastName());
		StdOut.println(testClient.getID());
	}
		
	
}


