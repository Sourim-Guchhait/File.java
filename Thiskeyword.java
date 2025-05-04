//WAP to initialise 3 non-static variables with the help of constructor.

//This is the wrong way.......
// class Thiskeyword {

//     int a ;
//     int b ;
//     int c ;

//     Thiskeyword (int a , int b , int c)
//     {
//         a= a ;//0
//         b = b;//0  //The local variable will not assign its value to the global variables
//         c = c;//0  // here the local varibles and the golabal variables in same name 
//     }
//     public static void main(String[] args) {
//         Thiskeyword key = new Thiskeyword (10,20,30);

//         System.out.println(key.a);
//         System.out.println(key.b);
//         System.out.println(key.c);
//     }
// }


// //THis is the right way by using 'this' keyword ...... 

// class Thiskeyword {

//     int a ;
//     int b ;
//     int c ;

//     Thiskeyword (int a , int b , int c)
//     {
//         this.a= a ;//10
//         this.a= a ;//20   //
//         this.a= a ;//30
//     }
//     public static void main(String[] args) {
//         Thiskeyword key = new Thiskeyword (10,20,30);

//         System.out.println(key.a);
//         System.out.println(key.b);
//         System.out.println(key.c);
//     }
// }

//class Should Student
class Thiskeyword
 {
    int id;
    String name;
    static String schoolName="parkcircus";
    Thiskeyword(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        Thiskeyword s1=new Thiskeyword(1,"sourim");
        Thiskeyword s2=new Thiskeyword(2,"souro");
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.schoolName);
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.schoolName);


        
    }
}


