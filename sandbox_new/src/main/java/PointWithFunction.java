import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointWithFunction {

    public double x;
    public double y;

    public static double distance(PointWithFunction p1, PointWithFunction p2){

       return sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2));

    }

}