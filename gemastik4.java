import java.util.*;
import java.io.*;

public class gemastik4 {
    public static void main(String[] args) throws IOException {
        // n = petarung
        // petarung i memiliki kekuatan Pi

        // petarung kekuatan lebih tinggi yang menang
        // kekuatan dari pemenang menjadi abs(Pi - Pj)

        // jika kekuatan sama, petarung index lebih kecil yang menang

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        ArrayList Pi = new ArrayList<Integer>();
        ArrayList Pn = new ArrayList<Integer>();

        int n; // jumlah musuh
        int pp; // petarung kita
        boolean menang = false;

        System.out.print("Masukkan jumlah musuh: ");
        n = Integer.parseInt(rd.readLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan petarung ke-" + (i + 1) + ": ");
            Pi.add(Integer.parseInt(rd.readLine()));
        }

        pp = (int) Pi.get(0);
        Pi.remove(0);
        Pn.add(pp);

        Collections.sort(Pi);

        // System.out.println(Pi);

        for (int index = 0; index < Pi.size(); index++) {
            if (pp >= (int) Pi.get(index)) {
                pp = Math.abs(pp - (int) Pi.get(index));
                Pn.add((int) Pi.get(index));
                // Pi.remove(index);
                menang = true;
            } else {
                menang = false;
                break;
            }
        }

        if (menang == true) {
            System.out.println("menang");
            for (int i = 0; i < Pn.size(); i++) {
                System.out.print(Pn.get(i) + " ");
            }
        } else {
            System.out.println("kalah");
        }
    }
}
