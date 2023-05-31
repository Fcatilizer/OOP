//method overloading
class overloading
{
    double area(double r)
    {
        return 3.14*r*r;
    }
    double area(double l,double b)
    {
        return l*b;
    }
}
class OverloadingM
{
    public static void main(String[] args) {
        overloading obj=new overloading();
        System.out.println("Area of circle: "+obj.area(5.0));
        System.out.println("Area of rectangle: "+obj.area(5.0,6.0));
    }
}