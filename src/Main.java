import java.util.Scanner;

class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        int tInt = Integer.parseInt(t);
        int v1, v2;

        for (int i = 0; i < tInt; i++) {
            v1 = scanner.nextInt();
            v2 = scanner.nextInt();
            System.out.println((2 * v1 * v2 / (v1 + v2)));
        }
    }
}
