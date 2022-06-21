public class Hello {
    public static void main(String[] arguments) {
        double foo = 1.2 + 2.3 * 3.4;
        System.out.println(foo);
        double copy = foo;
        copy = copy / 2.0;
        System.out.println("foo: " + foo);
        System.out.println("copy: " + copy);
    }
}
