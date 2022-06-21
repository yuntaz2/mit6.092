public class FooCorporation {
    public static double calculate(int time, double basePay) {
        double paid = 0.0;
        if (basePay < 8) {
            System.out.println("Less than minimum wage");
        } else if (time <= 40) {
            paid = basePay * time;
        } else {
            paid = basePay * 40 + basePay * 1.5 * (time - 40);
        }
        return paid;
    }

    public static void main(String[] args) {
        System.out.println("Employee 1: " + calculate(35, 7.50));
        System.out.println("Employee 2: " + calculate(47, 8.20));
        System.out.println("Employee 2: " + calculate(73, 10.00));
    }
}
