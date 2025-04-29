    import java.util.Scanner;
    class if-else-if{
    //largest of the 3 input number 

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char name :")
        char char = next().charAt(0);
        
        

        System.out.println("enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        System.out.println("enter the num3");
        int num3 = sc.nextInt();

        if(
            num1>num2 && num1>num3
        )
        {
            System.out.println("largest number is num1 :" +num1);
        }
         else if(num2>num2 && num2>num3)
         {
            System.out.println("largest number is num2 :" +num2);

         }
         else if(num3>num2 && num3> num1)
         {
            System.out.println("largest number is num3 :" +num3);
         }
         else
         {
            System.out.println("others");
         }

//ticket prize according to age

        System.out.println("enter the age :");
        int age = sc.nextInt();

        if(age<=5){
            Sytem.out.println("ticket prize is 0:");

        }
        else if(age>5 && age<=18)
        {
            System.out.println("ticket prize is 100:" );
        }
    }
    }