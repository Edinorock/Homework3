public class Main {
    public static void main(String[] args) {
    // Задача №1
        System.out.println("Задача 1");
    int a = 1;
    byte b = 2;
    short c = 3;
    long d = 4;
    float e = 5.678f;
    double f = 15.670;
    System.out.println("Значение переменной a с типом int равно " + a);
    System.out.println("Значение переменной a с типом byte равно " + b);
    System.out.println("Значение переменной a с типом short равно " + c);
    System.out.println("Значение переменной a с типом long равно " + d);
    System.out.println("Значение переменной a с типом float равно " + e);
    System.out.println("Значение переменной a с типом double равно " + f);
    // Задача №2
        System.out.println("Задача 2");
        double aa = 27.12;
        System.out.println(aa);
        long bb = 987678965549L;
        System.out.println(bb);
        float cc = 2.786f;
        System.out.println(cc);
        boolean dd = false;
        System.out.println(dd);
        short ee = 569;
        System.out.println(ee);
        short ff = -159;
        System.out.println(ff);
        int gg = 27897;
        System.out.println(gg);
        byte hh = 67;
        System.out.println(hh);
        // Задача №3
        System.out.println("Задача 3");
        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        int AllStudent = (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);
        short Paper = 480;
        System.out.println("На каждого ученика рассчитано " + Paper / AllStudent + " листов бумаги");
        // Задача №4
        System.out.println("Задача 4");
        byte Perfomance1 = 16;
        byte Time2 = 2;
        int Time1 = Perfomance1 / Time2;
        int Perfomance20 = Time1 * 20;
        System.out.println("За 20 минут машина произвела " + Perfomance20 + " бутылок");
        int Perfomance1Day = Time1 * 1440;
        System.out.println("За сутки машина произвела " + Perfomance1Day + " бутылок");
        int Perfomance3Day = Perfomance1Day * 3;
        System.out.println("За 3 суток машина произвела " + Perfomance3Day + " бутылок");
        int PerfomanceMonth = Perfomance1Day * 31;
        System.out.println("За 1 месяц машина произвела " + PerfomanceMonth + " бутылок");
        // Задача №5
        System.out.println("Задача 5");
        byte Paints = 120;
        byte White = 2;
        byte Brown = 4;
        int Class = Paints / (White + Brown);
        int White1 = White * Class;
        int Brown1 = Brown * Class;
        System.out.println("В школе, где " + Class + " классов, нужно " +  White1 + " банок белой краски и " + Brown1 + " банок коричневой краски");
        // Задача №6
        System.out.println("Задача 6");
        double Bananas1 = 80;
        double Milki100 = 105;
        double IceCream1 = 100;
        double Egg1 = 70;
        double All = (Bananas1 * 5) + (Milki100 * 2) + (IceCream1 * 2) + (Egg1 * 4);
        System.out.println("Вcего спорт-завтрак весит " + All + " грамм");
        double kg = All / 1000;
        System.out.println("Вcего спорт-завтрак весит " + kg + " килограмм");
        // Задача №7
        System.out.println("Задача 7");
        int LoseWeight = 7 * 1000;
        int Diet1 = 250;
        int Diet2 = 500;
        int Lose = LoseWeight / Diet1;
        System.out.println("При рационе №1, когда спортсмен теряет 250 грамм, он похудеет за " + Lose + " дней");
        int Lose2 = LoseWeight / Diet2;
        System.out.println("При рационе №2, когда спортсмен теряет 500 грамм, он похудеет за " + Lose2 + " дней");
        int averageWeight = (Diet1 + Diet2) / 2;
        int averageTime = LoseWeight / averageWeight;
        System.out.println("Чтобы добиться результатов похудения, может понадобиться " + averageTime + " дней в целом ");
        // Задача №8
        System.out.println("Задача 8");
        int Masha = ((67760 * 10) / 100) + 67760;
        int Masha2 = Masha - 67760;
        System.out.println("Маша теперь получает " + Masha + " рублей. Ее годовой доход вырос на " + Masha2 + " рублей.");
        int Denis = ((83690 * 10) / 100) + 83690;
        int Denis2 = Denis - 83690;
        System.out.println("Денис теперь получает " + Denis + " рублей. Его годовой доход вырос на " + Denis2 + " рублей.");
        int Kristina = ((76230 * 10) / 100) + 76230;
        int Kristina2 = Kristina - 76230;
        System.out.println("Кристина теперь получает " + Kristina + " рублей. Ее годовой доход вырос на " + Kristina2 + " рублей.");

    }

}