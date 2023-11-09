public class RegularPolygon {
    
    private int n = 3;
    private double length = 1;
    private double x = 0;
    private double y = 0;   

    RegularPolygon() {
    
    }

    RegularPolygon(int n, double length) {
        this();
        if(n > 2 ) {
            this.n = n;
            
        }
        if(length >0){
            this.length = length;
        }
    }

    RegularPolygon(int n, double length, double x, double y) {
        this(n, length);
        this.x = x;
        this.y = y;
        if(n > 2 ) {
            this.n = n;
            
        }
        if(length >0){
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

    public String toString(){
        /*The method toString() that returns the coordinates of the polygon's points. The first segment of the polygon is always aligned with x+ axis of a cartesian coordinate. The coordinates are separated with comma without any space in between. The values of the coordinates always in form of two digits decimal value. For example, a polygon which has four sides with length of 1 with origin (0,0) will return: (0.00,0.00),(1.00,0.00),(1.00,1.00),(0.00,1.00). */
        String result = "";

        for(int i = 0; i< n;i++){

            double x = (this.x+this.length*Math.sin(2*i* Math.PI / n + Math.PI/n )) * Math.sqrt(2)/2 +0.5;
            double y = (this.y+this.length*Math.cos(2*i* Math.PI / n + Math.PI/n))* Math.sqrt(2)/2+0.5;

            
            result += String.format("(%.2f,%.2f)",x,y);
            if(i != n-1){
                result += ",";
            }

        }

        return result;
    }


}
