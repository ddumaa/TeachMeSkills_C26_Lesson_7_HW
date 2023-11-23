package homework.task_2;

public class Rectangle extends BaseFigure {
   public double length;
   public double width;

   public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }

   @Override
   public double areaCalculation() {
      return length * length;
   }

   @Override
   public double perimeterCalculation() {
      return (length + width) * 2;
   }


   //public double square = length * length;
   //public double perimeter = (length + width) * 2;


}
