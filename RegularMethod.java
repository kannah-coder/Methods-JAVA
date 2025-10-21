public class RegularMethod {
    static void display(String msg) {
        System.out.println("Message: " + msg);
    }

    static void display(int num) {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        display("Java is fun!");
        display(2025);
    }
}
