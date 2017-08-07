import java.util.Arrays.*;

/**
 * Created by svcli on 03.08.2017.
 */
public class Bomb {
    String[][] bombPlace = new String[11][11];

    public void bombGen(String[][] a) {
        for (int i = 0; i < 10;) {
            int x = (int) (1 + (Math.random() * 10));
            int y = (int) (1 + (Math.random() * 10));
            if (a[x][y] == null) {
                a[x][y] = "1\t";
              //  System.out.print(i+1 + ".\tX: "+ x + "\t Y: " + y);
              //  System.out.println();
                i++;

            }
            else continue;
        }
      //  System.out.println();
      //  System.out.println();

    }

    public void printBomb(String[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
