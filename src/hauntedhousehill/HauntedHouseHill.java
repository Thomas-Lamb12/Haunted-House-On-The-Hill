/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hauntedhousehill;
import java.util.Scanner;


/**
 *
 * @author Me
 */
public class HauntedHouseHill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
             try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Haunted House on the Hill ===");

            String name;
            do {
                System.out.print("Enter your character's name: ");
                name = scanner.nextLine().trim();

                if (name.isEmpty()) {
                    System.out.println("Character name cannot be empty.");
                }
            } while (name.isEmpty());

            CharacterClass[] classes = CharacterClass.values();

            System.out.println("\nChoose your character class:");
            for (int i = 0; i < classes.length; i++) {
                System.out.println((i + 1) + ". " + classes[i]);
            }

            int classChoice = readChoice(scanner, 1, classes.length);

            Player player = new Player(
                    1,
                    name,
                    classes[classChoice - 1]
            );

            System.out.println("\nWelcome, " + player.getName() + "!");

            boolean running = true;

            while (running && player.isAlive()) {
                System.out.println("\n--- Actions ---");
                System.out.println("1. View character stats");
                System.out.println("2. Take 20 damage");
                System.out.println("3. Heal 15 HP");
                System.out.println("4. Spend 5 AP");
                System.out.println("5. Restore 5 AP");
                System.out.println("6. Quit");

                int choice = readChoice(scanner, 1, 6);

                switch (choice) {
                    case 1:
                        displayStats(player);
                        break;

                    case 2:
                        player.takeDamage(20);
                        System.out.println("You took 20 damage.");
                        System.out.println(
                                "HP: " + player.getCurrentHp()
                                + "/" + player.getMaxHp()
                        );
                        break;

                    case 3:
                        player.heal(15);
                        System.out.println(
                                "HP after healing: "
                                + player.getCurrentHp()
                                + "/" + player.getMaxHp()
                        );
                        break;

                    case 4:
                        if (player.spendAp(5)) {
                            System.out.println("You spent 5 AP.");
                        } else {
                            System.out.println("Not enough AP.");
                        }

                        System.out.println(
                                "AP: " + player.getCurrentAp()
                                + "/" + player.getMaxAp()
                        );
                        break;

                    case 5:
                        player.restoreAp(5);
                        System.out.println(
                                "AP after restoration: "
                                + player.getCurrentAp()
                                + "/" + player.getMaxAp()
                        );
                        break;

                    case 6:
                        running = false;
                        break;

                    default:
                        break;
                }
            }

            if (!player.isAlive()) {
                System.out.println("\nYour character has fallen. Game over!");
            } else {
                System.out.println("\nThanks for playing!");
            }
    }
    
}



    private static int readChoice(
            Scanner scanner,
            int minimum,
            int maximum) {

        while (true) {
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                if (choice >= minimum && choice <= maximum) {
                    return choice;
                }
            } catch (NumberFormatException exception) {
                // Show the same validation message for nonnumeric input.
            }

            System.out.println(
                    "Please enter a number from "
                    + minimum + " to " + maximum + "."
            );
        }
    }

    private static void displayStats(Player player) {
        System.out.println("\n--- Character Stats ---");
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Class: " + player.getCharacterClass());
        System.out.println(
                "HP: " + player.getCurrentHp()
                + "/" + player.getMaxHp()
        );
        System.out.println(
                "AP: " + player.getCurrentAp()
                + "/" + player.getMaxAp()
        );
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
    }
}
