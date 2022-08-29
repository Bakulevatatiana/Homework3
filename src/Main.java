public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte a=127;
        short b=32000;
        int c= 200000000;
        long d= 20L;
        float f= 67.4f;
        double g= 1.456789;
        System.out.println("Значение переменной a  c типом byte равно " + a);
        System.out.println("Значение переменной b  c типом short равно " + b);
        System.out.println("Значение переменной c  c типом int равно " + c);
        System.out.println("Значение переменной d  c типом long равно " + d);
        System.out.println("Значение переменной f  c типом float равно " + f);
        System.out.println("Значение переменной g  c типом double равно " + g);
        float one =27.12f;
        long two = 987_678_965_549L;
        float three = 2.786f;
        boolean four=10<5;
        int i= 569;
        short s =-159;
        short s2 =27897;
        float f3=67.f;
        System.out.println(four);
        byte lp=23;
        byte as=27;
        byte ek=30;
        int totalStudents= lp+as+ek;
        short totalSheets= 480;
        System.out.println("На каждого ученика рассчитано " + totalSheets/totalStudents + " листов бумаги");
        byte bottles= 16;
        byte oneMinute= 16/2;
        int twentyMinutes= oneMinute*20;
        int day=oneMinute*60*24;
       int threeDays=oneMinute*60*24*3;
       int oneMonth=oneMinute*60*24*31;
System.out.println("За 20 минут машина произвела бутылок "+twentyMinutes+ " штук ");
        System.out.println("За один день машина произвела бутылок "+day+ " штук ");
        System.out.println("За  3 дня машина произвела бутылок "+ threeDays+ " штук ");
        System.out.println("За месяц машина произвела бутылок "+oneMonth+ " штук ");
        short afg = 120%2;
byte white= 2;
byte braun=4;
        int classes= 120/(white+braun);
        int totalWhite= white*classes;
        int totalBraun= braun*classes;
        System.out.println("В школе, где "+ classes+" классов, нужно "+totalWhite+"  банок белой краски и "+totalBraun+" банок коричневой краски.");
         int banana = 80;
          banana *= 5;
        int milk=  210;
        int iceCream =  100;
        iceCream *=  2;
        int eggs = 70;
        eggs *= 4;
        int totalProducts= banana+ milk+iceCream+eggs;
        System.out.println(totalProducts);
        float needReset= 7000;
        float _a = needReset/250;
        float _b1 = needReset/500;
        float averageDaily= (_a+_b1)/2;
        System.out.println(averageDaily);
        double Masha_= 67_760;
        double Denis_ = 83_690;
        double Kristina_ =76_230;
        double Masha = 67_760 * 0.1 + Masha_;
        double Denis = 83_690 * 0.1 + Denis_;
        double Kristina =76_230 * 0.1+Kristina_;
        double differenceMasha= Masha-Masha_;
        double differenceDenis= Denis-Denis_;
        double differenceKristina=Kristina-Kristina_;
        System.out.println("Маша теперь получает " + Masha+ " рублей. Годовой доход вырос на "+differenceMasha+" рублей.");
        System.out.println("Денис теперь получает " + Denis+ " рублей. Годовой доход вырос на "+differenceDenis+" рублей.");
        System.out.println("Кристина теперь получает " + Kristina+ " рублей. Годовой доход вырос на "+differenceKristina+" рублей.");















    }
}