import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        City[] cities= new City[5];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter details of city " + (i+1));
            cities[i]= new City();
            cities[i].read();
            cities[i].cal();
            System.out.println();
        }
        int ch=-1, num=0;
        while(ch!=2)
        {
            System.out.println("Enter 1 to display and 2 to Exit");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the city number");
                num=in.nextInt();
                if(num<1 || num>5) {
                    System.out.println("Invalid number. Enter valid number.");
                }
                else cities[num-1].display();
                break;

                case 2:
                System.out.println("Exiting...");
                break;

                default:
                System.out.println("Enter valid option");

            }
        }
        
        in.close();
    }
}

 class City{

    int days[]= new int[6];
    String name;
    int high,low,ld,hd;

    void read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of city ");
        name= in.next();
        for(int i=0; i<6; i++){
            System.out.println("Enter the temperature on day " + (i+1));
            days[i]=in.nextInt();
        }
    }

    void cal()
    {
        high=days[0];
        low=days[0];
        hd=1;ld=1;
        for(int i=1; i<6; i++)
        {
            if(days[i]>high){
                high=days[i];
                hd=i+1;
            }
            if(days[i]<low){
                low=days[i];
                ld=i+1;
            }
        }

    }

    void display()
    {
        System.out.println("City name: " + name );
        System.out.println("Highest temperature is " + high + " on Jan " + hd);
        System.out.println("Lowest temperature is " + low + " on Jan " + ld);
    }

}