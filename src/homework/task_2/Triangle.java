package homework.task_2;

public class Triangle extends BaseFigure {
   public double length;
    public double width;
    public double height;

    public Triangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double areaCalculation() {
        return (length * height)/2;
    }

    @Override
    public double perimeterCalculation() {
        return length + width + height;
    }


    //public double square = (length * height)/2;
    //public double perimeter = length + width + height;

}
