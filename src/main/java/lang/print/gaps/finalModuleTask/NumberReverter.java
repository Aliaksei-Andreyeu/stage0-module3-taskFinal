package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reverse = (number % 10);
        number /= 10;
        reverse = reverse * 10 +  (number % 10);
        number /= 10;
        reverse = reverse * 10 +  (number % 10);
        System.out.println(reverse);
    }
}
