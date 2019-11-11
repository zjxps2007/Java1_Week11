import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        int num, w,h,c;
        //입력받음
        System.out.print("도형의 종류를 선택하세요(삼각형: 1, 사각형: 2, 원: 3) :");
        num = sc.nextInt();

        //입력받은 수로 판별
        switch (num) {
            case 1:
                //1일 때 입력 받음
                System.out.print("첫 번째 변의 길이: ");
                w = sc.nextInt();
                System.out.print("두 번째 변의 길이: ");
                h = sc.nextInt();
                System.out.print("세 번째 변의 길이: ");
                c = sc.nextInt();
                //삼격형의 둘레 출력
                System.out.println(shape.perimeter(w,h,c));
                break;
            case 2:
                //2일때 입력받음
                System.out.print("가로의 길이: ");
                w = sc.nextInt();
                System.out.print("세로의 길이: ");
                h = sc.nextInt();
                //사각형의 둘레 출력
                System.out.println(shape.perimeter(w,h));
                break;
            case 3:
                //3일때 입력받음
                System.out.print("지름의 길이: ");
                c = sc.nextInt();
                //원 둘레 출력
                System.out.println(shape.perimeter(c));
        }
    }
}
