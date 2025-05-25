// class Encapsulation{

//     private int max;  
//     public int getMax();  //getter
// {
//     return max;
// }
// public void setMax(int max)
// {
//     this.max=max;         //setter
// }
// class Encapsulation{
//     public static void main(String[] args) {7
        
    
//     Encapsulation e1= new Encapsulation();
//     System.out.println(e1.getMax());
//     e1.setMax(100);
//     System.out.println(e1.getMax());

//     System.out.println("----------");
//     System.out.println(e2.getMax());
//     }
// }
// }


//if i have two varibales then what happenss....
// class Encapsulation{

//     private int max;   //readable,writeable-->getter,setter
//     private int min;  
//     public int getMax()
// {
//     return max;
// }
// public int getMin(){
//     return min;
// }
// public void setMax(int max,int min){
//     this.max=max;
//     this.min=min;
// }

// class Encapsulation{
//     Encapsulation e1= new Encapsulation();
//     System.out.println(e1.getMax());
//     e1.setMax(100);
//     System.out.println(e1.getMax());

//     System.out.println("----------");
//     System.out.println(e2.getMax());
// }
// }

// come to atm machine...

class Atm{

    private int pin;
    private double balance;

    public int getPin(){  //getter pin
        return pin;
    }
    public void setpin(int pin){
        this.pin=pin;  //setter pin
    }
    public int getBalance(){  //getter pin
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;  //setter pin
    }
}

class Atmdriver{
    public static void main(String[] args) {
        Atm a = new Atm();
        a.setpin(1234);
        a.setBalance(28374848);

        System.out.println("My ATM pin is :" +a.getPin());
        System.out.println("My ATM balance is :" +a.getBalance());
    }
}


