import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer> {

    private TableauEntier tab;
    protected int ligneCour;
    protected int colonneCour;
    protected int nbParcourus;

    public Parcours(TableauEntier t){
        this.tab = t;
        this.ligneCour = tab.getLargeur();
        this.colonneCour = tab.getHauteur();
        this.nbParcourus = 0;
    }

    @Override
    public boolean hasNext() {
        return ligneCour*colonneCour > nbParcourus;
    }

    @Override
    public Integer next() {
        suivant();
        return tab.valeurA(ligneCour,colonneCour);
    }

    public abstract void suivant();
}
