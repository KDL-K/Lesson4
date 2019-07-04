public class Task11_34b {
    public static void main(String[] args){
        int[] rainfall=new int[30];
        for(int i=0;i<30;i++){
            rainfall[i]=(int)(Math.random()*100);
        }
        int rain1=0;
        int rain2=0;
        int rain3=0;
        for(int i=0;i<30;i++){
            if(i<=10) rain1+=rainfall[i];
            else if(i<=20) rain2+=rainfall[i];
            else rain3+=rainfall[i];
        }
        if(rain1>rain2 && rain1>rain3){
            System.out.println("More rainfall in the 1-st decade of June: "+rain1);
        }
        if(rain2>rain1 && rain2>rain3){
            System.out.println("More rainfall in the 2-nd decade of June: "+rain2);
        }
        if(rain3>rain1 && rain3>rain2){
            System.out.println("More rainfall in the 3-d decade of June: "+rain3);
        }
    }
}