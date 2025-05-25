// Aggregation examples......

// class Bus {
//     Passenger p;
//     public void addPassengers(Passenger p){
//         this.p = p;
//     }
// }

    
//     public static void main(String[] args) {

//         String name "Sheela";
//         int age =20;


//         Bus b = new Bus();
//         b.addPassengers (new Passenger());

//         System.out.println(b.p.age);  //20
//         System.out.println(b.p.name); //Sheela

//     }

// WAP to impliment Aggregation : 

// non-dependent class 
class Passenger{
    public String name = "sheela";
    int age = 20;
    long phone =37838373893l;
    char gender = 'f';
}

// dependent class 
class Bus {
    public Passenger p;

    // helper method 
    public void addPassenger(Passenger p){
        this.p = p;  // assigning is happening here ..
    }
}


class BusDriver{
    public static void main(String[] args) {

        Bus b = new Bus(); // object of dependent class

        Passenger newp = new Passenger() ; //  object of non-dependent class

        b.addPassenger(newp) ; // passing the object as parameter 

        // b.addPassenger(new Passenger()); // calling the helper method & passing new object by calling constr. in place 


        System.out.println("name of passenger " +b.p.name);
        System.out.println("age of passenger " +b.p.age);
        System.out.println("phone of passenger " +b.p.phone);
        System.out.println("gender of passenger " +b.p.gender);
        
        System.out.println(newp.name);
        System.out.println(b.p.name);
    }
}


