package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void main(String[] args) {
        new Pyramid().printPyramid(10);
    }

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }
            int currentInt = i;
            for (int j = 1; j < i + 1; j++) {
                System.out.print(--currentInt + 1);
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(++currentInt + 1);
            }
            System.out.println();
        }
    }
}
