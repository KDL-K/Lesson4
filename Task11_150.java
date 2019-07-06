import java.util.Scanner;
public class Task11_150 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N=20;
        int[] itemCost=new int[N];
        int[] itemCostDel=new int[N-1];
        for(int i=0;i<N;i++){
            itemCost[i]=(int)(Math.random()*35+1);
        }
        System.out.println("The prices of goods:");
        for(int i=0;i<N;i++){
            System.out.println("Item "+(i+1)+"   "+itemCost[i]+" rub");
        }
        System.out.print("What item has to be deleted? ");
        int delItem=in.nextInt();
        for(int i=0,j=0;i<N-1;i++,j++){
            if(i==(delItem-1)){
                j=i+1;
            }
            itemCostDel[i]=itemCost[j];
        }
        System.out.println("The prices of the goods after changes:");
        for(int i=0;i<N-1;i++){
            System.out.println("Item "+(i+1)+"   "+itemCostDel[i]+" rub");
        }

        in.close();
    }
}