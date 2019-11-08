import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        String formula;
        double A ,B, s = 0;
        char ch,op=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("수식입력: ");
        formula = scan.next();
        int i;

        for(i =0; i < formula.length(); i++) {
            ch = formula.charAt(i);
            if (ch=='+'|| ch=='-'||ch=='/'||ch=='*') {
                op = ch;
                break;
            }
        }
        A = Double.parseDouble(formula.substring(0,i));
        B = Double.parseDouble(formula.substring(i+1));

        if(op == '+') {
            s = A+B;
        }
        else if(op == '-') {
            s = A-B;
        }
        else if(op == '/') {
            s = A/B;
        }
        else if(op == '*') {
            s = A*B;
        }
        System.out.print(formula.substring(0,i+1));
        System.out.print(formula.substring(i+1) + "=");
        System.out.print(s);
    }
}
