public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир!");
        byte type1 = 10;
        System.out.println("Значение переменной type1 с типом byte равно " +type1);
        short typeTwo = 500;
        System.out.println("Значение переменной typeTwo с типом short равно " +typeTwo);
        int typeThree = 5000;
        System.out.println("Значение переменной typeThree с типом int равно "+typeThree);
        long typeFour = 10000L;
        System.out.println("Значение переменной typeFour с типом long равно "+typeFour);
        float typeFive = 5.5f;
        System.out.println("Значение переменной typeFive с типом float равно "+typeFive);
        double typeSix = 5.55555555;
        System.out.println("Значение переменной typeSix с типом doubl равно "+typeSix);
        // Задача №2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int i = -159;
        int f = 27897;
        byte h = 67;
        // Задача №3
        int lydmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        float forEveryone = (float) paper /(lydmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано "+ forEveryone+" листов бумаги!");
        // Задача №4
        int twoMinutes = 16;
        int oneMinutes = twoMinutes/2;
        int oneDay = oneMinutes*24*60;
        int twentyMinutes = oneMinutes*20;
        System.out.println("За 20 минут машина произвела "+twentyMinutes+ " Бутылок!");
        int day = oneMinutes*24*60;
        System.out.println("За 1 день машина произвела " +day+" Бутылок!");
        int threeDays = oneDay*3;
        System.out.println("За 3 дня машина произвела "+threeDays+" Бутылок!");
        int oneMonth= oneDay*31;
        System.out.println("За 1 месяц машина произвела "+ oneMonth+" Бутылок!");
        // Задача №5
        int totalPaint = 120;
        int paint1Class = 6;
        int totalClasses = totalPaint/paint1Class;
        int whitePaint = totalClasses*2;
        int brownPaint = totalClasses*4;
        System.out.println("В школе где "+totalClasses+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+ " банок коричневой краски!");
        // Задача №6
        int bananas = 80;
        int milk100Ml= 105;
        int iceCream = 100;
        int agg = 70;
        int cocktail = bananas*5+milk100Ml*2+iceCream*2+agg*4;
        System.out.println("Вес такого коктейля в граммах составит "+cocktail);
        float cocktailKg = (float) cocktail/1000;
        System.out.println("В кг составит "+cocktailKg);






    }
    }
