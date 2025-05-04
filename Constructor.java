//Example of a constructor...
// Constructor name should be same name as a classname .....
// class Nonstatic {          //also the class name and the file name should be same
//     Nonstatic()
//     {
//         System.out.println("i am constructor");
//     }

//     public static void main(String[] args) {
//         System.out.println("i am main");
//         new Nonstatic();
//     }
//     //output as ' i am main'
//             //  'i am a constructor'
// }

//if constructor name is different with the class name then no output will be printed jvm will treat the constructor as a regular method.
class Nonstatic {
    CustomConstructor() {   // This is a method, not a constructor
        System.out.println("i am constructor"); // CTE cause class name and constructor not same
    }

    public static void main(String[] args) {
        System.out.println("i am main");
        new Nonstatic();  // This creates an object of the Nonstatic class
    }
    // output as 'i am main'
}

// WAP to print non- static initializers execute first then the cnstrictor will be executed .
// class Constructor {
//     Constructor() {  
//         System.out.println("i am constructor");
//     }
//     {
//         System.out.println("i am nonstatic initializer");
//     }

//     public static void main(String[] args) {
//         System.out.println("i am main");
//         new Constructor(); //object call the constructor , but here static initializer is present so that prefer first as obect call the static and non static initializers first.
//     }
// }

// //NOw coming back the types of constructor -->>
// //1. Default Constructor 
// //2. No-argument Constructor

// //Default Constructor....
// //example..
// class Constructor{
    
//     public static void main(String[] args)
//     {
//         Sytem.out.println("i am from armbagh");
//         new Constructor();   //default constructor is here
//     }

// }

// //NO-argument Constructor...
// //example..
// class Constructor{
//     Constructor(){
//         System.out.println("i am sourim");
//     }
    
//     public static void main(String[] args)
//     {
//         Sytem.out.println("i am from armbagh");
//         new Constructor();   //default constructor is here
//     }

// }





