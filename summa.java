import java.util.Scanner;

public class summa  {
    public static void main(String[] args) {
        int num;
        int sum=0;
        
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=30;i++){
            // System.out.println(i);
            System.out.println("enter the number");
             num=sc.nextInt();
             sum+=num;

            
            
        }
        System.out.println("the answer is"+sum);
       
       

        
    }
    
}
