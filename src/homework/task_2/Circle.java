package homework.task_2;

public class Circle extends BaseFigure  {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculation() {
        return 3.14 * (radius * radius);
    }

    @Override
    public double perimeterCalculation() {
        return 2 * 3.14 * radius;
    }


    //public double square = 3.14 * (radius * radius);
    //public double perimeter = 2 * 3.14 * radius;

}
