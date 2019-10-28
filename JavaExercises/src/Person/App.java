package Person;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Person guy = new Person("Guy", 21, "Ninja");
		Person cody = new Person("Cody", 25, "Mayor");
		Person lucia = new Person("Lucia", 23, "Cop");
		Person haggar = new Person("Haggar", 59, "Former Mayor");

		ArrayList<Person> people = new ArrayList<>();
		people.add(guy);
		people.add(cody);
		people.add(lucia);
		people.add(haggar);

		
		//for (Person fighters : people) { System.out.println(fighters.toString()); }
		 
		Scanner s = new Scanner(System.in);
		System.out.println("-------------\nSearch Person: ");
		String name = s.nextLine();

		findPerson(name, people);
		s.close();

	}

	public static void findPerson(String personName, ArrayList<Person> people) {
		for (Person name : people) {
			if (name.getName().equals(personName)) {
				System.out.println("Searching " + personName + "--> \n-------------" + name.toString());
			} else {
				System.out.println("------------>\nPerson Not Found.");
				break;
			}
		}
	}

}
