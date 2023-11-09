public class RegularPolygon {
    
    private int n = 3;
    private double length = 1;
    private double x = 0;
    private double y = 0;   

    RegularPolygon() {
    
    }

    RegularPolygon(int n, double length) {
        this();
        if(n > 2 && length > 0) {
            this.n = n;
            this.length = length;
        }
    }

    RegularPolygon(int n, double length, double x, double y) {
        this(n, length);
        this.x = x;
        this.y = y;
        if(n > 2 && length > 0) {
            this.n = n;
            this.length = length;
        }

    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n){
        this.n = n;
    }

    public void setSide(double length){
        this.length = length;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getPerimeter() {
        return n * length;
    }

    public double getArea() {
        return (n * length * length) / (4 * Math.tan(Math.PI / n));
    }


}
