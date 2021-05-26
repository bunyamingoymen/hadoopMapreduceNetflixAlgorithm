/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Movie;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author bgoym
 */
public class movie_file {

    public Movie movie_file_read() {
        String str = "";
        String data = "";
        Movie m = new Movie();


        try {
            FileInputStream fStream = new FileInputStream("lib/txt/movie.txt");
            try (DataInputStream dStream = new DataInputStream(fStream)) {
                BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
                while ((str = bReader.readLine()) != null) {

                    data = str;
                    String[] a = data.split("1234####4321");
                    int movie_id = Integer.parseInt(a[0]);
                    String movie_name = a[1];
                    String movie_type = a[2];
                    int time = Integer.parseInt(a[3]);
                    m.add(movie_id, movie_name, movie_type, time);

                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error:(movie_file_read) " + e.getMessage());
        }
        
        return m;
    }
}
