import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Дым");
        cats[1] = new Cat("Том");
        cats[2] = new Cat("Лиса");
        cats[3] = new Cat("Котяра");

        cats[1] = null;

        System.out.println(Arrays.toString(cats));
    }



}