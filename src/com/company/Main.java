package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задача1
        byte apple = 2;
        short orange = 5;
        int peach = 9;
        long melon = 100L;
        float tomato = 2.5f;
        double cucumber = 3.752;
        boolean appleCount = apple > 10;
        System.out.println(appleCount);
        char plus = 43;
        System.out.println(plus);

        //Задача2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        double weightDifferent = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightDifferent + " кг");

        //Задача3
        short banana = 5;
        int oneBananaWeight = 80;
        short milk = 2;
        int oneMilkWeight = 105;
        short icecream = 2;
        int oneIcecreamWeight = 100;
        short eggs = 4;
        int oneEggWeight = 70;
        int bananaWeight = banana * oneBananaWeight;
        int milkWeight = milk * oneMilkWeight;
        int icecreamWeight = icecream * oneIcecreamWeight;
        int eggsWeight = eggs * oneEggWeight;
        double weightTotal = bananaWeight + milkWeight + icecreamWeight + eggsWeight;
        System.out.println("Общий вес в граммах: " + weightTotal);
        double weightTotalkg = weightTotal/1000;
        System.out.println("Общий вес в кг: " + weightTotalkg);

        //Задача4
        short weight = 7;
        int weightgr = 7 * 1000;
        int dayCount250 = weightgr / 250;
        int dayCount500 = weightgr / 500;
        System.out.println(dayCount250 + " дней, если терять по 250 грамм");
        System.out.println(dayCount500 + " дней, если терять по 500 грамм");
        int dayMean = (dayCount250 + dayCount500) / 2;
        System.out.println(dayMean + " день в среднем");

        //Задача5
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        double MashaNew = Masha * 1.1;
        double DenisNew = Denis * 1.1;
        double KristinaNew = Kristina * 1.1;
        double MashaRazn = MashaNew * 12 - Masha * 12;
        double DenisRazn = DenisNew * 12 - Denis * 12;
        double KristinaRazn = KristinaNew * 12 - Kristina * 12;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaRazn + " рублей.");
        System.out.println("Денис теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + DenisRazn + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaNew + " рублей. Годовой запас вырос на " + KristinaRazn + " рублей.");






    }
}
