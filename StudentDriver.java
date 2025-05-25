class Student {
    private String name;
    private int rollnumber;
    private int age;
    private long phone;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRollNumber(){
        return rollnumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollnumber=rollnumber;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public long getPhone(){
        return phone;}
        public void setPhone(long phone){
        this.phone=phone;
    }
    }

class StudentDriver{
    public static void main(String[] args) {
        Student a = new Student();
        a.setName("sourim");
        a.setRollNumber(53);        
        a.setAge(22);        
        a.setPhone(9883480740l);  


        System.out.println("My nameis :" +a.getName());
        System.out.println("My rollnumber is :" +a.getRollNumber());
        System.out.println("My age is :" +a.getAge());
        System.out.println("My phonenumber  is :" +a.getPhone());
    }
}