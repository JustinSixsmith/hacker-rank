package interviewPrep;

import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            // If scores are equal, sort alphabetically
            return a.name.compareTo(b.name);
        } else {
            // Sort by decreasing score
            return b.score - a.score;
        }
    }
}
