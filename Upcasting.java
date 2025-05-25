class Base{
    public void m1(){
        System.out.println("derived class method");
    }

}

class Derived extends Base{

    public void m2(){
        System.out.println("derived class method");
    }

}

class Upcasting{

    public static void main(String[] args) {
        // Derived d = new Derived();
        // base b=d;  //upcasting

        Base b = new Derived();  //upcasting
        b.m1();
        // b.m2();

        // Derived d = (Derived)c; //down-casting

    }
}

//when downcasting not possible

// class Upcasting{

//     public static void main(String[] args) {
//         Base b = new Base();
//         derived d = (Derived)b;  //downcasting

//     }
// }