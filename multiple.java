class Student{
   private int rollno;
    private String name;
    public void getUser(int x,String  y){
        rollno=x;
        name=y;
    }
    public void printDetails(){
        System.out.println(+rollno+ " " +name);
    }
}


public class multiple{
    static void mult(int num){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",num,i,num*i);
        }
    }
    public static void main(String []args){
       // mult(5);
       Student s1=new Student();
      
       //System.out.println(+roll+ " " +nm);
       s1.getUser(12,"Rahul");
      s1.printDetails();

    }
}