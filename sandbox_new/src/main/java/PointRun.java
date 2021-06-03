import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointRun {

    public static void main(String[] args) {

        //метод pf

        PointWithFunction pfa = new PointWithFunction();
        pfa.x = 5.2;
        pfa.y = -2.0;

        PointWithFunction pfb = new PointWithFunction();
        pfb.x = -7.75;
        pfb.y = 8.0;

        System.out.println("Расстояние между точками равно " +
                String.format("%.3f",PointWithFunction.distance(pfa,pfb)) + " см. (метод pf)");

        //метод pb

        PointWithBuilder pba = new PointWithBuilder(5.2,-2);

        PointWithBuilder pbb = new PointWithBuilder(-7.75, 8);

        System.out.println("Расстояние между точками равно " + String.format("%.3f",sqrt(pow((pbb.x - pba.x), 2) +
                pow((pbb.y - pba.y), 2))) + " см. (метод pb)");

    }


}
