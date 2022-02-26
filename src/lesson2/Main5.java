package lesson2;

public class Main5 {
    public static void main(String[] args) {
        // посчитать и напечатать на консоль сумму чисел от 10 до 30

        int summa = 0;
        for(int i = 10; i <= 30; i++){
            summa = summa + i;
        }
        System.out.println(summa);
    }
}
