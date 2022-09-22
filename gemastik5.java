import java.io.*;
import java.util.*;

public class gemastik5 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        // ada N buah bilangan = A1, A2, A3, ... , AN
        int t = 0; // banyaknya kasus uji
        int n = 0; // jumlah isi baris
        int a = 0; // input data baris
        int m = 0; // hasil akhir subbaris 3 bagian

        int v1; // variabel a
        int v2; // variabel b
        int v3; // variabel c

        ArrayList ar1 = new ArrayList<Integer>(); // array list untuk baris
        ArrayList ar11 = new ArrayList<Integer>(); // array list untuk simpan subbaris ke1
        ArrayList ar12 = new ArrayList<Integer>(); // array list untuk simpan subbaris ke2
        ArrayList ar13 = new ArrayList<Integer>(); // array list untuk simpan subbaris ke3
        ArrayList ar2 = new ArrayList<Integer>(); // array list untuk simpan hasil subbaris

        System.out.print("Banyak kasus uji: ");
        t = Integer.parseInt(rd.readLine());

        for (int i = 0; i < t; i++) {
            System.out.print("Jumlah isi baris ke-" + (i + 1) + ": ");
            n = Integer.parseInt(rd.readLine());
            for (int j = 0; j < n; j++) {
                System.out.print("Input data baris ke-" + (j + 1) + ": ");
                a = Integer.parseInt(rd.readLine());
                ar1.add(a);
            }
            for (int j = 0; j < ar1.size(); j++) {
                v1 = (int) ar1.get(j);
                for (int j2 = j + 1; j2 < ar1.size(); j2++) {
                    v2 = (int) ar1.get(j2);
                    for (int j3 = j2 + 1; j3 < ar1.size(); j3++) {
                        v3 = (int) ar1.get(j3);
                        ar11.add(v1);
                        ar12.add(v2);
                        ar13.add(v3);
                    }
                }
            }
            for (int j = 0; j < ar11.size(); j++) {
                System.out.println(ar11.get(j) + " " + ar12.get(j) + " " + ar13.get(j));
                if (((int) ar11.get(j) > (int) ar12.get(j) && (int) ar12.get(j) < (int) ar13.get(j))
                        || ((int) ar11.get(j) < (int) ar12.get(j) && (int) ar12.get(j) > (int) ar13.get(j))) {
                    m += 1;
                }
            }
            ar1.removeAll(ar1);
            ar11.removeAll(ar11);
            ar12.removeAll(ar12);
            ar13.removeAll(ar13);
            ar2.add(m);
            m = 0;
        }

        for (int i = 0; i < ar2.size(); i++) {
            System.out.println(ar2.get(i));
        }
    }
}
