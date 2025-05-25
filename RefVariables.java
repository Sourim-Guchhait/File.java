// class Car {
//     String color = "Red";
// }

// public class RefVariables {
//     public static void main(String[] args) {
//         Car c1 = new Car();    // c1 is a reference variable //used to store object address
//         Car c2 = c1;           // c2 is another reference to the same object

//         System.out.println("Color from c1: " + c1.color); // Red
//         System.out.println("Color from c2: " + c2.color); // Red
//     }}

    //we can store null in the ref variables in the obj 

    class Car {
    String color = "Red";
}

public class RefVariables {
    public static void main(String[] args) {
        Car myCar = null;  // it stores the null
        System.out.println(myCar); //null
    }
}
