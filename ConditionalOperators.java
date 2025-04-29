class ConditionalOperators{

    static public void main(String[] args)
    {
        // take out a normal conditional Operators

        // condition 1

        // int a = 10;
        // int b = 20;
        // int res = (a > b) ? a:b; //condition is taken
        // System.out.println(res); 
        
        // //condition 2

        // int a = 10;
        // int b = 20;
        // String res = (a>b) ? "a is larger" : "b is larger" ; //String is place b/w the double quotes
        // System.out.println(res); 

        // wheather a number is even or odd
        // first process
        // int num =5;
        // String res = (num%2 == 0) ? "even" : "odd" ; //String
        // System.out.println(res);

        // second process
        // int num = 5;
        // int res = (num%2!0) ? even : odd;
        // System.out.println(res);

        // //Wheather a number is divided by 5 or not 
        // int num =20;
        // String sou = (num%5==0) ? "it is multiply" : "its  not multiply";
        // System.out.println(sou);
        
        // Wap to check the eligibility to a preson to vote
        int age;
        System.out.println("enter the age:" );
        String res =(age >=18) ? "eligible to vote ":"not eligible to vote";
        System.out.println(res);

        // Write a programmme to check the larger of the two number 
        // int a=4;
        // int b=4;
        // String res= (a>b) ? "a is the largest number " : "b is the largest number";
        // System.out.println(res);

        // Write a programme to check the largest number of 3 number 
        // firstmethod
        // int a =4;
        // int b =7 ;
        // int c =5;
        // int res = (a>b) ? a:b;
        // int finalresult = (res>c) ? res : c;
        // System.out.println(finalresult);

        // Secondmethod
        // int res =(a>b && a>c) ? (a) : (b>c && b>a) ? b : c ; 
        // System.out.println(res);
        
        // Thirdmethod
        // int a= 10;
		// int b= 8;
		// int c= 6;
        // int res = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		// System.out.println(res);

                                                                                        


    }
}
