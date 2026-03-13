import java.util.*;
import java.util.Random;
class GameAthlete {
    String name;
    int energy;
    int skillPower;
    int maxEnergy;
    boolean isActive;
    static int totalAthletes = 0;
    GameAthlete() {
        this.name = "Player";
        this.energy = 100;
        this.skillPower = 10;
        this.maxEnergy = 100;
        this.isActive = true;
        totalAthletes++;
    }
    GameAthlete(String name, int energy, int skillPower,int maxEnergy) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = maxEnergy;
        this.isActive = isActive;
        totalAthletes++;
    }
    void compete(GameAthlete opponent) {
        if (this.isActive && opponent.isActive) {
            opponent.energy -= this.skillPower;
            if (opponent.energy <= 0) {
                opponent.energy = 0;
                opponent.isActive = false;
            }
            System.out.println(this.name + " competed against " + opponent.name);
        }
    }
    void rest(int amount) {
        if (this.isActive) {
            this.energy += amount;
            if (this.energy > this.maxEnergy) {
                this.energy = this.maxEnergy;
            }
            System.out.println(this.name + " rested and regained " + amount + " energy.");
        }
    }
    void train() {
        if (this.isActive) {
            Random random = new Random();
            int gain = random.nextInt(11);
            this.skillPower += gain;
            System.out.println(this.name + " trained and gained " + gain + " skill power.");
        }
    }
    void displayStats() {
        System.out.println("\n\tName: " + name);
        System.out.println("Energy: " + energy + "/" + maxEnergy);
        System.out.println("Skill Power: " + skillPower);
        System.out.println("Active: " + isActive);

    }
    public static void main(String[] args) {
        System.out.println("Sana Tasneem Azimudin=2024503007");
        GameAthlete athlete1 = new GameAthlete("Alice", 100, 12, 100);
        GameAthlete athlete2 = new GameAthlete("Bob", 90, 15, 100);
        GameAthlete athlete3 = new GameAthlete();
        athlete1.compete(athlete2);
        athlete2.compete(athlete3);
        athlete3.compete(athlete1);
        athlete1.rest(15);
        athlete2.rest(20);
        athlete3.rest(10);
        athlete1.train();
        athlete2.train();
        athlete3.train();
        athlete1.displayStats();
        athlete2.displayStats();
        athlete3.displayStats();
        System.out.println("Total Athletes Created: " + GameAthlete.totalAthletes);
    }

}


