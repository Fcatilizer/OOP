public class MyClass{
    private static int count;
    static{
        count = 0;
        System.out.println("Static block called");
    }
    public static void main(String[] args) {
        System.out.println("Main called");
        count++;
        System.out.println("count: " + count);
    }
}