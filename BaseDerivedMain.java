class Base{
    int x;
    int y;

     Base(){
        System.out.println("no argument constructor");
     }

     Base (int x ,int y){
        this.x=x;
        this.y=y;

     }
}
class Derived extends Base{
    int z;
    Derived(int x ,int y,int z ){
        // super(); //compiler create a default constructor in Base class(invisible)
        // super(x,y);  //if x and y is private in parent class
        super.x=x;
        super.y=y;
    this.z=z;
    }
}
class BaseDerivedMain{
    public static void main(String[] args) {

        System.out.println("Programs starts");
        Derived d = new Derived(10,20,30);
        System.out.println("x:" +d.x);
        System.out.println("y:" +d.y);
        System.out.println("z:" +d.z);

        System.out.println("---------");
        System.out.println("Programs ends");

        // Base b = new Base(40,100);
        // System.out.println("x: " +b.x);
        // System.out.println("y: " +b.y);
        // System.out.println("z: " +b.z);   /// its cannot get the acces of the z
        
    
    }
}