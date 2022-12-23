import java.util.Enumeration;
import java.util.Hashtable;

import org.junit.platform.commons.annotation.Testable;
@Test
public class HashTable {

	public static void main(String[] args) {
		Hashtable<String,Double> table=new Hashtable<String,Double>();
		Enumeration names;
		String str;
		double val;
		table.put("apple", (123.13));
		table.put("banana", (122.16));
		table.put("mango", (120.50));
		names=table.keys();
		while(names.hasMoreElements())
		{
			str =(String)((Enumeration) table).nextElement();
			System.out.println(table.get(str));
			
		}
			
		}
		

	}


