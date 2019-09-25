public class ParcoursLigne extends Parcours {

    public ParcoursLigne(TableauEntier t){
        super(t);
    }

    @Override
    public void suivant() {
        nbParcourus++;
    }
}
