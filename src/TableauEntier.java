/**
 * Class permetent de geres les tableau a 2 dimenstion
 */
public class TableauEntier {

    /**
     * Tableau d'entier a 2 dimenstion
     */
    private int[][] t;

    /**
     * contruteur par default
     * @param t tableau d'entier a deux dimenstion
     */
    public TableauEntier(int[][] t) {
        this.t = t;
    }

    /**
     * fonction pour optenir un valeur dans le tableau
     * @param l position sur le premier tableau
     * @param c position sur le deusieme tableau
     * @return la valeur au position donné, si sortie de tableau alors retour la valeur minimal d'un entier
     */
    public int valeurA(int l, int c) {
        try {
            return this.t[l][c];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return Integer.MIN_VALUE;
        }
    }

    /**
     * fonction pour openir la taille du deuxeme tableau
     * @return la taille en entier
     */
    public int getLargeur() {
        try {
            return this.t[0].length;
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    /**
     * fonction pour optenir la taille du premier tableau
     * @return la taille en entier
     */
    public int getHauteur() {
        return this.t.length;
    }

    public Parcours iterateurLigne() {
        return new ParcoursLigne(this);
    }
}
