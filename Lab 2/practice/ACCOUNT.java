package p1;

import java.util.Scanner;

public class ACCOUNT{
    String name,acc_no,acc_type;
    double balance;
    static int i=0;
    Scanner in = new Scanner(System.in);
 
    ACCOUNT(){
       System.out.println("Result of this keyword for " + (++i) + " ACCOUNT object: " + this);
    }
 
    void initAccount(){
       System.out.println("Enter name");
       // in.nextLine();
       name= in.nextLine();
       System.out.println("Enter Account number");
       acc_no= in.nextLine();
       System.out.println("Enter Account type");
       acc_type= in.next();
       System.out.println("Enter balance");
       balance= Double.parseDouble(in.next());
    }
 
 
    void deposit()
    {
       System.out.println("Your balance before depositing: " + balance);
       System.out.println("Enter amount");
       double amt= in.nextDouble();
       if(amt<=0)
       {
          System.out.println("Inavlid amount");
          return;
       }
       balance+=amt;
       System.out.println("Your balance after depositing: " + balance);
    }
 
    void withdraw()
    {
       System.out.println("Your balance before withdrawing: " + balance);
       System.out.println("Enter amount");
       double amt= in.nextDouble();
       if(amt>balance)
       {
          System.out.println("Insufficient balance");
          return;
       }
       balance-=amt;
       System.out.println("Your balance after withdrawing: " + balance);
    }
 
    void disp(){
       System.out.println("Name: " + name);
       System.out.println("Account Number: " + acc_no);
       System.out.println("Account Type: " + acc_type);
       System.out.println("Balance: " + balance);
       // in.close();
    }
 }
 