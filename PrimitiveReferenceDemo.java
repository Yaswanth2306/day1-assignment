public class PrimitiveReferenceDemo {
    public static void main(String[] args) {
        int primitive = 10; // Primitive
        int[] reference = {1, 2, 3}; // Reference

        System.out.println("Primitive: " + primitive);
        System.out.println("Reference (before): " + reference[0]);
        
        reference[0] = 42; // Modifies actual array
        System.out.println("Reference (after): " + reference[0]);
    }
}
