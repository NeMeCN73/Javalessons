package lesson4;

/**
 * Created by Администратор on 09.04.2017.
 */
public class Circle2 {
    class Point {
        public double x; // абсцисса точки
        public double y; // ордината точки
        public double r; // радиус
        // возвращает строку с описанием точки

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Point point = (Point) o;
//
//            if (Double.compare(point.x, x) != 0) return false;
//            if (Double.compare(point.y, y) != 0) return false;
//            return Double.compare(point.r, r) == 0;
//        }

//        @Override
//        public int hashCode() {
//            int result;
//            long temp;
//            temp = Double.doubleToLongBits(x);
//            result = (int) (temp ^ (temp >>> 32));
//            temp = Double.doubleToLongBits(y);
//            result = 31 * result + (int) (temp ^ (temp >>> 32));
//            temp = Double.doubleToLongBits(r);
//            result = 31 * result + (int) (temp ^ (temp >>> 32));
//            return result;
//        }
//
//        @Override
//        public String toString() {
//            return "Point{" +
//                    "x=" + x +
//                    ", y=" + y +
//
//                    ", r=" + r +
//                    '}';
//        }

        // выводит на экран описание точки
        public void print() {
            System.out.print(this.toString());
        }

        public void move(double a, double b) {
            x = x + a;
            y = y + b;
        }

        public void set(double a, double b) {
            x = a;
            y = b;
        }

        public Point() {
            x = 0.0;
            y = 0.0;
        }

        public Point(double a, double b) {
            x = a;
        }
        public double length(Point p) {
            return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
        }

        public boolean equals(Point p) {
            if (this.x == p.x && this.y == p.y) {
                return true;
            } else {
                return false;
            }
        }
    }
}

