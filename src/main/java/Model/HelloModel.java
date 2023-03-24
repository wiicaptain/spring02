package Model;

import java.util.HashMap;
import java.util.Map;

public class HelloModel {
		private Map<String,String> messages;

		public HelloModel() {
			messages=new HashMap<String,String>();
			messages.put("John", "Hello");
			messages.put("Ray", "Welcome");
			messages.put("Vincent", "Hi");
		}

		public String sayHello(String user) {
			String msg=messages.get(user);//get(key)人名對應
			
			return msg+","+user+"!";
		}


}
