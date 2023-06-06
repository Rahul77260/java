public class function {

    static int fabnicooo(int num){
        
      if(num==0)return 0;
      if(num==1)return 1;

        return fabnicooo(num-1)+fabnicooo(num-2);
    }
    public static void main(String []args){
        int result=fabnicooo(10);
        System.out.println(result);
    }
}
