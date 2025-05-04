//Parameterised Constructor
//Example..
// class Parameterisedconst{
//     Parameterisedconst(int a)  //Constructor stores value 10 from object
//     {
//         System.out.println("i am Const");  //print the statement of the constructor
        
//     }
//     public static void main(String[] args)
//     {
//         new Parameterisedconst(10);
//     }
// }

// ////printing the value of the object stored in constructor.
// class Parameterisedconst{
//     Parameterisedconst(int a)
//     {
//         System.out.println("i am Const");
//         System.out.println("a" +a);       //printing the value of a 
//     }
//     public static void main(String[] args)
//     {
//         new Parameterisedconst(10);
//     }
// }

// //WAP to re-initialized a non-static variables.
// class Parameterisedconst
// {
//     int a ;
//     public static void main(String[] args)
//     {
//         Parameterised obj1=new Parameterised();
//         System.out.println(obj1.a);
//         obj1.a=10;  //re-initialize
//         System.out.println(obj1.a);
//     }
// }

//     //WAP to initialized a non-static variables with the help of parametererised constructor
class Parameterisedconst{
        int a; 
        int b;
        int c;

        Parameterisedconst(int temp1, int temp2, int temp3)
        {
            a = temp1;
            b = temp2;
            c = temp3;

        }
        public static void main(String[] args)
        {
            Parameterisedconst obj1= new Parameterisedconst(10,20,30);
            System.out.println(obj1.a);
            System.out.println(obj1.b);
            System.out.println(obj1.c);
            

        }
    }


//     //Wap to reinitialised 3 non-static variables using constructor
//     class Parameterisedconst{
//         int a ;
//         int b;
//         int c;
//         Parameterisedconst(int temp1 , int temp2, int temp3)
//         {
//             a = temp1;
//             b = temp2;
//             c = temp3;

//         }
//         public static void main(String[] args)
//         {
//             Parameterisedconst obj1= new Parameterisedconst(10,20,30);
//             System.out.println(obj1.a);
//             System.out.println(obj1.b);
//             System.out.println(obj1.c);

//         }
//     }

//         //WAP to initialised 3 nonstatic variables with the help of the constructor
//         class Parameterisedconst{
//         int a ;
//         int b;
//         int c;
//         Parameterisedconst(int a , int b, int c)
//         {
//             a = a; //0
//             b = b; //0      // here local variables re-initialized the local variables
//             c = c; //0      //here as a output anythis can be stored as OP '0'

//         }
//         public static void main(String[] args)
//         {
//             Parameterisedconst obj1= new Parameterisedconst(10,20,30);
//             System.out.println(obj1.a);
//             System.out.println(obj1.b);
//             System.out.println(obj1.c);

//         }

//          class Parameterisedconst{
//         int a ;
//         int b;
//         int c;
//         Parameterisedconst(int a , int b, int c)
//         {
//             this.a = a; //10
//             this.b = b;  //20     // here local variables re-initialized and convert into global variables using 'this' keyword
//             this.c = c; //30      //'this' is differnciate btw golbal var and local var when they are same in name

//         }
//         public static void main(String[] args)
//         {
//             Parameterisedconst obj1= new Parameterisedconst(10,20,30);
//             System.out.println(obj1.a);
//             System.out.println(obj1.b);
//             System.out.println(obj1.c);

//         }
        
//     }
        
//     }

// class Parameterisedconst {

//     int a=20;  // class-level (non-static) variable

//     Parameterisedconst(int ax) {
//         // System.out.println(a);
//         System.out.println("Constructor called with value: " + a);
//         a = ax;  // <-- You must write this line to store the value
//         System.out.println(a);
//     }

//     public static void main(String[] args) {
//         new Parameterisedconst(10); 

//         // A obj = new A(11);

//         // int x = obj.add(4,3);
//         // System.out.print(x);
//     }
    
// }
