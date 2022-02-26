package lesson7;

public class Main {
    public static void main(String[] args) {
        Otlichnik otlichnik1 = new Otlichnik(23, "Вася");
        Otlichnik otlichnik2 = new Otlichnik(23, "Вася");

        Student student1 = new Student(25, "Кирилл");
        Student student2 = new Student(24, "Кирилл");

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = otlichnik2;
        students[2] = otlichnik1;
        students[3] = student2;

        System.out.println(student1.toString());


        // for each
        for(Student s:students){
            System.out.println(s.perimetrTreug(2,2,20)); // полиморфизм
        }

    }
}
