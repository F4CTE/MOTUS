package fr.esgi.tusmo.business;

public class Game {
	private Player player;
    private Grid grid;
    private boolean gameInProgress;

    public Game(Player player) {
        this.player = player;
        this.grid = new Grid(); // Vous devez définir un constructeur pour la classe Grid
        this.gameInProgress = false;
    }

    // Méthode pour commencer une nouvelle partie
    public void startGame() {
        // Initialiser les paramètres de la partie, si nécessaire
        gameInProgress = true;

        System.out.println("Game started!");

        // Exemple de logique de jeu : le joueur propose un mot
        String proposedWord = "ExampleWord"; // Vous pouvez demander à l'utilisateur de saisir un mot
        player.proposeWord(proposedWord, grid);
    }

    // Méthode pour terminer la partie
    public void endGame() {
        // Calculer le gagnant, afficher les résultats, etc.
        gameInProgress = false;

        System.out.println("Game ended!");
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Player player = new Player("Player1");
        Game game = new Game(player);

        game.startGame();
        game.endGame();
    }
}
