public class ParcoursLigne extends Parcours {

    public ParcoursLigne(TableauEntier t){
        super(t);
    }

    @Override
    public void suivant() {
        this.nbParcourus++;
        if (this.colonneCour + 1 >= this.tab.getLargeur()) {
            this.colonneCour = 0;
            this.ligneCour++;
        } else {
            this.colonneCour++;
        }
    }
}
