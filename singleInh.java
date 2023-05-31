//single inheritance
class A
{
    void show1()
    {
        System.out.println("A");
    }
}

class B extends A
{
    void show2()
    {
        System.out.println("B");
    }
}

void singleInh()
{
    public static void main(String[] args) {
        B obj=new B();
        obj.show1();
        obj.show2();
    }
}