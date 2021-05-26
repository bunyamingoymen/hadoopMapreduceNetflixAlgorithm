/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author bgoym
 */
public class Movie {

    movies_list first = null, last = null;

    public void add(int movie_id, String movie_name, String movie_type, int movie_time) {
        movies_list tmp = new movies_list(movie_id, movie_name, movie_type, movie_time);

        if (first == null) {
            first = tmp;
            last = tmp;
        } else {
            last.setNext(tmp);
            last = tmp;
        }
    }

    public void print() {
        if (first == null) {
            System.out.println("Veri Yok");
        } else {
            movies_list tmp = first;
            while (tmp != null) {
                System.out.println(tmp.getMovie_id() + " " + tmp.getMovie_name() + " " + tmp.getMovie_type() + " " + tmp.getMovie_time());
                tmp = tmp.getNext();
            }
        }
    }

    public void print(int rate) {
        if (first == null) {
            System.out.println("Veri Yok");
        } else {
            movies_list tmp = first;
            while (tmp != null) {
                System.out.println(tmp.getMovie_id() + " " + tmp.getMovie_name() + " " + tmp.getMovie_type() + " " + tmp.getMovie_time() + ",Eşleşme: " + rate);
                tmp = tmp.getNext();
            }
        }
    }

    public String type(int movie_id) {
        movies_list tmp = first;
        while (tmp != null) {
            if (tmp.getMovie_id() == movie_id) {
                return tmp.getMovie_type();
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public Movie movie_list_print(int type) {
        movies_list tmp = first;
        Movie m = new Movie();
        while (tmp.getNext() != null) {
            if (type == 0) {
                if (tmp.getMovie_type().equals("Aksiyon")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 1) {
                if (tmp.getMovie_type().equals("Dram")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 2) {
                if (tmp.getMovie_type().equals("Sanat")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 3) {
                if (tmp.getMovie_type().equals("Savaş")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 4) {
                if (tmp.getMovie_type().equals("Suç")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 5) {
                if (tmp.getMovie_type().equals("Gerilim")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 6) {
                if (tmp.getMovie_type().equals("Bilim_Kurgu")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 7) {
                if (tmp.getMovie_type().equals("Fantastik")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 8) {
                if (tmp.getMovie_type().equals("Biyografi")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 9) {
                if (tmp.getMovie_type().equals("Komedi")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 10) {
                if (tmp.getMovie_type().equals("Romantik")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 11) {
                if (tmp.getMovie_type().equals("Gizem")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 12) {
                if (tmp.getMovie_type().equals("Çocuk_Aile")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 13) {
                if (tmp.getMovie_type().equals("Anime")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 14) {
                if (tmp.getMovie_type().equals("Korku")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 15) {
                if (tmp.getMovie_type().equals("Spor")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 16) {
                if (tmp.getMovie_type().equals("Müzikal")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 17) {
                if (tmp.getMovie_type().equals("Belgesel")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 18) {
                if (tmp.getMovie_type().equals("Macera")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else if (type == 19) {
                if (tmp.getMovie_type().equals("Epik")) {
                    m.add(tmp.getMovie_id(), tmp.getMovie_name(), tmp.getMovie_type(), tmp.getMovie_time());
                }
            } else {
                System.out.println("Error - movie_list_print - 1");
            }
            tmp = tmp.getNext();
        }
        return m;
    }
    
    public String movie_read(Movie m, int oran){
        String s = "";
        movies_list tmp = first;
        while(tmp!= null){
            s = s + tmp.getMovie_id() + " " +tmp.getMovie_name() + " " +tmp.getMovie_type() + " " + tmp.getMovie_time() + " Eşleşme Orani: " + oran + "\n";
            tmp = tmp.getNext();
        }
        return s;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

}

class movies_list {

    private final int movie_id;
    private final String movie_name;
    private final String movie_type;
    private final int movie_time;
    private movies_list next;

    public movies_list(int movie_id, String movie_name, String movie_type, int movie_time) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_type = movie_type;
        this.movie_time = movie_time;
        this.next = null;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public int getMovie_time() {
        return movie_time;
    }

    public movies_list getNext() {
        return next;
    }

    public void setNext(movies_list next) {
        this.next = next;
    }

}
