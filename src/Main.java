public class Main {
    public static void main(String[] args) {
        System.out.println("Task № 1");
        int contributionMonth = 0;
        int i = 0;
        while (i <= 2_459_000) {
            i += 15000;
            contributionMonth += 1;
        }
        System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", contributionMonth, i);
        System.out.println("Task № 2");
        int numbers = 0;
        while (numbers < 10) {
            numbers += 1;
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
            year += 1;
            countPeople += countPeople / 1000 * (bornRate - deathRate);
            System.out.printf("Год %s, численность населения составляет %s%n", year, countPeople);
        }
        System.out.println("Task № 4");
        int month = 0;
        int contribution = 15000;
        while (contribution <= 12_000_000) {
            month += 1;
            contribution += contribution / 100 * 7;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, contribution);
        }
        System.out.println("Task № 5");
        int month2 = 0;
        int contribution2 = 15000;
        while (contribution2 <= 12_000_000) {
            month2 += 1;
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
            currentMonth += 1;
            deposit += deposit / 100 * 7;
            if (currentMonth % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", currentMonth, deposit);
            }
        }
        System.out.println("Task № 7");
        int firstDateFriday = 3;
        int currentDate = 0;
        while (currentDate <= 31) {
            currentDate += 1;
            if ((currentDate - firstDateFriday) % 7 == 0) {
                System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", currentDate);
            }
        }
        System.out.println("Task № 8");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int lastYear = currentYear + 100;
        while (startYear != lastYear) {
            startYear += 1;
            if (startYear % 79 == 0) {
                System.out.println(startYear);
            }
        }
    }
}