
public class StringPatternDemo {

	public static void main(String[] args) {
		String email="mahesh@gmail.com";
		String emailpattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				
	 System.out.println(email.matches(emailpattern));
	 
	 String cc="687557654";
		String ccpattern="[1-9][0-9]{15}";

		 System.out.println(cc.matches(ccpattern));
	}

}
