package serietheque.tools;

public class Episode {

    public Episode(int numero, int numeroSaison, String titre, int duree) {
        this.numero = numero;
        this.numeroSaison = numeroSaison;
        this.duree = duree;
        this.titre = titre;
    }
    private int numero;
    private int numeroSaison;
    private int duree;
    private String titre;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroSaison() {
        return numeroSaison;
    }

    public void setNumeroSaison(int numeroSaison) {
        this.numeroSaison = numeroSaison;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
