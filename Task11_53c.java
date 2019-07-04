import java.util.Scanner;
public class Task11_53c {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please input the size of array: ");
        int sizeArray=in.nextInt();
        int[] arrayT=new int[sizeArray];
        for(int i=0;i<sizeArray;i++){
            arrayT[i]=(int)(Math.random()*100);
        }
        System.out.println("\tArray:");
        for(int i=0;i<sizeArray;i++){
            System.out.print(arrayT[i]+" ");
        }
        System.out.println();
        System.out.print("Input some number m: ");
        int m=in.nextInt();
        System.out.print("Input some number n: ");
        int n=in.nextInt();
        for(int i=0;i<sizeArray;i++){
            if(arrayT[i]%2!=0) arrayT[i]-=m;
            if(i%2!=0) arrayT[i]+=n;
        }
        System.out.println("\tArray after replacement:");
        for(int i=0;i<sizeArray;i++){
            System.out.print(arrayT[i]+" ");
        }
        System.out.println();
        
}