import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(8, -11, 7);
        Vector vector2 = new Vector(-2, -7, 8);
        double length = 0;
        Vector[] vectorArray = new Vector[10];
        length = vector1.vectorLength();
        System.out.println(length);
        System.out.println(vector1.scalarProduct(vector2));
        System.out.println(vector1.vectorProduct(vector2));
        System.out.println(vector1.cosAngle(vector2)); // угол = 45
        System.out.println(vector1.sum(vector2));
        System.out.println(vector1.dif(vector2));
        vectorArray = Vector.randomArray(10);

        for (int i = 0; i < vectorArray.length; i++) {
            System.out.println(vectorArray[i].xDot + " " + vectorArray[i].yDot + " " + vectorArray[i].zDot);
        }
    }
}
