public class Static NonStatic{
    static int static variable;
    int non static variable = 0;

    public static NonStatic(){
        System.out.println("Static constructor called");
    }
    public static void main(String[] args) {
        System.out.println("Main called");
        static variable++;
        System.out.println("static variable: " + static variable);
        NonStatic obj = new NonStatic();
        obj.non static variable++;
        System.out.println("non static variable: " + obj.non static variable);
    }
}