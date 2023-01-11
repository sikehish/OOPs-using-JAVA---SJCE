import java.util.Scanner;

public class Star{

    static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i-1; j>0; j--) System.out.print(" ");
            for(int j=i+1; j>0; j--) System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n=in.nextInt();
        if(n<1) {
            System.out.println("Invalid i/p");
            return;
        }
    else print(n);
    in.close();
    }


}