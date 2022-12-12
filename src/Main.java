import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Write your code here

        //Arrays

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Дым");
        cats[1] = new Cat("Том");
        cats[2] = new Cat("Лиса");
        cats[3] = new Cat("Котяра");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        // ArrayList
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

        //LinkedList
        String str1 = new String("Hello World");
        String str2 = new String("My name is Roman");
        String str3 = new String("I love Svetu");

        LinkedList<String> romanBio = new LinkedList<>();
        romanBio.add(str1);
        romanBio.add(str2);
        romanBio.add(str3);

        System.out.println(romanBio);

        romanBio.remove(1);

        System.out.println(romanBio);


    }



}