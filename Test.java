public class Test {
    public static void main(String[] argc) {
        Triangle tr = new Triangle(3, 4, 5);
        tr.print();
        tr.perimeter();
        tr.area();
        Rectangle rc = new Rectangle(3, 4);
        rc.print();
        rc.perimeter();
        rc.area();
        Array arr = new Array(4);
        arr.enter();
        arr.print();
        arr.sort();
        arr.print();
    }
}