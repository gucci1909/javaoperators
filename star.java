public class star {
    public static void main(String[] args) {

        // * * * *
        // * * *
        // * *
        // *

        int star = 4;
        for (int i = star; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // Table of 5

        int n = 5;
        for (int i = 1; i < n; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);

        }

    }
}
