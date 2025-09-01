class D
{
    int i = 2;  // Instance var or non-static var
    static int j =3;    // class var or static var
    public static void main(String[] args)
    {
        int k = 4;  // local var
                    // local variable cannot be used without initialization
        System.out.println(k);

    }
}