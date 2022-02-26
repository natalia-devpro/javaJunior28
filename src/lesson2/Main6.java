package lesson2;

public class Main6 {
    public static void main(String[] args) {
        int money = 1000000;
        int year = 5;
        int prosent = 7;

        for(int month = 0; month < 12 * year; month++){
            money = money + ((money/100*prosent) /12);
        }
        System.out.println(money);

    }
}
