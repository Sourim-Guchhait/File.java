class LogicalOperator{

    static public void main(String[] args)
    {

        // int a = 2;
        // int b = 3;
        // int c = 2;

        // // Logical OR Operands.........
        // System.out.println(a>b || b<c); //false
        // System.out.println(a>b || a==c); //true
        // System.out.println(a==c || a!=c); //true
        // System.out.println(a==b || a!=b); //true

        // //Logical AND Operands........
        // System.out.println(a>b || b<c); //false
        // System.out.println(a>b || b<c); //false
        // System.out.println(a>b || b<c); //false
        // System.out.println(a>b || b<c); //false

        // //Logical NOT operands
        // System.out.println(a>b || b<c); //true
        // System.out.println(a>b || b<c); //false

        //example
        int a=2; //a-->2
        int b=3; //b-->3

        System.out.println(a++==2 || --b==2); //as the first value is true compiler never check the second operands
        System.out.println(a); //3
        System.out.println(b); //3

        System.out.println(a++==2 && --b==2);
        System.out.println(a);
        System.out.println(b);

        



    

    }


}