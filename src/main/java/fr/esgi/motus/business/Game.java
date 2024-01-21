package fr.esgi.motus.business;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static int nextId = 0;
    private final int id;

    private Word word;
    private Score score;
    private List<Attemp> attempts;

    // Constructor
    public Game() {
        this.id = nextId++;
        // Initialize word, score and attempts
        this.word = null; // It's now expected to be set by another method
        this.score = new Score();
        this.attempts = new ArrayList<>();
    }

    public void setWord(Word word) {
        this.word = word;
    }

    // Method to handle player's guess
    public void guess(Word guess) {
        Attemp attemp = new Attemp(guess);
        attempts.add(attemp);

        if (guess.getWord().equals(word.getWord())) {
            // Player guessed correctly
            score.increaseScore();
        } else if (attempts.size() >= 10) {
            // Player used all of their attempts
            // Game over. Handle this situation as needed.
        }
    }

    public int getId() {
        return id;
    }

    public Word getWord() {
        return word;
    }

    public Score getScore() {
        return score;
    }

    public List<Attemp> getAttempts() {
        return attempts;
    }
}