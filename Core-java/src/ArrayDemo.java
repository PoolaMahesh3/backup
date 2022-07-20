import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] sort = {4,2,5,3,1};
		Arrays.sort(sort);
		//System.out.println("Elements are Sorted");
		for(int i=0; i<sort.length; i++) {
			System.out.println(sort[i]);
		}

	}

}
