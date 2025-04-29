//controlflowStatements
// 1.Decision statement  2. Looping statement

//Decision statement
import java.util.Scanner;
class ControlFlow{

    public static void main(String[] args)
    {
        System.out.println("Program Starts");

        int x=10;
        
    }
    if(x==10)
    {
        System.out.println("this is the program inside the block");
    }
    System.out.println("program ends");

    if(x==5)
    System.out.println("program out of the box");


}

 //if statement....

class Ifstatement1{

    public static void main(String[] args)
    {
        System.out.println("Program Starts");

        int num = -10;
        if(num<5){
            System.out.println(num+" +is less than 5");

        }
        System.out.println("Program ends");
        
    }
}

// //if-else statements...

class Ifelsestatement1{

    public static void main(String[] args)
    {
        System.out.println("Program Starts");

        int num = 10;
        if(num<5){
            System.out.println(num+" +is less than 5");

        }
        else
        System.out.println(num+" +is not less than 5");
        
        System.out.println("Program ends");
        
    }
}

//if else if ladder....

    {
        class IfelseifStatement{
            public static void main(String[] args){
            int a =54;
            if( a == 34)
            {
                System.out.println("a is not same ");
            }
            else if (a == 54)
            {
                System.out.println("a is same");
            }
            else
            {
                System.out.println("a is other");
            }
        }
    }

    //nested-if statement....

    class nestedif{
            public static void main(String [] args){
            int a =10;
            if(a==10){
                if(a>5){
                    System.out.println("Wrong");
                }
            
        }
    }
    }

    //nested if-else statement...

 //switch case with break;

        int choice= 1;
        switch(choice){
            case 1 : System.out.println("english");
            break;
            case 2 : System.out.println("Hindi");
            break;
            case 3 : System.out.println("Bengali");
            break;
            case 4 : System.out.println("Bhojpuri");}
 //switch case without break;

        int choice= 3;
        switch(choice){
            case 1 : System.out.println("english");
            case 2 : System.out.println("Hindi");
            case 3 : System.out.println("Bengali");
            case 4 : System.out.println("Bhojpuri");}

//using default:
        
        int choice= 35464;
        switch(choice){
            case 1 : System.out.println("english");
            break;
            case 2 : System.out.println("Hindi");
            break;
            case 3 : System.out.println("Bengali");
            break;
            case 4 : System.out.println("Bhojpuri");
            
            default: System.out.println("Wrong choice ");
            break;}

     //Wap to check the given alphabate is vowel or consonant;
            
            char choice= 'a';
        switch(choice){
            case 'a' : 
            case 'e' : 
            case 'i' :
            case 'o' : 
            case 'u': System.out.println("vowel");
            break;
            
            default: System.out.println("consonant");
            break;
            }

 //Wap to print the day with a day number .....

        int choice= 1;
        switch(choice){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thursday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("saturday");
            break;
            
            default: System.out.println("Wrong choice ");
            break;
            }
                             
    }





