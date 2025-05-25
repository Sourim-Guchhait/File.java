//Encapsulation Example.........
// come to atm machine...


class Atm{

    private int pin;
    private double balance;

    public int getPin(){  //getter pin
        return pin;
    }
    public void setPin(int pin){
        this.pin=pin;  //setter pin
    }
    public double getBalance(){  //getter pin
        return balance;
    }
    public void setBalance(double sourim){
        balance=sourim;  //setter pin
    }
}

class Atmdriver{
    public static void main(String[] args) {
        Atm a = new Atm();
        a.setPin(1234);
        a.setBalance(28374848d);

        System.out.println("My ATM pin is :" +a.getPin());
        System.out.println("My ATM balance is :" +a.getBalance());
    }
}


