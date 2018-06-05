import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class VSR {
    public static void main(String[] args) throws IOException {
        // http://pl.spoj.com/problems/VSR/

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String string = br.readLine();
//            System.out.println(string);
//            System.out.println(Integer.parseInt(string.substring(0, string.indexOf(" "))));
            int v1 = Integer.parseInt(string.substring(0, string.indexOf(" ")));
            int v2 = Integer.parseInt(string.substring(string.indexOf(" ") + 1, string.length()));
//            System.out.println(Integer.parseInt(string.substring(string.indexOf(" ") + 1, string.length())));
            System.out.println((2 * v1 * v2) / (v1 + v2));
            t--;
        }
    }
}
