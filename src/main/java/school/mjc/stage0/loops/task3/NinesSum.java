package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int pow =1;
        int total = 0;
        int count  =0;
        for(int i = 0;i<lengthOfLastNumber;i++){
            pow *=10;
            total = pow-1;
            count = count+total;
        }
        System.out.println(count);
    }
}
