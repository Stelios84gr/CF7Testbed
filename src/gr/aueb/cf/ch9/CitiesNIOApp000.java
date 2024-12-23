package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class CitiesNIOApp000 {

    public static void main(String[] args) {
        String line;
        String[] cities;

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))) {
            Path dir = Paths.get("C:/tmp/cities");
            if (Files.notExists(dir)) Files.createDirectory(dir);
            Path path;

            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");

                switch (cities[0]) {
                    case "Greece":
//                        path = Paths.get("C:/tmp/gr.txt");
                        path = dir.resolve("gr.txt");
                        PrintStream gr = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
//                        path = Paths.get("C:/tmp/usa.txt");
                        path = dir.resolve("usa.txt");
                        PrintStream usa = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
//                        path = Paths.get("C:/tmp/de.txt");
                        path = dir.resolve("de.txt");
                        PrintStream de = new PrintStream(path.toFile(), StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                        break;
                    default:
                        System.out.println("Error in Cities");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.println(tokens[i] + " ");
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }
}
