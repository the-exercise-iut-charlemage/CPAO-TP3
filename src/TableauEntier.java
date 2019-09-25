public class TableauEntier {

    private int[][] t;

    public TableauEntier(int[][] t) {
        this.t = t;
    }

    int valeurA(int l, int c) {
        try {
            return this.t[l][c];
        } catch (ArrayIndexOutOfBoundsException e) {
            return Integer.MIN_VALUE;
        }
    }

    int getLargeur() {
        try {
            return this.t[0].length;
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    int getHauteur() {
        return this.t.length;
    }
}
