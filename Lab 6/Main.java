import java.util.*;
import java.util.Scanner;
class CUBE{
Scanner in = new Scanner(System.in);
int vol, out_ar, side;
void read(){
System.out.print("Enter the length of side of cube: ");
side = in.nextInt();
}

void calc()
{
    vol = side*side*side;
    out_ar = 6*side*side;
}

void disp(){
calc();
System.out.println("Volume of cube = "+vol);
System.out.println("Outer area of cube = "+out_ar);
}
}
public class Main{
public static void main(String args[]){
    CUBE cube[] = new CUBE[3];
    for(int i=0; i<3; i++){
        System.out.println("Cube "+(i+1));
        cube[i] = new CUBE();
cube[i].read();
        }
    for(int i=0; i<3; i++){
        System.out.println("Cube "+(i+1));
        cube[i].disp();
        }

}
}
