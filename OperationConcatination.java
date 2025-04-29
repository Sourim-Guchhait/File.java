class OperationConcatination{

    static public void main(String[] args)
    {
        //Concatination
        //Number+Number---->Number  ( here + oprerator acting like //addition operator only)
        System.out.println(10+40);  //50
        
        //Number+Boolean--->Not POSSIBLE
        System.out.println(10+a); //CTE

        //Number+String--->String(concatenation) (here + operator ) //acting like concatenation operator 
        System.out.println("sheela"+10); //sheela10
        System.out.println(10+20+"sheela"); //30sheela
        System.out.println(20-10+50+"sheela"); //60sheela
        System.out.println("sheela"+10+"laila"); //sheela10laila
        System.out.println("sheela+10+20"); //sheela1020
        System.out.println(10+30+"sheela"+(20+30)); //40sheela50
        System.out.println("sheela"+10+30+"laila"+20-10); //CTE
        System.out.println("sheela"+10+30+"laila"+(20-10)); //sheela1030laila10

        //Number+Boolean--->Concatenator
        System.out.println("sheela"+true); //sheelatrue


    }
}