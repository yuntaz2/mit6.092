import java.util.HashMap;

class MapExample {
	public static void main(String[] args) {
		HashMap<String, String> nameEmail = new HashMap<String, String>();
		nameEmail.put("Evan", "email1@uci.edu");
		nameEmail.put("Eugene", "email2@uci.edu");
		nameEmail.put("Adam", "email3@uvi.edu");
		System.out.println(nameEmail.size());
		nameEmail.remove("Evan");
		System.out.println(nameEmail.get("Adam"));

		for (String s : nameEmail.keySet()) {
			System.out.println(s);
		}
		for (String s : nameEmail.values()) {
			System.out.println(s);
		}
		for (HashMap.Entry<String, String> pairs : nameEmail.entrySet()) {
			System.out.println(pairs);
		}
	}
}
