package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = 0;
        if(first>second){
            for(int i=2;i<=first;i++){
                if(first%i==0 && second%i==0){
                    max = i;
                }
            }
        }else if(second>first){
            for(int i=2;i<=second;i++){
                if(first%i==0 && second%i==0){
                    max = i;
                }
            }
        }else{
            for(int i=2;i<=first;i++){
                if(first%i==0 && second%i==0){
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}
