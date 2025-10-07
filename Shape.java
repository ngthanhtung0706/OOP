abstract class Shape {
    protected Point centerPoint;
    private static int shapeCount = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        shapeCount++;
    }

    public static int getShapeCount() {
        return shapeCount;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public abstract String getInfo();
}
