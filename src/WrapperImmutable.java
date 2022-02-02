public class WrapperImmutable {
    Integer i = 5;

    public static void main(String[] args) {
        WrapperImmutable wi = new WrapperImmutable();
        System.out.println("initial value - " + wi.i);

        modifier(wi.i);
        System.out.println("After value - " + wi.i);
    }

    private static void modifier(Integer i) {
        i = i+1;

    }
}
