public class Shape {
    //삼격형 둘레
    public double perimeter(double h, double w, double w1) {
        return h+w+w1;
    }
    //사각형 둘레
    public double perimeter(double h, double w) {
        return (h+w)*2;
    }
    //원 둘레
    public double perimeter(double h){
        return h*3.14;
    }
}
