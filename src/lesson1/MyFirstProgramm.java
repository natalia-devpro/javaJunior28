package lesson1;

public class MyFirstProgramm {

    public static void main(String[] args) {
        int rubli = 1000;
        int pizzaCost = 230;
        int bubbleCost = 26;
        double candyCost = 2.5;

        int pizzaMax = (rubli / pizzaCost);
        int restAfterByPizza = rubli % pizzaCost;
        int bubbleMax = restAfterByPizza / bubbleCost;
        int restAfterByBubble = restAfterByPizza % bubbleCost;

        int candymax = (int)(restAfterByBubble / candyCost);
        double totalRest = restAfterByBubble - (candyCost * candymax);

        System.out.println("В наличии 1000 рублей. На эти деньги можно купить:");
        System.out.println("пиццы - " + pizzaMax);
        System.out.println("жвачки - " + bubbleMax);
        System.out.println("конфет - " + candymax);
        System.out.println("Сдача: " + totalRest + " рубля");


    }
}

