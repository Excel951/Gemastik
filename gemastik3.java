import java.util.*;
import java.io.*;

public class gemastik3 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> ai = new ArrayList<Integer>(); // tingkat kemahiran musuh
        ArrayList<Integer> bi = new ArrayList<Integer>(); // pertambahan kemahiran budi

        int n; // var jumlah musuh
        int m; // var lvl budi

        System.out.print("Jumlah musuh: ");
        n = Integer.parseInt(rd.readLine());
        System.out.print("Tingkat kemahiran Budi: ");
        m = Integer.parseInt(rd.readLine());

        for (int i = 0; i < n; i++) {
            ai.add(Integer.parseInt(rd.readLine()));
        }
        for (int i = 0; i < n; i++) {
            bi.add(Integer.parseInt(rd.readLine()));
        }

        int a = 0;

        do {
            for (int i = 0; i < ai.size(); i++) {
                if (ai.get(i) <= m) {
                    m += bi.get(i);
                    ai.remove(i);
                    bi.remove(i);
                }
            }
            a++;
        } while (a < n);

        System.out.println("Tingkat kemahiran maksimal Budi: " + m);
    }
}
