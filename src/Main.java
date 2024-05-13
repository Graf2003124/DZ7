public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
        }
        {
            System.out.println("Месяцев " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача №2");
        int cycle = 1;
        int cyclone = 10;
        while (cycle < 11) {
            System.out.print(" " + cycle + " ");
            cycle = cycle + 1;
        }
        System.out.println();
        for (; cyclone > 0; cyclone--)
            System.out.print(" " + cyclone + " ");
        System.out.println();
        System.out.println("Задача №3");
        int population = 12_000_000;
        int year = 0;
        int birthRate = 0;
        for (; year < 10; birthRate = (12_000_000 / 1000 * 17) - (12_000_000 / 1000 * 8)) {
            year = year + 1;
            population = population + birthRate;
            System.out.println("Месяц " + year + " Итого " + population);
        }
        System.out.println("Задача №4");
        int income = 15_000;
        int totali = 0;
        int l = 0;
        for (; totali < 12_000_000; l++) {
            totali = totali + (totali * 7 / 100);
            totali = totali + income;
            {
                System.out.println("Месяц " + l + " Итого " + totali);
            }
        }
        System.out.println("Задача №5");
        int incomee = 15_000;
        int totalii = 0;
        int j = 0;
        for (; totalii < 12_000_000; j++) {
            totalii = totalii + (totalii * 7 / 100);
            totalii = totalii + incomee;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + " Итого " + totalii);
            }
        }
        System.out.println("Задача №6");
        int accumulation = 15_000;
        int totalni = 0;
        int month = 0;
        for (; month <= 108; month++) {
            totalni = totalni + (totalni * 7 / 100);
            totalni = totalni + accumulation;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + totalni);
            }
        }
        System.out.println("Задача №7");
        int day = 1;
        for (; day <= 31; day += 7) {
            {
                System.out.println("Сегодня пятница " + day + " необходимо подготовить отчет ");
            }
        }
        System.out.println("Задача №8");
        int currentYear = 2024;
        int before = currentYear - 200;
        int after = currentYear + 100;
        for (int p = 0; p < after; p += 79) {
            if (p >= before) {
                System.out.println(p);
            }
        }
    }
}