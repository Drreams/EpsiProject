import serietheque.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Collection maCollection = new Collection();
        Serie x = new Serie(87739, "Le Jeu de la dame");
        Saison s = new Saison();
        s.addEpisode(new Episode(1, 1, "Ouvertures", 60));
        s.addEpisode(new Episode(1, 2, "Échanges", 60));
        s.addEpisode(new Episode(1, 3, "Pions doublés", 60));
        s.addEpisode(new Episode(1, 4, "Milieu de jeu", 60));
        s.addEpisode(new Episode(1, 5, "Fourchette", 60));
        s.addEpisode(new Episode(1, 6, "Ajournement", 60));
        s.addEpisode(new Episode(1, 7, "Finale", 60));

        x.addSaison(s);
        maCollection.addSerie(x);

// ------ Deuxième série
        x = new Serie(76479, "The Boys");
        s = new Saison();
        s.addEpisode(new Episode(1, 1, "La Règle du jeu", 60));
        s.addEpisode(new Episode(1, 2, "Cerise", 60));
        s.addEpisode(new Episode(1, 3, "Prends ça", 60));
        s.addEpisode(new Episode(1, 4, "La Fille", 60));
        s.addEpisode(new Episode(1, 5, "Des bleus à l'âme", 60));
        s.addEpisode(new Episode(1, 6, "Les Innocents", 60));
        s.addEpisode(new Episode(1, 7, "Question de survie", 60));
        s.addEpisode(new Episode(1, 8, "On ne prend plus de gants", 60));
        x.addSaison(s);

        s = new Saison();
        s.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 60));
        s.addEpisode(new Episode(1, 2, "Préparation propre et planification", 60));
        s.addEpisode(new Episode(1, 3, "La Charge de la brigade légère", 60));
        s.addEpisode(new Episode(1, 4, "Rien de tel dans le monde entier", 60));
        s.addEpisode(new Episode(1, 5, "Quand faut y aller, faut y aller", 60));
        s.addEpisode(new Episode(1, 6, "On ne prend plus de gants", 60));
        s.addEpisode(new Episode(1, 7, "Le Fils du boulanger", 60));
        s.addEpisode(new Episode(1, 8, "Les Innocents", 60));
        x.addSaison(s);

        maCollection.addSerie(x);

        BufferedReader syl1=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("******************");
        System.out.println("* Ma Serietheque *");
        System.out.println("******************");
        System.out.println("s : Statistiques");
        System.out.println("l : Liste des séries");
        System.out.println("d : Détail d'une série");
        System.out.println("r : Rechercher une série");
        System.out.println("a : Ajouter une série");
        System.out.println("q : Quitter l'application");
        System.out.println("Choisir une option :");
        String readLine =syl1.readLine();
        switch(readLine)
        {
            case "s": {
                System.out.println("Statistiques");
                System.out.println("Nombre de series : " + maCollection.getNbSerie());
                System.out.println("Nombre de saison : " + maCollection.getNbSaison());
                System.out.println("Nombre d épisode : " + maCollection.getNbEpisode());
                System.out.println("Durée totale : " + maCollection.getDureeTotale() / 60+ 'h');

            }
            break;
            case "l":{
                for(Serie serie : maCollection.getSeries()) {
                    System.out.println(serie.getId() + " : " + serie.getTitre());
                }

            }
            break;
            case "d":{
                System.out.println("Quel est l'id de la série ?");

                int readLineId = Integer.parseInt(syl1.readLine());

                Serie maSerie = maCollection.getSerie(readLineId);

                if (maSerie == null) {
                    System.out.println("Bad id");
                    System.exit(0);
                }

                System.out.println(maSerie.getId());
                System.out.println("id: " + maSerie.getId());
                System.out.println("Titre: " + maSerie.getTitre());
                System.out.println("Duree: " + maSerie.getDureeTotale());
                System.out.println("Nombre de saisons: " + maSerie.getNbSaison());
                System.out.println("Nombre d episodes: " + maSerie.getNbEpisode());
                System.out.println("Episodes: ");
                for(Saison saison : maSerie.getSaisons()) {
                    for(Episode episode : saison.getEpisodes()) {
                        System.out.println("S" + episode.getNumeroSaison() + "E" + episode.getNumero() + " : " + episode.getTitre());
                    }
                }

            }
            break;
            case "r":{
                System.out.println("Rechercher une série");
                System.out.println("Quel est l'id de la série ?");

                int readLineId = Integer.parseInt(syl1.readLine());

                Serie maSerie = maCollection.getSerie(readLineId);

                if (maSerie == null) {
                    System.out.println("Bad id");
                    System.exit(0);
                }
                System.out.println(maSerie.getTitre());
            }
            break;
            case "a":{
                System.out.println("Ajouter une série");
                System.out.println("Quel est l'id de la série ?");
                int readLineId = Integer.parseInt(syl1.readLine());
                Serie maSerie = maCollection.addSerie();
                System.out.println("Quel est l'id de la série ?");
            }
            break;
            case "q":{
                System.out.println("Bye");
            }
            break;
        }



    }
}
