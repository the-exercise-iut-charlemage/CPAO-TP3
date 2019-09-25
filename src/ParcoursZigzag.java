public class ParcoursZigzag extends Parcours{

    private boolean reverse;

    public ParcoursZigzag(TableauEntier t){
        super(t);
        reverse = false;
    }

    @Override
    public void suivant() {
        this.nbParcourus++;
        if (!reverse) {
            if (this.colonneCour + 1 >= this.tab.getLargeur()) {
                this.reverse = true;
                this.ligneCour++;
            } else {
                this.colonneCour++;
            }
        } else {
            if (this.colonneCour <= 0) {
                this.reverse = false;
                this.ligneCour++;
            } else {
                this.colonneCour--;
            }
        }
    }
}
