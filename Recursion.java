// class Recursion {
//     int  a =10;      //non static var
//     static int b = 20;  //static var
//     public static void main(String[] args)
//     {
//         //print the object of new Recursion() can access both static and non-static variable
//         System.out.println(new Recursion().a); //10
//         System.out.println(new Recursion().a); //10

//         //simple print so have the access of only static variables , no non-static variables are not accessble
//         System.out.println(Recursion.a); //CTE
//         System.out.println(Recursion.b); //20
//     }
// }

    class Recursion{
        public static void main(String[] args)
        {
            new Recursion().m1(); //creating object as 'new classname()' and .m1()
        }
        public void m1()
        {
            System.out.println("Bye");
        }
        
    }
