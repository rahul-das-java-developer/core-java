class E
{
    public static void main(String[] args)
    {
        System.out.println("main starts");
        int i =10;  // local var of main
        E.m1();
        System.out.println(i);
        System.out.println("main ends");
    }

    public static void m1()
    {
        System.out.println("m1 starts");
        int i =20;  // local var of m1
        System.out.println(i);
        System.out.println("m1 ends");
    }

}