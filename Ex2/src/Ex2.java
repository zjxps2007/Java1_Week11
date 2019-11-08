import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int A;
        double B;
        int i;
        String digit;
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 ");
        digit = scan.next();

        for(i = 0; i < digit.length(); i++) {
            if (digit.charAt(i) == '.')
                break;
        }
        if (i == digit.length()) {
            A = Integer.parseInt(digit);
            System.out.println("입력한 숫자는 정수 입니다. 숫자 : " +A);
        }
        else {
            B = Double.parseDouble(digit);
            System.out.println("입력하신 숫자는 실수 입니다. 숫자 : "+B);
        }
    }
}
