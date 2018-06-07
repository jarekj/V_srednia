import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main {

    public static void main(String[] args) throws java.lang.Exception {
        // http://pl.spoj.com/problems/VSR/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        String t = in.readLine();
        int tInt = Integer.parseInt(t);

        for (int i = 0; i < tInt; i++) {
            String input = in.readLine();
            String[] inputTab = input.split("\\s");
            int v1 = Integer.parseInt(inputTab[0]);
            int v2 = Integer.parseInt(inputTab[1]);
            writer.println((2 * v1 * v2) / (v1 + v2));
        }
        writer.close();
    }
}
