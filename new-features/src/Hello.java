public interface Hello {

	String sayHello();
	
	default String sayBye() {
		return "Asia La Vista";
	}
	
	static void greet() {
		System.out.println("Happy Holidays");
	}
}
