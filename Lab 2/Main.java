import java.util.*;
import java.util.Scanner;
class Bankdetails{
    String name;
    String acc_type;
    String acc_no;
    int balance;
    Scanner in = new Scanner(System.in);
    void openaccount(){
        System.out.print("Enter name : ");
        name = in.next();
        System.out.print("Enter account no. : ");
        acc_no = in.next();
        System.out.print("Enter account type : ");
        acc_type = in.next();
        System.out.print("Enter balance : ");
        balance = in.nextInt();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Account type : "+acc_type);
        System.out.println("Account no. : "+acc_no);
        System.out.println("Balance : "+balance);
    }
    void deposit(){
        System.out.print("Enter amount to deposit : ");
        int amt = in.nextInt();
        balance += amt;
    }
    void withdraw(){
        System.out.print("Enter ammount to withdraw : ");
        int amt = in.nextInt();
        if(balance >= amt){
            balance -= amt;
            System.out.println("Balance after withdrawing "+amt+" = "+balance);
        }
        else{
            System.out.println("Transaction failed!!! Balance is less than amount requested");
        }
    }
    public boolean search(String an){
        if(acc_no.equals(an)){
            display();
            return true;
        }
        return false;
    }
}

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of customers : ");
        int n = in.nextInt();
        Bankdetails[] c = new Bankdetails[n];
        for(int i=0; i<c.length; i++){
            c[i] = new Bankdetails();
            c[i].openaccount();
        }
        int ch;
        do{
            System.out.println("Enter your choice : ");
            System.out.print("1. Display \n2. Search account by account no.\n3. Deposit\n4. Withdraw\n0. Exit\n");
            ch = in.nextInt();
            switch(ch){
                case 1 : for(int i=0;i<c.length;i++){
                            c[i].display();
                         }
                         break;
                case 2 : System.out.print("Enter account no. to search : ");
                         String an = in.next();
                         boolean found = false;
                         for(int i=0;i<c.length;i++){
                             found = c[i].search(an);
                             if(found){
                                 break;
                             }
                         }
                         if(!found)
                            System.out.println("Search failed");
                         break;
                case 3 : System.out.print("Enter account no. to deposit : ");
                         an = in.next();
                         found  = false;
                         for(int i=0;i<c.length;i++){
                             found = c[i].search(an);
                             if(found){
                                 c[i].deposit();
                                 break;
                             }
                         }
                         if(!found)
                            System.out.println("Search failed");
                         break;
                case 4 : System.out.print("Enter accoutn no. to withdraw :  ");
                         an = in.next();
                         found = false;
                         for(int i=0;i<c.length;i++){
                             found = c[i].search(an);
                             if(found){
                                 c[i].withdraw();
                             }
                         }
                         if(!found)
                            System.out.println("Search failed");
                         break;
                case 0 : System.out.println("--------Thankyou-----");
                         break;
                default : System.out.println("Invalid choice");
                          break;
            }
        }while(ch != 0);

        in.close();
    }
}
