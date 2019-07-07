import java.util.Scanner;
public class Task11_53b {
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
        for(int i=0;i<sizeArray;i++){
            if(arrayT[i]%2==0) arrayT[i]/=2;
            else arrayT[i]*=2;
        }
        System.out.println("\tArray after replacement:");
        for(int i=0;i<sizeArray;i++){
            System.out.print(arrayT[i]+" ");
        }
        System.out.println();
        in.close();
    }
        
}