// WAP to print all the premitive datatype and string ...
// class Globalvariable{

    
    
        // static int a;
        // static short b;
        // static byte c;
        // static long d;
        // static float e;
        // static double f;
        // static char g;
        // static boolean h;
        
        
        //     public static void main(String [] args){
            

        //     System.out.println(a);
        //     System.out.println(b);
        //     System.out.println(c);
        //     System.out.println(d);
        //     System.out.println(e);
        //     System.out.println(f);
        //     System.out.println(g);
        //     System.out.println(h);
        //     }


    //we cannot re-initialize global variables in a gloabal scope 
    
        // static int a = 20;
        // int = 10;  // re-initialize not possible
        // public static void main(String[] args)
        // // {
        //     System.out.println(a); //there is a CTE in int= 10;
        // }


    //if we have a global and local variable in a same name then local variable get preference...

    // class Globalvariable{
    //     static int b= 20; //global varables 
    //     public static void main (String [ ] args )
    // {
    //     int b = 30; //local variables 

    //     System.out.println(b);
    // }
    // }

                                                                                                                                                                    
// if we declared a global varibles without initialising it then when we try to utilize it we are getting  a default a value

class Globalvariable {

    // Global (class-level) variables — not initialized
    static int num;
    static boolean flag;
    static char letter;
    static String text;

    public static void main(String[] args) {
        System.out.println("Default int: " + num);         // 0
        System.out.println("Default boolean: " + flag);     // false
        System.out.println("Default char: '" + letter + "'"); // empty char       // these are the default value of some global variables.
        System.out.println("Default String: " + text);      // null
    }
}

//we cannot take two gloabl variables as a  same name 
public class MyClass {
    int number = 10;  // two gloabal variables as a same name 
    int number = 20;  // Error: variable 'number' is already defined  //CTE

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.number);
    }
}

//we cannot take two local variables as same name 

public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int x = 10;  // Error: variable 'x' is already defined in method main  //CTE
        System.out.println(x);
    }
}








        


    
