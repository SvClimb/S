/**
 * Created by svcli on 13.07.2017.
 */
public class Place {
    public void place(){
        int[][] a = new int[11][11];
        String[] ch = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",};
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((i == 0)) {
                    a[i][j] = (i + 1) * (j + 1) - 1;
                    if (a[i][j] == 0) System.out.print(" " + "\t");
                    else System.out.print(a[i][j] + "\t");
                }
                else if ((j == 0) && (i>0)){
                    System.out.print(ch[i-1] + "\t");
                }
                else {
                    System.out.print("*" + "\t");
                }
            }
            System.out.println();
        }
    }
}