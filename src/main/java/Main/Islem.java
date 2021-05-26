package Main;

import DAO.movie_file;
import entity.Movie;

public class Islem {

    private static int[] turler = new int[40];
    private static int[] oranlar = new int[20];
    private static int[] girildi_mi = new int[40];

    public Islem() {
    }

    public static void baslangic() {
        for (int i = 0; i < 40; i++) {
            turler[i] = 0;
            girildi_mi[i] = 0;

        }
        for (int i = 0; i < 20; i++) {
            oranlar[i] = 0;
        }
    }

    public static int[] getTurler() {
        return turler;
    }

    public static void setTurler(int[] turler) {
        Islem.turler = turler;
    }

    public static int[] getOranlar() {
        return oranlar;
    }

    public static void setOranlar(int[] oranlar) {
        Islem.oranlar = oranlar;
    }

    /*
    0,1 -> Aksiyon0,1;
    2,3 -> Dram0,1;
    4,5 -> Sanat0,1;
    6,7 -> Savas0,1;
    8,9 -> Suc0,1;
    10,11 -> Gerilim0,1;
    12,13 -> Bilim_Kurgu0,1;
    14,15 -> Fantastik0,1;
    16,17 -> Biyografi0,1;
    18,19 -> Komedi0,1;
    20,21 -> Romantik0,1;
    22,23 -> Gizem0,1;
    24,25 -> Cocuk_Aile0,1;
    26,27 -> Anime0,1;
    28,29 -> Korku0,1;
    30,31 -> Spor0,1;
    32,33 -> Muzikal0,1;
    34,35 -> Belgesel0,1;
    36,37 -> Macera0,1;
    38,39 -> Epik0,1;
    
    0 -> Aksiyon0,1;
    1 -> Dram0,1;
    2 -> Sanat0,1;
    3 -> Savas0,1;
    4 -> Suc0,1;
    5 -> Gerilim0,1;
    6 -> Bilim_Kurgu0,1;
    7 -> Fantastik0,1;
    8 -> Biyografi0,1;
    9 -> Komedi0,1;
    10 -> Romantik0,1;
    11 -> Gizem0,1;
    12 -> Cocuk_Aile0,1;
    13 -> Anime0,1;
    14 -> Korku0,1;
    15 -> Spor0,1;
    16 -> Muzikal0,1;
    17 -> Belgesel0,1;
    18 -> Macera0,1;
    19 -> Epik0,1;
    
     */
    public static String islemler(String tur, int deger) {

        switch (tur) {
            case "aksiyon1": {
                turler[1] = deger;
                int sum = turler[0] + turler[1];
                int oran = ((turler[1] * 100) / sum);
                oranlar[0] = oran;
                deger = oran;
                girildi_mi[1] = 1;
                String s = ortak(1, 0, deger, 0);
                if (s.equals("")) {
                    tur = "Aksiyon Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "aksiyon0": {
                turler[0] = deger;
                int sum = turler[0] + turler[1];
                int oran = ((turler[1] * 100) / sum);
                oranlar[0] = oran;
                deger = oran;
                girildi_mi[0] = 1;
                String s = ortak(1, 0, deger, 0);
                if (s.equals("")) {
                    tur = "Aksiyon Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "dram1": {
                turler[3] = deger;
                int sum = turler[2] + turler[3];
                int oran = ((turler[3] * 100) / sum);
                oranlar[1] = oran;
                deger = oran;
                girildi_mi[3] = 1;
                String s = ortak(3, 2, deger, 1);
                if (s.equals("")) {
                    tur = "Dram Begenme Orani(1): ";
                } else {
                    tur = s;
                }

                break;
            }
            case "dram0": {
                turler[2] = deger;
                int sum = turler[2] + turler[3];
                int oran = ((turler[3] * 100) / sum);
                oranlar[1] = oran;
                deger = oran;
                girildi_mi[2] = 1;
                String s = ortak(3, 2, deger, 1);
                if (s.equals("")) {
                    tur = "Dram Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "sanat1": {
                turler[5] = deger;
                int sum = turler[4] + turler[5];
                int oran = ((turler[5] * 100) / sum);
                oranlar[2] = oran;
                deger = oran;
                girildi_mi[5] = 1;
                String s = ortak(5, 4, deger, 2);
                if (s.equals("")) {
                    tur = "Sanat Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "sanat0": {
                turler[4] = deger;
                int sum = turler[4] + turler[5];
                int oran = ((turler[5] * 100) / sum);
                oranlar[2] = oran;
                deger = oran;
                girildi_mi[4] = 1;
                String s = ortak(5, 4, deger, 2);
                if (s.equals("")) {
                    tur = "Sanat Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "savas1": {
                turler[7] = deger;
                int sum = turler[6] + turler[7];
                int oran = ((turler[7] * 100) / sum);
                oranlar[3] = oran;
                deger = oran;
                girildi_mi[7] = 1;
                String s = ortak(7, 6, deger, 3);
                if (s.equals("")) {
                    tur = "Savas Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "savas0": {
                turler[6] = deger;
                int sum = turler[6] + turler[7];
                int oran = ((turler[7] * 100) / sum);
                oranlar[3] = oran;
                deger = oran;
                girildi_mi[6] = 1;
                String s = ortak(7, 6, deger, 3);
                if (s.equals("")) {
                    tur = "Savas Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "suc1": {
                turler[9] = deger;
                int sum = turler[8] + turler[9];
                int oran = ((turler[9] * 100) / sum);
                oranlar[4] = oran;
                deger = oran;
                girildi_mi[9] = 1;
                String s = ortak(9, 8, deger, 4);
                if (s.equals("")) {
                    tur = "Suc Begenme Orani(1): ";
                } else {
                    tur = s;
                }

                break;
            }
            case "suc0": {
                turler[8] = deger;
                int sum = turler[8] + turler[9];
                int oran = ((turler[9] * 100) / sum);
                oranlar[4] = oran;
                deger = oran;
                girildi_mi[8] = 1;
                String s = ortak(9, 8, deger, 4);
                if (s.equals("")) {
                    tur = "Suc Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "gerilim1": {
                turler[11] = deger;
                int sum = turler[10] + turler[11];
                int oran = ((turler[11] * 100) / sum);
                oranlar[5] = oran;
                deger = oran;
                girildi_mi[11] = 1;
                String s = ortak(11, 10, deger, 5);
                if (s.equals("")) {
                    tur = "Gerilim Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "gerilim0": {
                turler[10] = deger;
                int sum = turler[10] + turler[11];
                int oran = ((turler[11] * 100) / sum);
                oranlar[5] = oran;
                deger = oran;
                girildi_mi[10] = 1;
                String s = ortak(11, 10, deger, 5);
                if (s.equals("")) {
                    tur = "Gerilim Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "bilim_kurgu1": {
                turler[13] = deger;
                int sum = turler[12] + turler[13];
                int oran = ((turler[13] * 100) / sum);
                oranlar[6] = oran;
                deger = oran;
                girildi_mi[13] = 1;
                String s = ortak(13, 12, deger, 6);
                if (s.equals("")) {
                    tur = "Bilim Kurgu Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "bilim_kurgu0": {
                turler[12] = deger;
                int sum = turler[12] + turler[13];
                int oran = ((turler[13] * 100) / sum);
                oranlar[6] = oran;
                deger = oran;
                girildi_mi[12] = 1;
                String s = ortak(13, 12, deger, 6);
                if (s.equals("")) {
                    tur = "Bilim Kurgu Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "fantastik1": {
                turler[15] = deger;
                int sum = turler[14] + turler[15];
                int oran = ((turler[15] * 100) / sum);
                oranlar[7] = oran;
                deger = oran;
                girildi_mi[15] = 1;
                tur = "Fantastik Begenme Orani(1): ";
                String s = ortak(15, 14, deger, 7);
                if (s.equals("")) {
                    tur = "Fantastik Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "fantastik0": {
                turler[14] = deger;
                int sum = turler[14] + turler[15];
                int oran = ((turler[15] * 100) / sum);
                oranlar[7] = oran;
                deger = oran;
                girildi_mi[14] = 1;
                String s = ortak(15, 14, deger, 7);
                if (s.equals("")) {
                    tur = "Fantastik Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "biyografi1": {
                turler[17] = deger;
                int sum = turler[16] + turler[17];
                int oran = ((turler[17] * 100) / sum);
                oranlar[8] = oran;
                deger = oran;
                girildi_mi[17] = 1;
                String s = ortak(17, 16, deger, 8);
                if (s.equals("")) {
                    tur = "Biyografi Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "biyografi0": {
                turler[16] = deger;
                int sum = turler[16] + turler[17];
                int oran = ((turler[17] * 100) / sum);
                oranlar[8] = oran;
                girildi_mi[16] = 1;
                deger = oran;
                String s = ortak(17, 16, deger, 8);
                if (s.equals("")) {
                    tur = "Biyografi Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "komedi1": {
                turler[19] = deger;
                int sum = turler[18] + turler[19];
                int oran = ((turler[19] * 100) / sum);
                oranlar[9] = oran;
                deger = oran;
                girildi_mi[19] = 1;
                String s = ortak(19, 18, deger, 9);
                if (s.equals("")) {
                    tur = "Komedi Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "komedi0": {
                turler[18] = deger;
                int sum = turler[18] + turler[19];
                int oran = ((turler[19] * 100) / sum);
                oranlar[9] = oran;
                deger = oran;
                girildi_mi[18] = 1;
                String s = ortak(19, 18, deger, 9);
                if (s.equals("")) {
                    tur = "Komedi Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "romantik1": {
                turler[21] = deger;
                int sum = turler[20] + turler[21];
                int oran = ((turler[21] * 100) / sum);
                oranlar[10] = oran;
                deger = oran;
                girildi_mi[21] = 1;
                String s = ortak(21, 20, deger, 10);
                if (s.equals("")) {
                    tur = "Romantik Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "romantik0": {
                turler[20] = deger;
                int sum = turler[20] + turler[21];
                int oran = ((turler[21] * 100) / sum);
                oranlar[10] = oran;
                deger = oran;
                girildi_mi[20] = 1;
                String s = ortak(21, 20, deger, 10);
                if (s.equals("")) {
                    tur = "Romantik Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "gizem1": {
                turler[23] = deger;
                int sum = turler[22] + turler[23];
                int oran = ((turler[23] * 100) / sum);
                oranlar[11] = oran;
                deger = oran;
                girildi_mi[23] = 1;
                String s = ortak(23, 22, deger, 11);
                if (s.equals("")) {
                    tur = "Gizem Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "gizem0": {
                turler[22] = deger;
                int sum = turler[22] + turler[23];
                int oran = ((turler[23] * 100) / sum);
                oranlar[11] = oran;
                deger = oran;
                girildi_mi[22] = 1;
                String s = ortak(23, 22, deger, 11);
                if (s.equals("")) {
                    tur = "Gizem Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "cocuk_aile1": {
                turler[25] = deger;
                int sum = turler[24] + turler[25];
                int oran = ((turler[25] * 100) / sum);
                oranlar[12] = oran;
                deger = oran;
                girildi_mi[25] = 1;
                String s = ortak(25, 24, deger, 12);
                if (s.equals("")) {
                    tur = "Cocuk Aile Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "cocuk_aile0": {
                turler[24] = deger;
                int sum = turler[24] + turler[25];
                int oran = ((turler[25] * 100) / sum);
                oranlar[12] = oran;
                deger = oran;
                girildi_mi[24] = 1;
                String s = ortak(25, 24, deger, 12);
                if (s.equals("")) {
                    tur = "Cocuk Aile Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "anime1": {
                turler[27] = deger;
                int sum = turler[26] + turler[27];
                int oran = ((turler[27] * 100) / sum);
                oranlar[13] = oran;
                deger = oran;
                girildi_mi[27] = 1;
                String s = ortak(27, 26, deger, 13);
                if (s.equals("")) {
                    tur = "Anime Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "anime0": {
                turler[26] = deger;
                int sum = turler[26] + turler[27];
                int oran = ((turler[27] * 100) / sum);
                oranlar[13] = oran;
                deger = oran;
                girildi_mi[26] = 1;
                String s = ortak(27, 26, deger, 13);
                if (s.equals("")) {
                    tur = "Anime Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "kokru1": {
                turler[29] = deger;
                int sum = turler[28] + turler[29];
                int oran = ((turler[29] * 100) / sum);
                oranlar[14] = oran;
                deger = oran;
                girildi_mi[29] = 1;
                String s = ortak(29, 28, deger, 14);
                if (s.equals("")) {
                    tur = "Korku Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "korku0": {
                turler[28] = deger;
                int sum = turler[28] + turler[29];
                int oran = ((turler[29] * 100) / sum);
                oranlar[14] = oran;
                deger = oran;
                girildi_mi[28] = 1;
                String s = ortak(29, 28, deger, 14);
                if (s.equals("")) {
                    tur = "Korku Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "spor1": {
                turler[31] = deger;
                int sum = turler[30] + turler[31];
                int oran = ((turler[31] * 100) / sum);
                oranlar[15] = oran;
                deger = oran;
                girildi_mi[31] = 1;
                String s = ortak(31, 30, deger, 15);
                if (s.equals("")) {
                    tur = "Spor Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "spor0": {
                turler[30] = deger;
                int sum = turler[30] + turler[31];
                int oran = ((turler[31] * 100) / sum);
                oranlar[15] = oran;
                deger = oran;
                girildi_mi[30] = 1;
                String s = ortak(31, 30, deger, 15);
                if (s.equals("")) {
                    tur = "Spor Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "muzikal1": {
                turler[33] = deger;
                int sum = turler[32] + turler[33];
                int oran = ((turler[33] * 100) / sum);
                oranlar[16] = oran;
                deger = oran;
                girildi_mi[33] = 1;
                String s = ortak(33, 32, deger, 16);
                if (s.equals("")) {
                    tur = "Muzikal Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "muzikal0": {
                turler[32] = deger;
                int sum = turler[32] + turler[33];
                int oran = ((turler[33] * 100) / sum);
                oranlar[16] = oran;
                deger = oran;
                girildi_mi[32] = 1;
                String s = ortak(33, 32, deger, 16);
                if (s.equals("")) {
                    tur = "Muzikal Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "belgesel1": {
                turler[35] = deger;
                int sum = turler[34] + turler[35];
                int oran = ((turler[35] * 100) / sum);
                oranlar[17] = oran;
                deger = oran;
                girildi_mi[35] = 1;
                String s = ortak(35, 34, deger, 17);
                if (s.equals("")) {
                    tur = "Belgesel Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "belgesel0": {
                turler[34] = deger;
                int sum = turler[34] + turler[35];
                int oran = ((turler[35] * 100) / sum);
                oranlar[17] = oran;
                deger = oran;
                girildi_mi[34] = 1;
                String s = ortak(35, 34, deger, 17);
                if (s.equals("")) {
                    tur = "Belgesel Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "macera1": {
                turler[37] = deger;
                int sum = turler[36] + turler[37];
                int oran = ((turler[37] * 100) / sum);
                oranlar[18] = oran;
                deger = oran;
                girildi_mi[37] = 1;
                String s = ortak(37, 36, deger, 18);
                if (s.equals("")) {
                    tur = "Macera Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "macera0": {
                turler[36] = deger;
                int sum = turler[36] + turler[37];
                int oran = ((turler[37] * 100) / sum);
                oranlar[18] = oran;
                deger = oran;
                girildi_mi[36] = 1;
                String s = ortak(37, 36, deger, 18);
                if (s.equals("")) {
                    tur = "Macera Begenme Orani(0): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "epik1": {
                turler[39] = deger;
                int sum = turler[38] + turler[39];
                int oran = ((turler[39] * 100) / sum);
                oranlar[19] = oran;
                deger = oran;
                girildi_mi[39] = 1;
                String s = ortak(39, 38, deger, 19);
                if (s.equals("")) {
                    tur = "Epik Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            case "epik0": {
                turler[38] = deger;
                int sum = turler[38] + turler[39];
                int oran = ((turler[39] * 100) / sum);
                oranlar[19] = oran;
                deger = oran;
                girildi_mi[38] = 1;
                String s = ortak(39, 38, deger, 19);
                if (s.equals("")) {
                    tur = "Epik Begenme Orani(1): ";
                } else {
                    tur = s;
                }
                break;
            }
            default:
                return null;
        }

        String sonuc = tur + "///" + String.valueOf(deger);
        return sonuc;
    }

    public static String ortak(int buyuk, int kucuk, int deger, int type) {
        String s = "";
        if (girildi_mi[kucuk] == 1 && girildi_mi[buyuk] == 1 && deger > 70) {
            movie_file m_file = new movie_file();
            Movie m_list = m_file.movie_file_read();
            Movie m = m_list.movie_list_print(type);
            if (m != null) {
                s = m.movie_read(m, deger);
            }

        }
        return s;
    }

}
