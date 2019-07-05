
public class Task11_140 {
    public static void main(String[] args){
        float coldTemp1=0;
        float coldTemp2=0;
        int coldDay1=0;
        int coldDay2=0;
        final int DAYS_IN_FEBRUARY=28;
        float[] arrayF=new float[DAYS_IN_FEBRUARY];

        for(int i=0;i<DAYS_IN_FEBRUARY;i++){
            arrayF[i]=((float)((int)(Math.random()*25*10)))/10*-1;
        }

        System.out.println("\tTHE TEMPERATURE IN FEBRUARY:");

        for(int i=0;i<DAYS_IN_FEBRUARY;i++){
            if(i==0) System.out.println("D   T");
            System.out.println((i+1)+"  "+arrayF[i]);
        }


        for(int i=0;i<DAYS_IN_FEBRUARY;i++){
            if(arrayF[i]<=coldTemp1){
                coldTemp2=coldTemp1;
                coldDay2=coldDay1;
                coldTemp1=arrayF[i];
                coldDay1=i+1;
            }
            if(arrayF[i]<coldTemp2 && arrayF[i]>coldTemp1){
                coldTemp2=arrayF[i];
                coldDay2=i+1;
            }

        }

        System.out.printf("The lowest temperatures are on %d February %.1fC and %d February %.1fC",coldDay1, coldTemp1,coldDay2,coldTemp2); 
    }
}
