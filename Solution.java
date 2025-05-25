class demo{

    int  value = 200;
    
        void m1(){
        System.out.println("its a value of democlass");
    }


}

class sample {

    int num = 300;{
     void m2(){
    System.out.println("its a value of sample class");
    }
}
}


class Solution{

    public static void main(String[] args) {
        demo d = new demo();  //creating object
        d.m1();
        System.out.println(d.value());







        sample s = new sample(); 
        d.m2();
        System.out.println(d.num());  //creating object
    }
}