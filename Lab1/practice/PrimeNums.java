import java.util.Scanner;

public class PrimeNums {
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int n1,n2;
    System.out.print("Enter num1: ");
    n1=scan.nextInt();
    System.out.print("Enter num2 ");
    n2=scan.nextInt();
    if(n2<n1) {
      System.out.println("Invalid range");
      return;
    }
    boolean f=true;
    for(int i=n1; i<=n2; i++)
    {
      if(i==0 || i==1) continue;
      f=true;
      for(int j=2; j<=(i/2); j++)
      {
         if(i%j==0){
            f=false; break;
         }
      }
       if(f) System.out.print(i + " ");
    }
   }
}
