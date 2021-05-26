/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import DAO.*;
import Main.Islem;
import entity.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bgoym
 */
public class pro {

    public static void processes() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sl = null;

        movie_file mf = new movie_file();
        Movie m = mf.movie_file_read();

        while (true) {

            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("1- Beğenebileceğim Filmleri goster");
            System.out.println("2- Beğenemeyueceğim filmleri göster");
            System.out.println("Exit");
            System.out.println("-----------------------------");
            System.out.println("");

            sl = br.readLine().toLowerCase();

            if (sl.equals("exit")) {
                break;
            } else {

                int[] a = Islem.getOranlar();
                Movie m_list = null;

                if (sl.equals("1")) {

                    for (int i = 0; i < 20; i++) {
                        if (a[i] > 70) {
                            m_list = m.movie_list_print(i);
                            if (!m_list.isEmpty()) {
                                m_list.print(a[i]);
                            } else {
                                System.out.println("Eşleşen Veri Bulunamadı");
                            }
                        }
                    }

                } else if (sl.equals("2")) {

                    for (int i = 0; i < 20; i++) {
                        if (a[i] < 30) {
                            m_list = m.movie_list_print(i);
                            if (!m_list.isEmpty()) {
                                m_list.print(a[i]);
                            } else {
                                System.out.println("Eşleşen Veri Bulunamadı");
                            }
                        }

                    }

                } else {
                    System.out.println("Hatalı Girdi");
                }
            }
        }
    }
}
