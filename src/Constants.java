/**
 * Created by Svyatoslav on 02.02.2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays.*;
public class Constants {
    public static  void main(String[] args) throws IOException {
       Bomb b = new Bomb();
       b.bombGen(b.bombPlace);
       b.printBomb(b.bombPlace);

       // Place pl = new Place();
      //  pl.place();

        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите координаты: ");
        String s = reader.readLine();
        System.out.println(reader.toString() + " " + b.toString());
        Robot r = new Robot("Test");
        System.out.println(r.toStr());
    }


    public static class Robot
    {
        private String name;

        public Robot(String name) {
            this.name = name;
        }

       // @Override
        public String toStr() {
            return "name=" + name;
        }
    }
}
