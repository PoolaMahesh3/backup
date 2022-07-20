import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<String> que= new LinkedList<String>();
		que.add("a");
		que.add("b");
		que.offer("d");
		que.offer("c");
		
		System.out.println("Actual Element" +que);
		System.out.println(que.element());
		System.out.println("Actual Element" +que);
	
		
	}

}
