package lesson6;

public class Main1 {


    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 15, 17);
        Triangle triangle1 = new Triangle();

        int perimetr = triangle.perimetr();
        System.out.println(perimetr);

        PryamoygTriangle triangle2 = new PryamoygTriangle();

        Krug krug1 = new Krug();
        Krug krug2 = new Krug();

        Object[] objects = new Object[5];
        Triangle a = (Triangle) objects[0];



    }
}
