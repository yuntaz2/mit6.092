public class Marathon {
    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate" };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265 };
        int first = times[0];
        int second = times[0];
        int idx[] = new int[2];
        for (int i = 1; i < names.length; ++i) {
            if (times[i] < first) {
                second = first;
                first = times[i];
                idx[1] = idx[0];
                idx[0] = i;
            } else if (times[i] < second) {
                second = times[i];
                idx[1] = i;
            }
        }
        System.out.println("The First is " + names[idx[0]] + ": " + times[idx[0]]);
        if (names.length > 1)
            System.out.println("The Second is " + names[idx[1]] + ": " + times[idx[1]]);
    }
}
