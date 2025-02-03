public class VariableScopeDemo {
    int instanceVar = 50;

    public void methodScope() {
        int methodVar = 100;
        {
            int blockVar = 200;
            System.out.println("Block Variable: " + blockVar);
        }
        System.out.println("Method Variable: " + methodVar);
    }

    public static void main(String[] args) {
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.methodScope();
    }
}