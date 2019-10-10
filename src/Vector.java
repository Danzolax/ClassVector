import java.util.Random;

public class Vector {
    double xDot;
    double yDot;
    double zDot;

    Vector(Point beginDot, Point endDot) {
        xDot = endDot.x - beginDot.x;
        zDot = endDot.y - beginDot.y;
        zDot = endDot.z - beginDot.z;
    }

    Vector(double x, double y, double z) {
        xDot = x;
        yDot = y;
        zDot = z;
    }

    public double vectorLength() {
        return Math.sqrt(xDot * xDot + yDot * yDot + zDot * zDot);
    }


    public String scalarProduct(Vector vector) {
        double product = xDot * vector.xDot + yDot * vector.yDot + zDot * vector.zDot;
        return "scalar product: " + product;
    }

    public String vectorProduct(Vector vector) {
        double i = yDot * vector.zDot - zDot * vector.yDot;
        double j = (-1) * xDot * vector.zDot - zDot * vector.xDot;
        double k = xDot * vector.yDot - yDot * vector.xDot;
        return "(" + i + "; " + j + "; " + k + ")";
    }

    public String cosAngle(Vector vector) {
        double numerator = xDot * vector.xDot + yDot * vector.yDot + zDot * vector.zDot;
        double denominator = Math.sqrt(xDot * xDot + yDot * yDot + zDot * zDot) * Math.sqrt(vector.xDot * vector.xDot + vector.yDot * vector.yDot + vector.zDot * vector.zDot);
        double angle = numerator / denominator;
        return "angle: " + angle;
    }

    public String sum(Vector vector) {
        double xSum = xDot + vector.xDot;
        double ySum = yDot + vector.yDot;
        double zSum = zDot + vector.zDot;
        return "(" + xSum + ";" + ySum + ";" + zSum + ")";
    }

    public String dif(Vector vector) {
        double xDif = xDot - vector.xDot;
        double yDif = yDot - vector.yDot;
        double zDif = zDot - vector.zDot;
        return "(" + xDif + ";" + yDif + ";" + zDif + ")";
    }

    public static Vector[] randomArray(int amount) {
        Vector[] arrayOfVectors = new Vector[amount];
        for (int i = 0; i < arrayOfVectors.length; i++) {
            arrayOfVectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return arrayOfVectors;
    }


}
