package fr.esgi.tusmo.business;

public class Grid {
	private char[][] grid;

    // Constructeur pour initialiser la grille
    public Grid() {
        // Exemple : une grille 3x3 initialement vide
        grid = new char[][] {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
    }

    // Méthode pour afficher la grille
    public void displayGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Méthodes pour mettre à jour la grille, vérifier les lettres, etc.
    public void updateGrid(int row, int col, char letter) {
        if (isValidPosition(row, col)) {
            grid[row][col] = letter;
        } else {
            System.out.println("Invalid position on the grid.");
        }
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }
}
