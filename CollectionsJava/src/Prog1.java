import java.util.HashSet;
import java.util.Set;

public class Prog1 {

	public static void main(String[] args) {
	Set<String> hs=new HashSet<String>();
	hs.add("apple");
	hs.add("mango");
	hs.add("grapes");
	System.out.println(hs);
	hs.remove("apple");
	System.out.println(hs);
	System.out.println(hs.contains("grapes"));
	System.out.println(hs.isEmpty());

	}

}
