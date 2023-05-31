//string index out of bound exception example
public class StringIndex{
    public static void main(String[] args) {
        String str = "Hello";
        try{
            char c = str.charAt(10);
            System.out.println("c: " + c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
    }
}