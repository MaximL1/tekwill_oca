package com.company;
import java.util.*;

public class BonusProblem {

    static class Player {
        String name;
        int age;
        int points;

        public static int comparePlayerName(Player a , Player b)
        {
            return a.name.compareTo(b.name);
        }
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding Duke
        players[0] = new Player();
        players[0].name = "Duke";
        players[0].age = 17;
        players[0].points = 200;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding John
        players[2] = new Player();
        players[2].name = "John";
        players[2].age = 16;
        players[2].points = 250;

        // Adding Joe
        players[3] = new Player();
        players[3].name = "Joe";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Anna
        players[4] = new Player();
        players[4].name = "Anna";
        players[4].age = 19;
        players[4].points = 270;

        /*
         * Sort the array of players in increasing order.
         * Array should be sort in 3 different ways : by name, by age and by points
         */
        Arrays.sort(players , Player::comparePlayerName);

        for (int i = 0; i<players.length;i++) {
            System.out.println(players[i].name);
             }
        Arrays.sort(players, Comparator.comparingInt(p -> p.age));
        for (int i = 0; i<players.length;i++) {
            System.out.println(players[i].age);
        }
        Arrays.sort(players, Comparator.comparingInt(p -> p.points));
        for (int i = 0; i<players.length;i++) {
            System.out.println(players[i].points);
        }
        }
}
