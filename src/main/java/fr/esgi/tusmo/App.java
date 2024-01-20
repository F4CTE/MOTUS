package fr.esgi.tusmo;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import fr.esgi.tusmo.business.Word;
import fr.esgi.tusmo.business.Game;
import fr.esgi.tusmo.business.Player;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
 // Objet de type ArrayList qui va accueillir nos 100 000 joueurs
 	private static ArrayList<Word> words = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
//    private static void importWord() {
//        try {
//            // Utilisez URL pour ouvrir un flux d'entrée depuis l'URL
//            URL url = new URL("https://raw.githubusercontent.com/gverdier/motus/master/Console/Dictionnaire6.txt");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
//
//            String line;
//            // Lire chaque ligne du fichier texte
//            while ((line = reader.readLine()) != null) {
//                // Votre logique pour créer des objets Ville, Département, Région et les ajouter à vos listes
//                Word word = new Word();
//                word.setNom(line);
//
//                // Ajoutez le reste de votre logique ici
//
//                words.add(word);
//                System.out.println(word);
//            }
//
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private static void importWord() {
        try {
        	 URL url = new URL("https://raw.githubusercontent.com/gverdier/motus/master/Console/Dictionnaire6.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            // Lire chaque ligne du fichier texte
            while ((line = reader.readLine()) != null) {

                // Votre logique pour créer des objets Ville, Département, Région et les ajouter à vos listes
                Word word = new Word();
                word.setNom(line);
                
                
                // Ajoutez le reste de votre logique ici
                
                words.add(word);
                System.out.println(word);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
    
    private static void afficherMot() {
        System.out.println("Nombre de mots : " + words.size()); // Ajout de cette ligne

        for(Word word: words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        //launch();
        Player player = new Player("Player1");
        Game game = new Game(player);
        importWord();
        afficherMot();
        game.startGame();
        game.endGame();
    }

}