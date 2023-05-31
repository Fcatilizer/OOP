class X extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Thread X");
        }
        System.out.println("Exit from X");
    }
}

class Y extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Thread Y");
        }
        System.out.println("Exit from Y");
    }
}

class Z extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Thread Z");
        }
        System.out.println("Exit from Z");
    }
}

class Thread
{
    public static void main(String[] args) {
        X x=new X();
        Y y=new Y();
        Z z=new Z();
        x.setPriority(Thread.MIN_PRIORITY);
        y.setPriority(Thread.NORM_PRIORITY);
        z.setPriority(Thread.MAX_PRIORITY);
        x.start();
        y.start();
        z.start();
    }
}