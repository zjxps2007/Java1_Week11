import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        //변수 선언
        String formula;
        double A ,B, s = 0;
        char ch=0;
        int i;
        //수식을 입력 받음
        Scanner scan = new Scanner(System.in);
        System.out.print("수식입력: ");
        formula = scan.next();

        for(i =0; i < formula.length(); i++) {
            // 변수 ch에 연산기호를 대입
            ch = formula.charAt(i);
            //연산기호까지 반복
            if (ch=='+'|| ch=='-'||ch=='/'||ch=='*') {
                break;
            }
        }

        //앞쪽 숫자 구함
        A = Double.parseDouble(formula.substring(0,i));
        //뒤쪽 숫자 구함
        B = Double.parseDouble(formula.substring(i+1));

        //ch 에 있는 연산기호에 맞게 연산
        if(ch == '+') {
            s = A+B;
        }
        else if(ch == '-') {
            s = A-B;
        }
        else if(ch == '/') {
            s = A/B;
        }
        else if(ch == '*') {
            s = A*B;
        }
        //출력
        System.out.print(formula.substring(0,i+1));
        System.out.print(formula.substring(i+1) + "=");
        System.out.print(s);
    }
}
