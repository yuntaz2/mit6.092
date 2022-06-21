import java.util.ArrayList;

class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Evan");
		names.add("Eugene");
		names.add("Adam");

		System.out.println(names.size());
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		names.set(0, "Matt");
		names.remove(1);
		System.out.println(names.size());
		for (int i = 0; i < names.size(); ++i) {
			System.out.println(names.get(i));
		}
		for (String s : names) {
			System.out.println(s);
		}
	}
}
