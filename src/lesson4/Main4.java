package lesson4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Италия", "5 дней", "самолет", "100000", "5 звезд", "полупансионат", "да"},
                {"2", "Италия", "6 дней", "самолет", "140000", "4 звезды", "пансионат", "нет"},
                {"3", "Италия", "12 дней", "самолет", "170000", "3 звезды", "полупансионат", "нет"},
                {"4", "Италия", "6 дней", "автобус", "200000", "4 звезды", "полупансионат", "да"},
                {"5", "Мальдивы", "7 дней", "самолет", "140000", "5 звезд", "пансионат", "да"},
                {"6", "Мальдивы", "3 дней", "самолет", "130000", "5 звезд", "полупансионат", "да"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну:");
        String country = scanner.nextLine();

        System.out.println("На какой бюджет рассчитываете?");
        String moneyStr = scanner.nextLine();
        // ввел 150 000
        int money = Integer.parseInt(moneyStr);

        System.out.println("Вы можете поехать в такие туры:");
        for(int i = 0; i < tours.length; i++){
            int costTour = Integer.parseInt(tours[i][4]);
            if(country.equals(tours[i][1]) && costTour > money - 30000 && costTour < money + 30000){
                System.out.printf("%s. %s: %s, %s, за %s руб, %s, %s, трансфер - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3],
                        tours[i][4], tours[i][6], tours[i][5], tours[i][7]);
            }
        }

        // напечатать на консоль
        // 1) туры в .. страну только пансионат
        // 2) туры в .. страну от .. звезд и быше
        // 3) туры в любые страны от .. буджета до .. бюджета
        // 4) среднюю стоимость тура нашего турагентства


    }
}
