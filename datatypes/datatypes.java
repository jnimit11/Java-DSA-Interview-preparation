public class datatypes {
    public static void main(String[] args) {

        // Primitive datatypes:
        // 1.Integral datatypes, whole numbers without any decimal points.
        int a = 1; // range -2.14 billion se +2.14 billion tak
        byte b = 2; // range = -128 se 127 tk
        short c = 3; // range = -32,768 se 32,767 tak
        long myNum = 1234567890; // longest, used for storing lagr numbers > int.
        System.out.println(a + b + c);
        System.out.println(myNum);

        // 2. Floating point (decimal numbers)
        float pi = 3.14f;
        double price = 99.99; // (8 bytes)
        System.out.println(pi);
        System.out.println(price);

        // 3. Characters: Stores only a signle character ex ('A')
        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade: " + grade);
        System.out.println("symbol: " + symbol);
        // Boolean: true or false

        // Non- primitive:
        // Strings, Arrays, classes, objects

        String name = "Nimit";
        String message = "Welcome to DSA journey";
        System.out.println("Name: " + name);
        System.out.println("message: " + message);

    }
}