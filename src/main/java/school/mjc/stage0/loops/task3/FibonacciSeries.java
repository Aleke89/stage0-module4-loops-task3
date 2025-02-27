package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= lastFibonacci; ++i) {
            System.out.println(firstTerm);

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
