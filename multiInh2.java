//multiple inheritance
interface Animal
{
    void eat();
}
interface Dog
{
    void bark();
}
class AnimalVehicle implements Animal,Dog
{
    public void eat()
    {
        System.out.println("eating...");
    }
    public void drive()
    {
        System.out.println("driving...");
    }
}
class multiInh2()
{
    public static void main(String args[])
    {
        AnimalVehicle obj=new AnimalVehicle();
        obj.eat();
        obj.bark();
        obj.drive();
    }
}
