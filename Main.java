import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(1, 2), 4, 6));
        shapes.add(new Square(new Point(3, 3), 5));
        shapes.add(new Circle(new Point(1, 0), 7));

        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getShapeCount());

        System.out.println("\nDanh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getInfo());
        }

        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
