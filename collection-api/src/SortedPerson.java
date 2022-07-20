import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	
	public static void main(String[] args) {
		
	//Comparator<Person> comAge = (p1,p2) -> p1.getAge() - p2.getAge();
	
    //Comparator<Person> comName = (p1,p2) -> p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> people = new TreeSet<Person>();
		people.add(new Person("Thsi",11));
		people.add(new Person("tony",22));
		people.add(new Person("ack",25));
		
		for (Person p :people)
			System.out.println(p);

	}
}