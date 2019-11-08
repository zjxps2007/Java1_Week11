import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        int num, w,h,c;
        System.out.print("도형의 종류를 선택하세요(삼각형: 1, 사각형: 2, 원: 3) :");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.print("첫 번째 변의 길이: ");
                w = sc.nextInt();
                System.out.print("두 번째 변의 길이: ");
                h = sc.nextInt();
                System.out.print("세 번째 변의 길이: ");
                c = sc.nextInt();
                System.out.println(shape.perimeter(w,h,c));
                break;
            case 2:
                System.out.print("가로의 길이: ");
                w = sc.nextInt();
                System.out.print("세로의 길이: ");
                h = sc.nextInt();
                System.out.println(shape.perimeter(w,h));
                break;
            case 3:
                System.out.print("지름의 길이: ");
                c = sc.nextInt();
                System.out.println(shape.perimeter(c));
        }
    }
}
