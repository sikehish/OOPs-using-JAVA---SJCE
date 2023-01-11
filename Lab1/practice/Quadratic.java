// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Math;
import java.util.Scanner;


class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c,r1,r2;
        System.out.println("Enter the 3 non zero coefficients (a,b,c)");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        double d=(b*b)-(4*a*c);
        if(d==0){
            System.out.println("Roots are real and equal");
         r1=r2=-b/(2*a);
         System.out.println("Root 1: " + r1);
         System.out.println("Root 2: " + r2);
        }else if(d>0){
                       System.out.println("Roots are real and distinct");
         r1=(-b+Math.sqrt(d))/(2*a);
         r2=(-b-Math.sqrt(d))/(2*a);
         System.out.println("Root 1: " + r1);
         System.out.println("Root 2: " + r2);
        }else if(d<0){
            System.out.println("Roots are real and distinct");
         double real=-b/(2*a);
         double img=Math.sqrt(-d)/(2*a);
         System.out.println("Root 1: " + real + " + " + img + "i");
         System.out.println("Root 2: "+ real + " - " + img + "i");
        }
    }
}