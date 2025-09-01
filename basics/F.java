class F 
{
    public static void main(String[] args) 
    {
        System.out.println("main method of class F starts");   
        F.m1();
        System.out.println("main method of class F ends");    
    }

    public static void m1() 
    {
        System.out.println("m1 method of class F starts");   
        F.m2();
        System.out.println("m1 method of class F ends"); 
    }

    public static void m2() 
    {
        System.out.println("m2 method of class F starts");   
        System.out.println("m2 method of class F ends"); 
    }

}

