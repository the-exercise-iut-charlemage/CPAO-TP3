public class ParcoursZigzag extends Parcours{

    private boolean reverse;

    public ParcoursZigzag(TableauEntier t){
        super(t);
        reverse = false;
    }

    @Override
    public void suivant() {
        nbParcourus++;
        if(reverse){
            colonneCour--;
        }else {
            colonneCour++;
        }
        if(colonneCour >= tab.getLargeur()){
            if(reverse) {
                colonneCour = tab.getLargeur() -1;
            }else {
                colonneCour = 0;
            }
            ligneCour++;
            reverse = !reverse;
        }
    }
}
