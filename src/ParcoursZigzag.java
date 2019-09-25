public class ParcoursZigzag extends Parcours{

    boolean reverse;

    public ParcoursZigzag(TableauEntier t){
        super(t);
        reverse = false;
    }

    @Override
    public void suivant() {
        nbParcourus++;
        colonneCour++;
        if(colonneCour >= tab.getLargeur()){
            colonneCour = 0;
            ligneCour++;
            reverse = !reverse;
        }
    }
}
