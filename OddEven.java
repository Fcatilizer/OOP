class OddEven
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Even numbers:");
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers:");
        for(i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}