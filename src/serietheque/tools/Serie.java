package serietheque.tools;

import java.util.ArrayList;

public class Serie {
    public Serie(int id, String titre){
        this.id = id;
        this.titre = titre;
    }

    private int id;
    private String titre;
    private ArrayList<Saison> saisons = new ArrayList<>();

    public void addSaison(Saison saison) {
        this.saisons.add(saison);
    }
}
