import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer> {

    private TableauEntier tab;
    private int ligneCour;
    private int colonneCour;
    private int nbParcourus;

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
