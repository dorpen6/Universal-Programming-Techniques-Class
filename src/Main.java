// TODO: we need to add the missing classes!

// I will add 'Adder' on one branch and 'Subtractor' on another branch.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(2, 3));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(10, 4));
    }
}