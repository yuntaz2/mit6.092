import java.util.TreeSet;

class SetExample {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Evan");
		names.add("Adam");
		names.add("Eugene");

		System.out.println(names.size());
		System.out.println(names.first());
		System.out.println(names.last());

		names.remove("Evan");

		for (String s : names) {
			System.out.println(s);
		}
	}
}
