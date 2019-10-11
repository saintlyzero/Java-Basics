
// A Java program to demonstrate use of Comparable 
import java.io.*;
import java.util.*;

// A class 'SuperHero' that implements Comparable 
class SuperHero implements Comparable<SuperHero> {
    private double power;
    private String name;
    private int ranking;

    // Used to sort SuperHeros by ranking
    public int compareTo(SuperHero SuperHero) {
        return this.ranking - SuperHero.ranking;
    }

    // Constructor
    public SuperHero(String name, double power, int ranking) {
        this.name = name;
        this.power = power;
        this.ranking = ranking;
    }

    // Getter methods for accessing private data
    public double getpower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public int getranking() {
        return ranking;
    }
}

// Driver class
class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<SuperHero> list = new ArrayList<SuperHero>();
        list.add(new SuperHero("Superman", 100, 1));
        list.add(new SuperHero("Batman", 97.5, 2));
        list.add(new SuperHero("Wonder Woman", 95.7, 3));
        list.add(new SuperHero("Spiderman", 85.0, 4));

        Collections.sort(list);

        System.out.println("SuperHeros after sorting : ");
        for (SuperHero SuperHero : list) {
            System.out.println(SuperHero.getName() + " " + SuperHero.getpower() + " " + SuperHero.getranking());
        }
    }
}
