package fr.esgi.tusmo.business;

public class Player {
	private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return ("");
	}
	
	public boolean proposeWord(String word, Grid grid) {
        // Logique pour proposer un mot et mettre à jour la grille
        // Retourne true si la proposition est valide, sinon false

		
        // Exemple simple : accepter tous les mots
        System.out.println(name + " proposed the word: " + word);
        return true;
    }
	
	
}
