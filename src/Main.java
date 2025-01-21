public class Main {
    public static void main(String[] args) {
        System.out.println("Task № 1");
        int monthCumulative = 0;
        int financialCumulative = 0;
        while (financialCumulative <= 2_459_000) {
            financialCumulative += 15000;
            monthCumulative++;
        }
        System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", monthCumulative, financialCumulative);
        System.out.println("Task № 2");
        int numbers = 0;
        while (numbers < 10) {
            numbers++;
            System.out.printf("%s ", numbers);
        }
        System.out.println(" ");
        for (; numbers > 0; numbers--) {
            System.out.printf("%s ", numbers);
        }
        System.out.println(" ");
        System.out.println("Task № 3");
        int year = 0;
        int deathRate = 8;
        int bornRate = 17;
        int countPeople = 12_000_000;
        while (year < 10) {
            year++;
            countPeople += countPeople / 1000 * (bornRate - deathRate);
            System.out.printf("Год %s, численность населения составляет %s%n", year, countPeople);
        }
        System.out.println("Task № 4");
        int month = 0;
        int contribution = 15000;
        while (contribution <= 12_000_000) {
            month++;
            contribution += contribution / 100 * 7;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, contribution);
        }
        System.out.println("Task № 5");
        int month2 = 0;
        int contribution2 = 15000;
        while (contribution2 <= 12_000_000) {
            month2++;
            contribution2 += contribution2 / 100 * 7;
            if (month2 % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month2, contribution2);
            }
        }
        System.out.println("Task № 6");
        int finalYear = 9;
        int finalMonth = finalYear * 12;
        int deposit = 15000;
        int currentMonth = 0;
        while (currentMonth != finalMonth) {
            currentMonth++;
            deposit += deposit / 100 * 7;
            if (currentMonth % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", currentMonth, deposit);
            }
        }
        System.out.println("Task № 7");
        int firstDateFriday = 3;
        int monthDayCount = 31;
        while (firstDateFriday <= monthDayCount) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", firstDateFriday);
            firstDateFriday += 7;
        }
        long time1 = System.nanoTime();
        System.out.println("Task № 8 ver. 1");
        int currentYear = 2025;
        int firstYear = (currentYear - 200) / 79;
        int lastYear = currentYear + 100;
        int startYear = firstYear * 79;
        while (startYear <= lastYear - 79) {
            startYear += 79;
            System.out.println(startYear);
        }
        long time2 = System.nanoTime();
        long finalTime = time2 - time1;
        System.out.println(finalTime);
        long time3 = System.nanoTime();
        System.out.println("Task № 8 ver. 2");
        int currentYear1 = 2025;
        int firstYear1 = (currentYear1 - 200);
        int lastYear1 = currentYear1 + 100 - 79;
        int startYear1 = 0;
        while (startYear1 <= lastYear1) {
            startYear1 += 79;
            if (startYear1 >= firstYear1) {
                System.out.println(startYear1);
            }
        }
        long time4 = System.nanoTime();
        long finalTime1 = time4 - time3;
        System.out.println(finalTime1);
    }
}

