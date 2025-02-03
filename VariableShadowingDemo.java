public class VariableShadowingDemo {
    int x = 10; // Instance variable

    public void shadowingExample() {
        int x = 20; // Local variable shadows instance variable
        System.out.println("Local x: " + x);
        System.out.println("Instance x: " + this.x);
    }

    public static void main(String[] args) {
        new VariableShadowingDemo().shadowingExample();
    }
}