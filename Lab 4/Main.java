import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int c[] = {0,0,0,0,0,0};
        int ch=-1;
        System.out.println("1. Cand-1\n 2.Cand-2\n 3.Cand-3\n 4. Cand-4\n5. Cand-5\n 0. Result");
        while(ch!=0)
        {
            System.out.println("Enter no. to vote candidate");
            ch=in.nextInt();
            if(ch>0 && ch<6) c[ch-1]++;
            else if(ch==0) break;
            else c[5]++;
        }

        System.out.println("---RESULT---");
        System.out.println("Cand-1 " + c[0]);
        System.out.println("Cand-2 " + c[1]);
        System.out.println("Cand-3 " + c[2]);
        System.out.println("Cand-4 " + c[3]);
        System.out.println("Cand-5 " + c[4]);
        System.out.println("Spoilt Votes " + c[5]);
        int win=0;
        for(int i=1; i<c.length; i++)
        {
            if(c[i]>c[win]) win=i;
        }
        if(win==5) System.out.println("No clear winner as spoilt votes win!");
        else System.out.println("Cand " + (win+1) + " has won wtih " + c[win] + " votes." );

    }
}