import java.util.*;

// A class 'SuperHero' that implements Comparable 
class SuperHero implements Comparable<SuperHero> {
    private double power;
    private String name;
    private int ranking;

    // Used to sort SuperHeros by ranking
    public int compareTo(SuperHero superHero) {
        return this.ranking - superHero.ranking;
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

    public int getRanking() {
        return ranking;
    }
}

class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<SuperHero> list = new ArrayList<SuperHero>();
        list.add(new SuperHero("Wonder Woman", 95.7, 3));
        list.add(new SuperHero("Spiderman", 85.0, 4));
        list.add(new SuperHero("Superman", 100, 1));
        list.add(new SuperHero("Batman", 97.5, 2));

        System.out.println("SuperHeros before sorting : ");
        for (SuperHero SuperHero : list) {
            System.out.println(SuperHero.getName()+" "+SuperHero.getpower()+" "+SuperHero.getRanking());
        }

        // sorts depending on the parameters specified in compareTo()
        Collections.sort(list);

        System.out.println("\nSuperHeros after sorting : ");
        for (SuperHero SuperHero : list) {
            System.out.println(SuperHero.getName()+" "+SuperHero.getpower()+" "+SuperHero.getRanking());
        }
    }
}
