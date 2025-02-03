public class FinalVariableDemo {
    public static void main(String[] args) {
        final int finalVar = 100;
        System.out.println("Final Variable: " + finalVar);

        // Uncommenting the below line will cause a compilation error
        // finalVar = 200;
    }
}