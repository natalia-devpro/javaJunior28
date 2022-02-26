package lesson2;

public class Main4 {
    public static void main(String[] args) {
        int znamenatel1 = 2;
        int znamenatel2 = 4;

        int startCommonZnamenatel = 0;

        if(znamenatel1 > znamenatel2){
            startCommonZnamenatel = znamenatel1;
        }else {
            startCommonZnamenatel = znamenatel2;
        }

        for(int i = startCommonZnamenatel; i <= znamenatel1 * znamenatel2; i++){
            if(i % znamenatel1 == 0 && i % znamenatel2 == 0){
                System.out.println("Минимальный общий знаменатель: " + i);
                break;
            }
        }
    }
}
