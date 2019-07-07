import java.util.Scanner;
public class Task11_101 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please input the size of array: ");
        int sizeArray=in.nextInt();
        int[] arrayT=new int[sizeArray];
        for(int i=0;i<sizeArray;i++){
            arrayT[i]=(int)(Math.random()*10);
        }
        System.out.println("\tArray:");
        for(int i=0;i<sizeArray;i++){
            System.out.print(arrayT[i]+" ");
        }
        System.out.println();
        
        int count=0;
        for(int i=0;i<sizeArray-1;i++){
            for(int j=i+1;j<sizeArray;j++){
                if(arrayT[i]==arrayT[j]) count++;
            }
        }        
        if(count==1) System.out.println("Array has only 2 repeating numbers");
        else if(count==0) System.out.println("Array hasn't any repeating numbers");
             else System.out.println("Array has more than 2 repeating numbers");
        in.close();
    }
        
        
}