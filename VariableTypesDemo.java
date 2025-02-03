public class VariableTypesDemo {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void showVariables() {
        int localVar = 30; // Local variable
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableTypesDemo obj = new VariableTypesDemo();
        obj.showVariables();
    }
}