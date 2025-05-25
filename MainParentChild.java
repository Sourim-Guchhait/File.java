class Parent{
    int num = 150;
     void m1()
    {
         System.out.println("method is parent class");
    }
   
}

class Child extends Parent{
    int value = 200;
    void m2()
    {
        System.out.println("method in child class");
    }
}

class MainParentChild{
    public static void main(String[] args) {
        Child c  = new Child();
        System.out.println(c.value);  //we can access as it is 
        c.m2();
        System.out.println(c.num);
        c.m1();

        System.out.println("-----------");

        Parent p = new Parent();
        System.out.println(p.num);
        p.m1();
    //  p.m2();  //non-acceble compile time error
    }
}