import java.util.Scanner;

public class a1 {
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);

      int [][]marks=new int[5][6];
      for(int i=0;i<marks.length;i++){
        for(int j=0;j<marks[0].length;j++){
            System.out.print("Enter the " +(i+1)+ "th row " +(j+1)+ "th column element: ");  
            marks[i][j] =sc.nextInt();
        }
      }
      for(int i=0;i<marks.length;i++){
        for(int j=0;j<marks[0].length;j++) {
            System.out.print(marks[i][j] + " ");
        }
        System.out.println();
      }
    }
}
