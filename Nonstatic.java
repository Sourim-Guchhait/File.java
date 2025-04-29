// class Drive{

//     int a  = 10;
    
// }

// class Nonstatic{
//     public static void main(String[] args )
//     {
//         System.out.println(new Drive().a); //10
//     }

// }

//creating non static variables multiple times 

// class Drive{

//     int a  = 10;
//     int b = 20;
//     int c = 30;
//     int d =40;
    
    
// }

// class Nonstatic{
//     public static void main(String[] args )
//     {
//         Drive con = new Drive();
//         System.out.println(con.a);
//         System.out.println(con.b);
//         System.out.println(con.c);
//         System.out.println(con.d);

//     }
// }

//WAP to call nonStatic method in a main method....  

// class Nonstatic{
//     public static void main(String[] args )
//     {
//         new Nonstatic().m1();

//     }
//     public static void m1()
//     {
//         System.out.println("hi");
//     }

// WAP to access a nonstatic variables and a non static method of a class in another class in java simple


class Drive {
    int number = 10;  // non-static variable

   
    public void  m1(){
        System.out.println("Hello");
    
}
}


class Nonstatic {
    public static void main(String[] args) {
         new Drive().m1();  
    }
}

//Non-static initializers gets executed only when the object is created in main method 

//    class Nonstatic{


//     {
//         System.out.println("i am a block1");
//     }
//     public static void main(String[] args)
//     {
//         new Nonstatic ();
//         System.out.println("i am main()");
//         new Nonstatic();

//     }
//    }



