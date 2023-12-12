package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int pow = numberToPrint;
        for (int i = 0; i < power - 1; i++) {
            pow *= numberToPrint;
        }
        System.out.println(pow);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
