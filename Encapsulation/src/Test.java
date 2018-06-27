import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setFirstName("Ravi");
		c1.setLastName("Bhavsar");
		c1.setCreditCard("12345");

		Customer c2 = new Customer();
		c2.setFirstName("Ravi");
		c2.setLastName("Bhavsar");
		c2.setCreditCard("12345");


		System.out.println(c1.equals(c2)); //false - Different memory location - Not looking data

		Map<Customer,Expenses> customerExpensesMap = new HashMap<Customer,Expenses>();

		customerExpensesMap.put(c1,new Expenses());
		customerExpensesMap.put(c2,new Expenses()); //When enter more values , it will first goes into equals method to check ,
		//If similar value is exist then it won't add , if not then add
		//This avoids to insert any duplicate into data structure
		//Also help to retrive obje very fast

		System.out.println(customerExpensesMap.size()); // Check size when equals and hashcode is not implemented in Customer class

		/*
		check following cases
		1. Comment only hashcode
		2. Comment only equals
		3. Comment both implementations

		 */

		System.out.println("First Name:" + c1.getFirstName());
		System.out.println("Last Name:" + c1.getLastName());
		System.out.println("Credit Card:" + c1.getCreditCard());


	}



	/*

	https://dzone.com/articles/working-with-hashcode-and-equals-in-java

	two objects are equal if and only if they are stored in the same memory address.

	Contract
	==================
	If two objects are equal, they MUST have the same hash code.
	If two objects have the same hash code, it doesn't mean that they are equal.
	Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable ... etc.
	Overriding hashcode() alone doesn't force Java to ignore memory addresses when comparing two objects.

	equalTo
	===============
	- Which confirms two objects are same
	-

	hashCode()
	================
	- Returns an integer
	- Good to be unique
	- Helps to improve Collection performance

	 */

}
