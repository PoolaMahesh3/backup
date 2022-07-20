import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		LinkedList<String> lst =new LinkedList<String>();
		lst.add("Microsfoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addLast("Appache");
		lst.add(2,"Oracle");
		
		System.out.println("---Iterating using for loop---");
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
			
			System.out.println("---Iterating using  while---");
			Iterator<String>itr=lst.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			
			System.out.println("---Iterating  using foreach loop---");
			
			for(String e:lst)
				System.out.println(e);
			
			ArrayList<String> arr= new ArrayList<String>();
			arr.add("IBM");
			arr.add("Apple");
			arr.add("JBoss");
			
			arr.addAll(lst); //merging collection into another
			System.out.println("---Iterating  using foreach loop---");
			for(String e:arr)
				System.out.println(e);
			
			HashSet<String> set=new HashSet<String>(arr);
			System.out.println("---Iterating  using foreach loop---");
			for(String e:set)
				System.out.println(e);
			
			
			TreeSet<String> tree = new TreeSet<String>(set);
			System.out.println("--iterating over sorted collection");
			for (String e : tree)
				System.out.println(e);
			
		}
		
	}

}