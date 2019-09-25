public class ParcoursColonne extends Parcours {

    public ParcoursColonne(TableauEntier t){
        super(t);
    }

    @Override
    public void suivant() {
        this.nbParcourus++;
        if (this.ligneCour + 1 >= this.tab.getHauteur()) {
            this.ligneCour = 0;
            this.colonneCour++;
        } else {
            this.ligneCour++;
        }
    }
}
