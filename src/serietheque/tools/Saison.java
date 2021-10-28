package serietheque.tools;

import java.util.ArrayList;

import java.util.ArrayList;

public class Saison {
    private ArrayList<Episode> episodes = new ArrayList<>();


    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
    }

    public int getDureeTotale() {
        int dureeTotale = 0;
        for (Episode episode : this.episodes) {
            dureeTotale = dureeTotale + episode.getDuree();
        }

        return dureeTotale;
    }

    public int nbEpisode() {
        return this.episodes.size();
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }
}
