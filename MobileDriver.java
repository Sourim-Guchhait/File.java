import java.util.Scanner;
class Sim {
    String simProvider;
    long number;
}

class Mobile {
    Sim slot;  

    public void addSim(Sim slot) {
        if (this.slot == null) {
            this.slot = slot;
            System.out.println("Sim inserted.");
        } else {
            System.out.println(" A Sim is already present. Please remove it first ");
        }
    }

    public void removeSim() {
        if (this.slot != null) {
             this.slot = slot;
            System.out.println("Sim removed");
        } else {
            System.out.println("No Sim to remove,add one");
        }
    }
}

public class MobileDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            Mobile m = new Mobile();
            System.out.println("---------------");
            System.out.println("1.add sim");
            System.out.println("2.remove sim");
            System.out.println("3.exit ");
            System.out.println("---------------");
            // System.out.println("add sim");
            int ch = sc.nextInt();

            //using if-else ......

            if(ch==1){
                m.addSim(new Sim());
            }
            else if(ch==2){
                m.removeSim();
            }
            else if(ch==3){
                break;
            }

            //using switch-case.....
            
            switch (ch) {
                case 1:
                    m.addSim(new Sim());
                    break;
                case 2:

                    m.removeSim();
                    break;
                // case 3:

                //     System.out.println("nothing");
                    
                default:
                    System.out.println("Invalid choice. ");
            }

        }
    }
        
}


