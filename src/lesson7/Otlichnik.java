package lesson7;

public class Otlichnik  extends Student{

    public Otlichnik() {
    }

    public Otlichnik(int age, String name) {
        super(age, name);
    }

    // переопределить метод

    @Override
    public int perimetrTreug(int a, int b, int c) {
        // 2   2    100
        if(a + b <= c || b + c <= a || c + a <= b){
            System.out.println("Это не треугольник!!!");
            return -1;
        }

        return a + b + c;
    }
}
