// WAP to demonstrate the break keyword....

// its transfer the ctrl from one block to another block
// using inside the loops and switch block


class Break{
    public static void main(String[] args)

    {
        for(int i = 1 ; i<=5; i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
}
}

// We cannot de statments after using break keyword ....
class Break {
    public static void main(String[] args) {

        for(int i = 1; i<=5; i ++){
            if(i==4)
            
            
        {
            break;
            System.out.println(i); 
            //CTE// Once break; is executed, the loop breaks — any code after break; in the same block is never reached.
            //unreachable statement.
        }
        // System.out.println(i); //1 2 3 
            
       
    }
}
}

// break using in swich case......
class Break {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {            //switch case
            case 1:
                System.out.println("Monday");
                break;  // exits switch
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;  //No need for break after default (but you can add it)
        }
    }
}

//break using loops ....public class BreakInLoop 

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // exits the loop
            }
            System.out.println(i);  // prints 1, 2
        }
    }

