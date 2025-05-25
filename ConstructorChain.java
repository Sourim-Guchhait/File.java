class Demo{

    Demo(){
        // this(a,b,c);
        System.out.println("no argument cons");
    }

    Demo(int a ){
        this();
        System.out.println("int argument cons");

    }
    Demo(int a , int b){
        this(a);
        System.out.println("int , int Constructor");
    }
    Demo(int a ,int b , int c)
    {
        this(a,b);
        System.out.println("int , int , int constructor");
    }

}

class ConstructorChain{

    //using new keyword
    //using this();
    public static void main(String[] args) {
        System.out.println("Program starts");

        Demo d = new Demo(10,20,30);
        System.out.println("program ends");
    }
}