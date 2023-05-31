//find smallest number among three values
import java.util.*;
class smallest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a<b && a<c)
        {
            System.out.println("a is smallest");
        }
        else if(b<a && b<c)
        {
            System.out.println("b is smallest");
        }
        else
        {
            System.out.println("c is smallest");
        }
    }
}