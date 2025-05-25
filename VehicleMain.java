//super call statement examplee......
class Vehicle{

    int wheel;
    String registration;
    int model;


    Vehicle (int wheel,String registration,int model){
        this.wheel=wheel;
        this.registration=registration;
        this.model=model;
    }

}

class Car extends Vehicle{

    String brand;
    String colour;
    double price;

    Car(int wheel,String registration,int model,String brand,String colour,double price){
        super(wheel,registration,model);
        this.brand=brand;
        this.colour=colour;
        this.price= price;


    }
    public void display(){
        System.out.println("brand :" +brand);
        System.out.println("colour : " +colour);
        System.out.println("price : " +price);
        System.out.println("no of wheel :" +wheel);
        System.out.println("registration no : " + registration);
        System.out.println("model no : " + model);
    }

}
class VehicleMain{
    public static void main(String[] args) {
        Car c1= new Car(4,"wbYRH56H7",2050,"BMW","yellow",20);
        Car c2= new Car(6,"JK3377373",3000,"SUPRA","black",30);

        c1.display();
        c2.display();
        
        
    }
}