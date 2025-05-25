


// independent class : 
class Candy{

   String name = "dairy milk" ;   //if we use  public then we access name and price in main block
   int price = 500 ; 


    public void show(){
        System.out.println(name + " , " + price);

    } 
}



// dependent class : dependent on candies 
class Box{

    Candy c ; // object of class Box 

    // helper function 
    // void addCandies(Candy c){
    //     this.c = c ; 
    // }
    
    Box(Candy c){
        this.c = c;
        c.show();
    }
    
    // void show(){
    //     c.show() ;
    // }

}

class _Practise {

    public static void main(String[] args) {


     new Box( new Candy());


        // b1.c.show();
        b1.show();


        // System.out.println(b1.c.price);
        // System.out.println(b1.c.name);

    }
}