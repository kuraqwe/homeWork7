public class Main {
    public static void main(String[] args) {
        int total = 0;
        int numberOfMonth = 0;
        while (total < 2_459_000){
            total = total + 15_000;                                                                     //the first task
            numberOfMonth++;
        }
        System.out.println("Месяц " + numberOfMonth + " сумма накоплений равна " + total + " рублей.");

        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }                                                                                               //the second task
        System.out.println();
        for (i = 10; i>=1; i--){
            System.out.print(i + " ");
        }

        int population = 12_000_000;
        int populationGrowth = 17 - 8;
        for (int n = 0; n <= 10; n++){
            population = population + (population / 1000 * populationGrowth);                           //the third task
            System.out.println("Год " + n + " Численность населения составляет " + population);
        }

        double total1 = 15_000;
        int a = 0;
        while (total1 < 12_000_000){
            total1 = total1 * 1.07;                                                                     //the fourth and the fifth task
            a++;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + ", сумма накоплений " + total1);
            }
        }

        double total2 = 15_000;
        for (int b = 0; b <= 12 * 9; b++){
            total2 = total2 * 1.07;
            if (b % 6 == 0){
                System.out.println("сумма накоплений в " + b + " месяце составляет " + total2);             //the sixth task
            }
            b++;
        }

        for (int friday = 3; friday <= 31; friday = friday + 7){
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");  //the seventh task
        }

        int year = 0;
        do{
            year = year + 79;
            if (year > 1822){
                System.out.println(year);                                                                   //the eighth task
            }
        } while (year < 2022);

        for (int c = 1; c <= 10; c++){
            System.out.println("2*" + c + "=" + (2*c));                                                     //the ninth task
        }
    }
}