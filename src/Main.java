import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Дым");
        cats[1] = new Cat("Том");
        cats[2] = new Cat("Лиса");
        cats[3] = new Cat("Котяра");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catsList = new ArrayList<>();

        for (Cat cat : cats){
            catsList.add(cat);
        }

        catsList.add(new Cat( "Мурка"));

        System.out.println(catsList.toString());

    }



}