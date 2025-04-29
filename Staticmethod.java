class Staticmethod{
    public static void m1()
    {
        System.out.println("hello boys");

    }
    public static void main(String[] args)
    {
        m1();
        Staticmethod.m1();
    }

//     //WAP to call static method of class in another class
    class Drive{
        public static void m1()
        {
            System.out.println("i am sourim");
        }
    }
        class Staticmethod{
            public static void main(String[] args)
            {
                // m1();   //CTE
                Drive.m1();
            }
        }



    
}