
public class Task11_140 {
    public static void main(String[] args){
        int coldTemp=0;
        int coldTemp1=0;
        int coldTemp2=0;
        int coldDay=0;
        int coldDay1=0;
        int coldDay2=0;
        final int DAYS_IN_FEBRUARY=28;
        int[] arrayF=new int[DAYS_IN_FEBRUARY];

        for(int i=0;i<DAYS_IN_FEBRUARY;i++){
            arrayF[i]=(int)(Math.random()*25)*-1;
        }

        System.out.println("\tTHE TEMPERATURE IN FEBRUARY:");

        for(int i=0;i<DAYS_IN_FEBRUARY;i++){
            if(i==0) System.out.println("D   T");
            System.out.println((i+1)+"  "+arrayF[i]);
        }


        for(int i=0;i<DAYS_IN_FEBRUARY;i++){
            if(arrayF[i]<=coldTemp){
                coldTemp1=arrayF[i];
                coldDay1=i+1;
                coldTemp2=coldTemp;
                coldDay2=coldDay;
                coldTemp=arrayF[i];
                coldDay=i+1;
            }
        }

        System.out.printf("The lowest temperatures are on %d February %dC and %d February %dC",coldDay2, coldTemp2,coldDay1,coldTemp1); 
    }
}
