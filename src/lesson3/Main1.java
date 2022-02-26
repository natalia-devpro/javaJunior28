package lesson3;

public class Main1 {
    public static void main(String[] args) {
        // напечатать от 1 до 20, пропуска интервал от 5 до 10
        for(int i = 1; i <= 20; i++){
            if(i < 5 || i > 10){
                System.out.println(i);
            }
        }
    }
}
