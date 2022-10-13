import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class gemastik6_pakAgus {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer N = 20, K = 5;
        Integer c;
        Integer a[][] = new Integer[N][N];
        // Integer a[][] = {
        // {89,6,91,50,7,58,83,61,3,49},
        // {78,55,90,62,4,77,27,10,85,80},
        // {25,76,23,22,45,52,88,67,11,40},
        // {16,98,17,59,66,34,18,2,97,43},
        // {71,35,100,38,1,69,86,31,33,51},
        // {64,87,84,14,48,99,60,53,92,75},
        // {46,70,94,72,29,82,36,74,21,5},
        // {73,9,26,47,20,41,65,54,24,93},
        // {95,96,37,32,56,57,63,12,30,19},
        // {28,44,79,39,42,13,81,15,8,68}};
        // Integer b[][] = {
        // {84,4,68,96,79,48,18,3,43,83},
        // {82,77,42,22,95,69,92,58,55,81},
        // {66,62,93,41,30,38,28,70,37,17},
        // {29,34,51,91,87,1,60,8,26,100},
        // {19,11,35,21,64,94,65,14,72,74},
        // {86,78,40,54,47,31,27,88,90,20},
        // {61,57,99,89,52,10,97,24,45,44},
        // {13,12,23,15,33,2,80,85,25,16},
        // {5,56,49,75,73,7,59,36,67,50},
        // {39,71,76,46,63,32,9,53,6,98}};

        for (int kk = 0; kk < K; kk++) {
            System.out.println("DATA :" + String.valueOf(kk));
            for (int ii = 0; ii < N; ii++)
                for (int jj = 0; jj < N; jj++) {
                    a[ii][jj] = (int) (Math.random() * (100));
                }

            for (int ii = 0; ii < N; ii++) {
                for (int jj = 0; jj < N; jj++) {
                    System.out.print(a[ii][jj]);
                    System.out.print(",");
                }
                System.out.println();
            }

            List<Integer> bacamax = new ArrayList<Integer>();
            List<Integer> baca = new ArrayList<Integer>();
            System.out.println("max min");
            for (int i = 0; i < N; i++) {

                baca.clear();
                Collections.addAll(baca, a[i]);
                bacamax.add(Collections.max(baca));
            }

            System.out.println(Collections.min(bacamax));
            System.out.println("min max");
            bacamax.clear();

            for (int i = 0; i < N; i++) {
                baca.clear();
                for (int j = 0; j < N; j++) {
                    baca.add(a[j][i]);
                }
                bacamax.add(Collections.min(baca));
            }

            System.out.println(Collections.max(bacamax));

        }

    }

}
