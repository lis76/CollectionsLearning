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

        catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2,new Cat("Меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());

    }



}