import java.util.Scanner;


class Main{

    public static void mergearrays(int A[], int B[], int n1, int n2, int C[])
    {
        //  n1=A.length;
        //  n2=B.length;
         System.out.println(n1 + " " + n2);
         int i=0,j=0,k=0;
         while(i<n1 && j<n2)
         {
            if(A[i]<B[j])  C[k++]=A[i++];
            else C[k++]=B[j++];
         }
         while(i<n1) C[k++]=A[i++];
         while(j<n2) C[k++]=B[j++];
    }

    public static void main(String[] args) {
        int n1,n2;
        int A[],B[];
        Scanner in = new Scanner(System.in);
A = new int[10];
System.out.println("Enter no. of elements of array - A : ");
n1=in.nextInt();
System.out.println("Enter "+n1+" elements into array - A : ");
for(int i=0;i<n1;i++){
A[i] = in.nextInt();
}
 B = new int[10];
System.out.println("Enter no. of elements of array - B : ");
n2 = in.nextInt();
System.out.println("Enter "+n2+" elements into array - B : ");
for(int i=0;i<n2;i++){
B[i] = in.nextInt();
}
int[] C;
C = new int[n1+n2];
mergearrays(A, B, n1, n2, C);

System.out.println("Array after merging");
for (int i=0; i < n1+n2; i++)
System.out.print(C[i] + " ");


    in.close();

    }



}