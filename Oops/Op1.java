package Oops;
class Student{
    String name;
    int roll_no;
}
class S1 extends Student{
    public void getUser(){
        System.out.println(this.name);
        System.out.println(this.roll_no);

    }
    public void setUser(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
}
public class Op1 {
    public static void main(String args[]){
        System.out.println("Hello World");
        S1 obj1 =new S1();
        obj1.setUser("Rahul", 25);
        obj1.getUser();
    }
}