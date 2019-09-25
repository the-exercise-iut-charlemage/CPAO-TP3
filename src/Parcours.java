import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer> {

    protected TableauEntier tab;
    protected int ligneCour;
    protected int colonneCour;
    protected int nbParcourus;

    public Parcours(TableauEntier t){
        this.tab = t;
        this.ligneCour = 0;
        this.colonneCour = 0;
        this.nbParcourus = 0;
    }

    @Override
    public boolean hasNext() {
        return (tab.getHauteur()) * (tab.getLargeur()) > nbParcourus;
    }

    @Override
    public Integer next() {
        Integer tmp = tab.valeurA(ligneCour,colonneCour);
        suivant();
        return tmp;
    }

    public abstract void suivant();
}
