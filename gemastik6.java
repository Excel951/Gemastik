import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class gemastik6 {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int n = 10, k = 2;
        int persegi1[][] = {
                { 89, 6, 91, 50, 7, 58, 83, 61, 3, 49 },
                { 78, 55, 90, 62, 4, 77, 27, 10, 85, 80 },
                { 25, 76, 23, 22, 45, 52, 88, 67, 11, 40 },
                { 16, 98, 17, 59, 66, 34, 18, 2, 97, 43 },
                { 71, 35, 100, 38, 1, 69, 86, 31, 33, 51 },
                { 64, 87, 84, 14, 48, 99, 60, 53, 92, 75 },
                { 46, 70, 94, 72, 29, 82, 36, 74, 21, 5 },
                { 73, 9, 26, 47, 20, 41, 65, 54, 24, 93 },
                { 95, 96, 37, 32, 56, 57, 63, 12, 30, 19 },
                { 28, 44, 79, 39, 42, 13, 81, 15, 8, 68 },
        };

        // Isi data persegi
        ArrayList persegiArrayList = new ArrayList();

        ArrayList temp = new ArrayList<>();
        ArrayList maxRow = new ArrayList<>();
        ArrayList minCol = new ArrayList<>();
        int min = 0, max = 0, input;

        try {
            System.out.println("Masukkan N dan K ( N=Jumlah NxN Persegi K=Jumlah persegi):");
            n = Integer.parseInt(rd.readLine());
            k = Integer.parseInt(rd.readLine());

            System.out.println("Masukkan angka");
            // for (int i = 0; i < (int) (Math.pow(n, n)) * k; i++) {
            // input = Integer.parseInt(rd.readLine());
            // persegiArrayList.add(input);
            // }
            for (int i = 0; i < persegi1.length; i++) {
                for (int j = 0; j < persegi1[i].length; j++) {
                    persegiArrayList.add(persegi1[i][j]);
                }
            }

            for (int i = 0; i < k * n; i++) {
                for (int j = 0; j < persegiArrayList.size(); j++) {
                    temp.add(persegiArrayList.get(j));
                    if (j % n == 0) {
                        maxRow.add((int) Collections.max(temp));
                        temp.removeAll(temp);
                        System.out.println(maxRow);
                    }
                }
            }
            min = (int) Collections.min(maxRow);
            System.out.println(min);

            // Benar
            // Algoritma Pertama
            // for (int i = 0; i < persegi1.length; i++) {
            // for (int j = 0; j < persegi1[i].length; j++) {
            // temp.add(persegi1[i][j]);
            // }
            // maxRow.add((int) Collections.max(temp));
            // temp.removeAll(temp);
            // }
            // min = (int) Collections.min(maxRow);
            // System.out.println(min);
            // maxRow.removeAll(maxRow);

            // Salah
            // Algoritma kedua
            // for (int i = 0; i < persegi1.length; i++) {
            // for (int j = 0; j < persegi1[i].length; j++) {
            // temp.add(persegi1[j][i]);
            // }
            // minCol.add((int) Collections.min(temp));
            // temp.removeAll(temp);
            // }
            // System.out.println(minCol);
            // max = (int) Collections.max(minCol);
            // System.out.println(max);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
