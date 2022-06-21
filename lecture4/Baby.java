public class Baby {
    String name;
    boolean isMale;
    double weight;
    int numPoops = 0;
    static int numBabies = 0;

    Baby(String myname, boolean maleBaby, double myWeight) {
        name = myname;
        isMale = maleBaby;
        weight = myWeight;
        numBabies++;
    }

    void poop() {
        numPoops++;
        System.out.println("dear mother");
    }

    void hi() {
        System.out.println("Say hi");
    }

    public static void main(String[] args) {
        Baby Matt1 = new Baby("Matt", true, 4);
        Baby Matt2 = new Baby("Matt", true, 4);
        System.out.println(Matt1.name == Matt2.name);
        Matt1.hi();
        System.out.println(Baby.numBabies);
    }
}
