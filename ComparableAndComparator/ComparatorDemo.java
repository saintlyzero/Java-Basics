import java.util.*;

class SuperHero {
    private double power;
    private String name;
    private int ranking;

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

// Class to compare SuperHeros by ranking 
class RankingCompare implements Comparator<SuperHero> 
{ 
    public int compare(SuperHero s1, SuperHero s2) 
    { 
        if (s1.getRanking() < s2.getRanking()) return -1; 
        if (s1.getRanking() > s2.getRanking()) return 1; 
        else return 0; 
    } 
} 
  
// Class to compare SuperHeros by name 
class NameCompare implements Comparator<SuperHero> 
{ 
    public int compare(SuperHero s1, SuperHero s2) 
    { 
        return s1.getName().compareTo(s2.getName()); 
    } 
} 


class ComparatorDemo {
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

        System.out.println("\nSorted by name"); 
        NameCompare nameCompare = new NameCompare(); 
        Collections.sort(list, nameCompare); 
        for (SuperHero superHero: list) 
            System.out.println(superHero.getName()+" "+superHero.getRanking()+" "+superHero.getpower());
            

        System.out.println("\nSorted by Ranking"); 
        RankingCompare rankingCompare = new RankingCompare(); 
        Collections.sort(list, rankingCompare); 
        for (SuperHero superHero: list) 
            System.out.println(superHero.getName()+" "+superHero.getRanking()+" "+superHero.getpower());
       

    }
}
