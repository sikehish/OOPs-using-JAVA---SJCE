import java.util.Scanner;

public class Fib{
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        n=in.nextInt();
        int first=0,second=1,next=first+second;
        if(n<=0){
            System.out.println("Invalid i/p");
            return;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(first + " ");
            first=second;
            second=next;
            next=first+second;
        }
        in.close();
    }

}