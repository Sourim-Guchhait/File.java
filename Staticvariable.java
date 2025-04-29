class Staticvariable{
    //WAP a program to access static variables..
    //static pul area
    static int a = 10; //static variables

    public static void main (String[] args)
    {
        System.out.println(a); //10
        System.out.println(Staticvariable.a); //10 //we can access the static member by using classname
    }

//non static member cannot be allowed by using class name

     int a = 10; //static variables

    public static void main (String[] args)
    {
        System.out.println(a); //10
        System.out.println(Staticvariable.a); //CTE
    }
    
    //global variables/local variables can be print as (classname.var)
    //localy variables can be print as normla print of var.

    static int a=10;
    public static void main(String[] args)
    {
        int a = 20;
        System.out.println(a);
        System.out.println(Staticvariable.a);
    }

    //WAP to access a static variales of a class in another class
    class Variable  // this will be the class name if the first name is not taken....
    {

        static int a = 20;
    }

    class Drive {
        public static void main(String[] args)
        {
            System.out.println(a);  //CTE
            System.out.println(Variable.a);  // here '.' is the 'access' of a particular classname which class we have to access.

        }
    }





}