import java.util.Scanner;
public class Task12_192b{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of 2D array (array[n][m]):");
        System.out.print("n: ");
        int n=in.nextInt();
        System.out.print("m: ");
        int m=in.nextInt();
        int[][] array=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println("The Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int buffer=array[0][m-1];
        array[0][m-1]=array[n-1][m-1];
        array[n-1][m-1]=buffer;
        System.out.println("\nThe Array after changes:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}