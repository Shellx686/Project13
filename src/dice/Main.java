package dice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Alien alien1 = new Alien("Альф");
        Alien alien2 = new Alien("Марсианин");
        Alien alien3 = new Alien("Лунатик");
        Human human1 = new Human("Петр1");
        Human human2 = new Human("Македонский");
        Human human3 = new Human("Черчилль");
        Zombie zombie1 = new Zombie("Ааа");
        Zombie zombie2 = new Zombie("Ооо");
        Zombie zombie3 = new Zombie("Ууу");

        int[] players = new int[9];
        players[0] = alien1.dropAlien("Альф");
        players[1] = alien2.dropAlien("Марсианин");
        players[2] = alien3.dropAlien("Лунатик");
        players[3] = human1.dropHuman("Петр1");
        players[4] = human2.dropHuman("Македонский");
        players[5] = human3.dropHuman("Черчилль");
        players[6] = zombie1.dropZombie("Ааа");
        players[7] = zombie2.dropZombie("Ооо");
        players[8] = zombie3.dropZombie("Ууу");

        int max = 2;
        int num = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i] > max) {
                max = players[i];
                num = i;
            }

        }
        System.out.println("Победители: ");
        if (players[0] == max) {
            System.out.println(alien1.getName() + "! Он выкинул " + max);
        } if (players[1] == max) {
            System.out.println(alien2.getName() + "! Он выкинул " + max);
        } if (players[2] == max) {
            System.out.println(alien3.getName() + "! Он выкинул " + max);
        } if (players[3] == max) {
            System.out.println(human1.getName() + "! Он выкинул " + max);
        } if (players[4] == max) {
            System.out.println(human2.getName() + "! Он выкинул " + max);
        } if (players[5] == max) {
            System.out.println(human3.getName() + "! Он выкинул " + max);
        } if (players[6] == max) {
            System.out.println(zombie1.getName() + "! Он выкинул " + max);
        } if (players[7] == max) {
            System.out.println(zombie2.getName() + "! Он выкинул " + max);
        } if (players[8] == max) {
            System.out.println(zombie3.getName() + "! Он выкинул " + max);
        }

    }
}
