//method is a block of code which is used to perform a specific task
//public static void main String args 
//public = public,protected,private,default
//static = static,access,abstract......
//void = two types 1.byte,short,int,long..... and 2.void,arrays,
class Method{

    // public static void main(String[] args )
    // {
    //     add();
    // }
    // public static void add()
    // // {
    //     int i = 29;
    //     int b= 23;
        



    //     System.out.println(String[] args)


    // }

    // NO-argument Method

    // display();
    // {
    //     System.out.println("habibi come to kolkata");
    // }

    // //WAP to design a method which adds two numbers and print the result
    // //method calling statement

    // {
    // int a = 10;
    // int b= 20;
    // int res = a+b;
    // System.out.println("the result is : " +res);}

    // //WAP to design a methods which substract two integers and print the res...

    // public static void main(String[] args )
    // {
    //     substract();
    // }
    // public static void substract(){
    //     int a =30;
    //     int b = 20;
    //     int res= a-b;
    //     System.out.println("the result is :" +res);
    // // }

    // //parameterized Method..... 
    // //Wap to design a parameterized method which addition two integers and print the result...  

    // public static void main(String[] args )
    // {
    //     add(20,10);
    // }
    // public static void add(int a , int b)
    // {
    //     int res = a+b;
    //     System.out.println("the result is :"+res);
    // // }

    // //Wap to design a parameterized method which substract two integers and print the result... 

    // public static void main(String[] args )
    // {
    //     substract(20,10);
    // }
    // public static void substract(int a , int b)
    // {
    //     int res = a-b;
    //     System.out.println("the result is :"+res);
    // }

    //When the length of Formal arguments and Actual Arguments are same then only method will be called otherwise CTE.

    // public static void main(String[] args )
    // {
    //     substract(20);
    // }
    // public static void substract(int a , int b)
    // {
    //     int res = a-b;
    //     System.out.println("the result is :"+res);
    // }

    //Wap to design a program to designa  pararmeterized method which accept an integers and return tyoe of it

    // public static void main(String[] args )
    // {
    //     int data = square(20);
    //     System.out.println(data);
    // }
    // public static int square(int a)
    // {
    //     int res = a*a;
    //     return res;
    // }

    //WAP to design a method which returns values of a cube ...

    // public static void main(String[] args )
    // {
    //     int data = cube(20);
    //     System.out.println(data);
    // }
    // public static int cube(int a)
    // {
    //     int res = a*a*a;
    //     return res;
    // }

    //Wap whether the number is even or odd....

    // public static void main(String[] args )
    // {
    //     String data = check(20);
    //     System.out.println(data);
    // }
    // public static String check(int a)
    // {
    //     if(a%2==0)

    //     return"given number is even";
    //     else
    //     return"given number if odd";
    
    // }

    public static void main(String[] args )
    {
        String data = check(0);
        System.out.println(data);
    }
    public static String check(int a)
    {
        if(a>0)
        return"positive";
    else if(a<0)
    return"negetive";
    else
    return"zero";
    
    }













}
