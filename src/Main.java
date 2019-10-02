public class Main {
    public static void main(String[] args) {

        Point point = new Point();
        System.out.println(point);

        point.setXY(1,2);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint.setSpeed(2,3);
        System.out.println(movablePoint);

        movablePoint.setXY(1,3);
        System.out.println(movablePoint);

        movablePoint = movablePoint.move();
        System.out.println(movablePoint);
    }
}
