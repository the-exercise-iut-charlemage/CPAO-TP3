import org.junit.Assert;
import org.junit.Test;

public class TestParcoursZigzag {

    @Test
    public void test_parcours_zigzag() {
        int[][] t = new int[][] {
                {1, 2, 3, 4},
                {10, 20, 30 ,40},
                {100, 200, 300, 400}
        };
        TableauEntier tableauEntier = new TableauEntier(t);
        Parcours p = tableauEntier.iterateurZigzag();
        while (p.hasNext()) {
            int tmp = p.next();
            Assert.assertNotEquals("La valeur n'est pas bonne", Integer.MIN_VALUE, tmp);
            System.out.println(tmp);
        }
    }
}
