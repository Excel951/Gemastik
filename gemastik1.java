import java.io.*;
import java.util.*;

public class gemastik1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arrlist0 = new ArrayList<Integer>();
        ArrayList arrlist1 = new ArrayList<Integer>();
        ArrayList arrlist2 = new ArrayList<Integer>();
        ArrayList arrlist3 = new ArrayList<Integer>();
        ArrayList arrlist4 = new ArrayList<Integer>();
        ArrayList arrlist5 = new ArrayList<Integer>();
        ArrayList arrlist6 = new ArrayList<Integer>();
        ArrayList arrlist7 = new ArrayList<Integer>();
        ArrayList arrlist8 = new ArrayList<Integer>();
        ArrayList arrlist9 = new ArrayList<Integer>();

        int n = 0, masukan = 0;
        String string_n;
        int int_n = 0;
        n = Integer.parseInt(rd.readLine());
        if (n >= 2 || n <= 1000) {
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    System.out.println("Masukan pertama berupa satu buah bilangan N");
                masukan = Integer.parseInt(rd.readLine());
                if (masukan > 0 || masukan <= 100) {
                    string_n = Integer.toString(masukan);
                    // string_n=masukan
                    string_n = String.valueOf(string_n.charAt(string_n.length() - 1));
                    // System.out.println(string_n);
                    int_n = Integer.parseInt(string_n);
                    switch (int_n) {
                        case 0:
                            arrlist0.add(masukan);
                            break;
                        case 1:
                            arrlist1.add(masukan);
                            break;
                        case 2:
                            arrlist2.add(masukan);
                            break;
                        case 3:
                            arrlist3.add(masukan);
                            break;
                        case 4:
                            arrlist4.add(masukan);
                            break;
                        case 5:
                            arrlist5.add(masukan);
                            break;
                        case 6:
                            arrlist6.add(masukan);
                            break;
                        case 7:
                            arrlist7.add(masukan);
                            break;
                        case 8:
                            arrlist8.add(masukan);
                            break;
                        case 9:
                            arrlist9.add(masukan);
                            break;
                    }
                    Collections.sort(arrlist0, Collections.reverseOrder());
                    Collections.sort(arrlist1, Collections.reverseOrder());
                    Collections.sort(arrlist2, Collections.reverseOrder());
                    Collections.sort(arrlist3, Collections.reverseOrder());
                    Collections.sort(arrlist4, Collections.reverseOrder());
                    Collections.sort(arrlist5, Collections.reverseOrder());
                    Collections.sort(arrlist6, Collections.reverseOrder());
                    Collections.sort(arrlist7, Collections.reverseOrder());
                    Collections.sort(arrlist8, Collections.reverseOrder());
                    Collections.sort(arrlist9, Collections.reverseOrder());
                    // Collections.sort(arrlist0);
                    // Collections.sort(arrlist1);
                    // Collections.sort(arrlist2);
                    // Collections.sort(arrlist3);
                    // Collections.sort(arrlist4);
                    // Collections.sort(arrlist5);
                    // Collections.sort(arrlist6);
                    // Collections.sort(arrlist7);
                    // Collections.sort(arrlist8);
                    // Collections.sort(arrlist9);
                }
            }

            for (int i = 0; i < arrlist0.size(); i++) {
                System.out.println(arrlist0.get(i));
            }
            for (int i = 0; i < arrlist1.size(); i++) {
                System.out.println(arrlist1.get(i));
            }
            for (int i = 0; i < arrlist2.size(); i++) {
                System.out.println(arrlist2.get(i));
            }
            for (int i = 0; i < arrlist3.size(); i++) {
                System.out.println(arrlist3.get(i));
            }
            for (int i = 0; i < arrlist4.size(); i++) {
                System.out.println(arrlist4.get(i));
            }
            for (int i = 0; i < arrlist5.size(); i++) {
                System.out.println(arrlist5.get(i));
            }
            for (int i = 0; i < arrlist6.size(); i++) {
                System.out.println(arrlist6.get(i));
            }
            for (int i = 0; i < arrlist7.size(); i++) {
                System.out.println(arrlist7.get(i));
            }
            for (int i = 0; i < arrlist8.size(); i++) {
                System.out.println(arrlist8.get(i));
            }
            for (int i = 0; i < arrlist9.size(); i++) {
                System.out.println(arrlist9.get(i));
            }
        }
    }
}