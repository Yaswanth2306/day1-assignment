public class StaticNonStaticDemo {
    int nonStaticVar = 10;
    static int staticVar = 20;

    public static void main(String[] args) {
        StaticNonStaticDemo obj1 = new StaticNonStaticDemo();
        StaticNonStaticDemo obj2 = new StaticNonStaticDemo();

        obj1.nonStaticVar++;
        obj2.nonStaticVar++;
        staticVar++;

        System.out.println("Obj1 Non-Static: " + obj1.nonStaticVar);
        System.out.println("Obj2 Non-Static: " + obj2.nonStaticVar);
        System.out.println("Static Variable: " + staticVar);
    }
}