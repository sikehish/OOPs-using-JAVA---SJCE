import java.util.Scanner;

class Student{
    Scanner sc=new Scanner(System.in);
    int rollNo,total;
    static int N=0;
    int subs[]=new int[3];
    String name;


    Student(){
        System.out.println("Enter name and roll No:");
        name=sc.nextLine();
        rollNo=sc.nextInt();
        System.out.println("Enter three subjects score:");;
        for(int i=0; i<subs.length; i++) {
            subs[i]=sc.nextInt();
            total+=subs[i];
        }
        N++;
    }

    void total(){
        System.out.println("The total marks scored by " + this.name + "(RollNo: " + this.rollNo + ") is " + this.total + "\n");
    }

    static void highest(Student s[]){
        int h[]=new int[3];
        int rollNo[]=new int[3];
        if(N==0) {
            System.out.println("No students :(");
            return;
        }
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(s[i].subs[j]>h[j]){
                    h[j]=s[i].subs[j];
                    rollNo[j]=s[i].rollNo;
                }
            }
        }
        for(int i=0; i<3; i++)
        {
            System.out.println("The highest marks scored in sub " + (i+1) + " is " +  h[i] +" by Roll No: " + rollNo[i]);
        }
    }

   static void highestInAll(Student s[]){
    
       if(N==0) {
           System.out.println("No students :(");
           return;
        }
        // int total=0;
        Student sptr=s[0];
        for(int i=1; i<N; i++)
        {
            if(sptr.total< s[i].total) sptr=s[i];
        }
        System.out.println("The highest marks scored in all 3 sub is " +  sptr.name +" by Roll No: " + sptr.rollNo + " with a total score of " + sptr.total);
    }


}

public class lab7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        Student s[]= new Student[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("-------------------------------");
            s[i]=new Student();
            s[i].total();
            System.out.println("-------------------------------");
        }
        Student.highest(s);
        Student.highestInAll(s);
        sc.close();
    }
    
}
