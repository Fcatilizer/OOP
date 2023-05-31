//Square root
import java.util.*;
class SquareRoot
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        double temp;
        double sr = num/2;
        do{
            temp=sr;
            sr=(temp+(num/temp))/2;
        }while((temp-sr)!=0);
        System.out.println("Square root of "+num+" is: "+sr);
    }
}