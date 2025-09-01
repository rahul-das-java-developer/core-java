class H 
{
    public static void main(String[] args) 
    {
        System.out.println("main method of class H starts here");
        I.main(null);
        System.out.println("main method of class H ends here"); 
    }    
}

class I 
{
    public static void main(String[] args) 
    {
        System.out.println("main method of class I starts here");
        System.out.println("main method of class I ends here"); 
    }    
}

