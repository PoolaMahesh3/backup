import java.util.Locale;
import java.util.ResourceBundle;
public class LocalDemo {
	public static void main(String[] args) {
		//ResourceBundle bundle=ResourceBundle.getBundle("msgs",Locale.FRENCH);
		Locale hindi=new Locale("HI");
		ResourceBundle bundle=ResourceBundle.getBundle("msgs",hindi);
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
		}
}