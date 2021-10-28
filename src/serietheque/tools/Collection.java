package serietheque.tools;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Collection {

    private ArrayList<Serie> series = new ArrayList<>();

    public void addSerie(Serie serie) {
        this.series.add(serie);
    }

    public int getDureeTotale() {
        int dureeTotale = 0;
        for (Serie serie : this.series) {
            dureeTotale = dureeTotale + serie.getDureeTotale();
        }
        return dureeTotale;
    }

    public int getNbEpisode() {
        int nbEpisode = 0;
        for (Serie serie : this.series) {
            nbEpisode = nbEpisode + serie.getNbEpisode();
        }
        return nbEpisode;
    }

    public int getNbSaison() {
        int nbSaison = 0;
        for (Serie serie : this.series) {
            nbSaison = nbSaison + serie.getNbSaison();
        }
        return nbSaison;
    }

    public int getNbSerie() {
        return this.series.size();
    }

    public Serie getSerie(int id) {
        Serie serie = null;
        for (Serie serieCurrent : this.series) {
            if (serieCurrent.getId() == id) {
                serie = serieCurrent;
            }
        }

        return serie;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }
}
