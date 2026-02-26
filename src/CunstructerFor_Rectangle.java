class oblong {
    private int length;
    private int breadth;

    public oblong() {
        length = 1;
        breadth = 1;
    }

    public oblong(int l, int b) {
        setLength(l);
        setBreadth(b);
    }

    public oblong(int s) {
        length = breadth = s;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(int b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class CunstructerFor_Rectangle {
    public static void main(String[] args) {
        oblong r = new oblong(10,5);

        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        System.out.println("Is Square = " + r.isSquare());
    }
}
