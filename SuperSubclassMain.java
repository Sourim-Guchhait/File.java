class Super{
    int num = 5;
    public void m1()    
    {
        System.out.println("child class method");
    }
}
class Subclass extends Super{
    int num = 10;
    public void m1(){
        System.out.println("child class method");

        super.m1();
        System.out.println("bye");
    }
}
class SuperSubclassMain{

    public static void main(String[] args) {
        Subclass c = new Subclass();
        System.out.println("start");
        c.m1();  //pause
        System.out.println("ends");
    }
}
