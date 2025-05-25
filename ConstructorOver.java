// What will happen if you declare two constructor with the same name and argument..
// class ConstructorOver
//  {
//     ConstructorOver(){
//         System.out.println("i am no-arg constructor");

//     }
//     ConstructorOver(){
//         System.out.println("i am no-arg constructor");

//     }
//     public static void main(String[] args) {
//         new ConstructorOver();  //CTE
        
//     }
// }

//WAP to overload a constructor based on length of arguments....

// class ConstructorOver
//  {
//     ConstructorOver(){
//         System.out.println("i am no-arg constructor");

//     }
//     ConstructorOver(int a){
//         System.out.println("i am constructor(int)");

//     }
//     ConstructorOver(int a,int b){
//         System.out.println("i am constructor(int,int)");

//     }
//     public static void main(String[] args) {
//         new ConstructorOver();
//         new ConstructorOver(10);
//         new ConstructorOver(10,20);
        
//     }
// }

//WAP to overload a constructor based on what type of argument
// class ConstructorOver
//  {
    
//     ConstructorOver(int a){
//         System.out.println("i am constructor(int)");

//     }
//     ConstructorOver(String s){
//         System.out.println("i am constructor(String)");

//     }
//     public static void main(String[] args) {
//         new ConstructorOver(10);
//         new ConstructorOver("hi");
//         // new ConstructorOver();
        
//     }
// }

//WAP to overload a constructor based on  order of arguments...

// class ConstructorOver
//  {
    
//     ConstructorOver(int a ,String s){
//         System.out.println("i am constructor(int ,String)");

//     }
//     ConstructorOver(String s,int a){
//         System.out.println("i am constructor(String,int)");

//     }
//     public static void main(String[] args) {
//         // new ConstructorOver();
//         new ConstructorOver(10,"hi");
//         new ConstructorOver("hi",20);
        
//     }
// }

//real time example of constructor overloading

//based on length of arguments.....(employee)...
// class ConstructorOver {
//     int id;
//     String name;
//     double salary;
//     ConstructorOver(int id)
// {
//     this.id=id;
// }
// ConstructorOver(int id, String name){
//     this.id=id;
//     this.name=name;
// }
// ConstructorOver(int id,String name,double salary){
//     this.id =id;
//     this.name =name;
//     this.salary =salary;
// }
//     public static void main(String[] args) {
//         ConstructorOver e1 = new ConstructorOver(10,"Sourim",200000);
//         System.out.println(e1.id);
//         System.out.println(e1.name);
//         System.out.println(e1.salary);
//     }
// }

