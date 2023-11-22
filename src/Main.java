import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int agePerson = 15;
        if (agePerson >= 18) {
            System.out.println("Вы совершеннолетний");
        }
        else {
            System.out.println("Вы не достигли совершеннолетия");
        }
        System.out.println("Задача №2");
        double temperature = 2;
        boolean cold = temperature < 5;
        if (cold) {
            System.out.println("Нужно надеть шапку");
        }
        else {
            System.out.println("Можно идти без шапки");
        }
        System.out.println("Задача №3");
        int speed = 70;
        if (speed> 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить щтраф");
        }
        else {
            System.out.println("Можно нздить спокойно");
        }
        System.out.println("Задача №4");
        int age = 3;
        if (age>2 && age<6 ) {
            System.out.println("Если возраст человека равен "+age+" Нужно ходить в детский сад");
        }
        if (age>7 && age<17) {
            System.out.println("Если возраст человека равен "+age+" Нужно ходить в школу!");
        }
        if (age>= 18 && age <=24) {
            System.out.println("Если возраст человека равен "+age+" Нужно учиться в универе");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен "+age+" Пора работать)))");
        }
        System.out.println("Задача №5");
        int ageOfTheChild = 4;
        boolean cantRide = ageOfTheChild <= 5;
        boolean accompanied = ageOfTheChild >= 7 && ageOfTheChild < 14;

        if (cantRide) {
            System.out.println("Если возраст ребёнка равен "+ageOfTheChild+ " нельзя кататься на атракционах");
        }
        else if (accompanied) {
            System.out.println("Если возраст ребёнка равен "+ageOfTheChild+" Можно кататься в сопровождении взрослого");
        }
        else {
            System.out.println("Можно кататься");
        }
        System.out.println("Задача №6");
        int van = 102;
        int seating = 60;
        int passengers = 80;
        if (passengers<60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (passengers>60 || passengers<102) {
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("Вагон переполнен");
        }
        System.out.println("Задача №7");
        int one = 45;
        int two = 30;
        int three = 10;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two> one && two> three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }









    }
}