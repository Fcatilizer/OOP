//Constructor Overloading
import java.util.*;
class volume
{
    int l,b,h;
    void volume()
    {
        System.out.println("volume of rectangle: "+l*b*h);
    }
    void volume(int x)
    {
        System.out.println("volume of cuboid: "+x*x*x);
    }
}

class OverloadingC
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        volume obj=new volume();
        System.out.println("Enter the length, breadth and height of the cuboid: ");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        obj.volume(l,b,h);
        System.out.println("Enter the side of the cube: ");
        int x = sc.nextInt();
        obj.volume(x);
    }
}
