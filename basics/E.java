class E 
{
    public static void main(String[] args) {
        System.out.println("main method starts here"); 
        E e1 = new E();
        e1.m1(); 
        System.out.println("main method ends here");    
    }

    public void m1() 
    {
        System.out.println("m1 method starts here");  
        System.out.println("m1 method ends here");  
    }
}
    