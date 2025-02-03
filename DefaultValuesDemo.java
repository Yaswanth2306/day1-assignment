public class DefaultValuesDemo {
    int instanceVar;
    static int staticVar;

    public static void main(String[] args) {
        DefaultValuesDemo demo = new DefaultValuesDemo();
        System.out.println("Default Instance Variable: " + demo.instanceVar);
        System.out.println("Default Static Variable: " + staticVar);
    }
}
