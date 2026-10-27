package hauntedhousehill;

import java.util.Scanner;

public class HauntedHouseHill {
    
    public Player createPlayer(int classChoice){
        if (classChoice == 1){
            Player jobless = new Player(
                "Jobless", "null", 1, 100, 8, 15, 3, 1, 0, 30);
            return jobless;
        }
        if (classChoice == 2){
            Player boxer = new Player(
            "Boxer", "null", 1, 80, 12, 20, 1, 1, 0, 20);
            return boxer;
        }
        if (classChoice == 3){
            Player doctor = new Player(
            "Doctor", "null", 1, 80, 6, 12, 5, 1, 0, 20);
            return doctor;
        }
        if (classChoice == 4){
            Player detective = new Player(
            "Detective", "null", 1, 120, 6, 20, 1, 1, 0, 50);
            return detective;
        }
        else{
            Player fixme = new Player(
                "FIXME", "FIXME", 1, 1000, 800, 150, 300, 1, 0, 300);
            return fixme;
        }
    }

    public static void main(String[] args) {
        int classChoice = 0;
    }
    
}
