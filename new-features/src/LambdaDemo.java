import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;
public class LambdaDemo {
	public static void print(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Consumer<String> c1= (s) ->System.out.println(s);
		c1.accept("Hello");
		
		Consumer<String> c2= System.out::println;
		c2.accept("Mahi");
		
		Consumer<String> c3=LambdaDemo::print;
		c3.accept("Mahesh");
		
		Consumer<Integer> c4=LambdaDemo::print;
		c4.accept(70000);
		System.out.println("\n");
		
		Supplier<String> s=()->"Venkat";
		System.out.println(s.get());
		
		Supplier<Integer> s1=()->(int)(Math.random() *100);
		System.out.println(s1.get());
		
		Predicate<Integer> positive = (x) -> x >= 0;
		System.out.println(positive.test(-5));
		System.out.println(positive.test(10));
		
		BiPredicate<String, String> contains = (s2,c) -> s2.contains(c);
		System.out.println(contains.test("Hi", "a"));
		System.out.println(contains.test("Mahesh", "M"));
		
		Function<Integer,Integer> square = (x) -> x*x;
		System.out.println(square.apply(5));
		
		BiFunction<Integer,Integer,	Integer> c =(a,b)->a+b;
		System.out.println(c.apply(10,20));
		
	}
}