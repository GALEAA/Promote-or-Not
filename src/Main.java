import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, literature, chemistry, music;


        Scanner lessons = new Scanner(System.in);

        System.out.print("Math exam result:     ");
        math = lessons.nextInt();

        System.out.print("Physics exam result:   ");
        physics = lessons.nextInt();

        System.out.print("Literature exam result:   ");
        literature = lessons.nextInt();

        System.out.print("Chemistry exam result:   ");
        chemistry = lessons.nextInt();

        System.out.print("Music exam result:    ");
        music = lessons.nextInt();

        double avarage = (double) (math + physics + literature + chemistry + music) / 5;

        if (avarage <= 45) {
            System.out.println("Fail the class");
        }
        else {
            System.out.println("You passed class succesfully");
        }
        System.out.println("Your avarage is:    " + avarage);
    }
}
