package lesson3;


import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Овал");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Треугольник");
        System.out.println("5 - Трапеция");

        Scanner scanner = new Scanner(System.in);



        String figura = scanner.nextLine();
        if(figura.equalsIgnoreCase("круг") || figura.equals("1")){
            System.out.println("Окружность или площадь?");
            String action = scanner.nextLine();
            System.out.println("Введите радиус круга: ");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if(action.equalsIgnoreCase("площадь")){
                System.out.println("Площадь круга: " + (Math.PI * (r * r)));
            }else {
                System.out.println("Окружность круга: " + (2 * Math.PI * r));
            }
        }else if(figura.equalsIgnoreCase("овал") || figura.equals("2")){

        }else if(figura.equalsIgnoreCase("квадрат") || figura.equals("3")){

        }else if(figura.equalsIgnoreCase("треугольник") || figura.equals("4")){

        }else if(figura.equalsIgnoreCase("трапеция") || figura.equals("5")){

        }else {

        }


    }
}
