import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String studentName;
        String studentNumber;
        String studentMajor;

        System.out.print("이름을 입력하세요: ");
        studentName = scan.next();
        System.out.print("학번을 입력하세요: ");
        studentNumber = scan.next();
        System.out.print("학과를 입력하세요: ");
        studentMajor = scan.next();

        System.out.println("<출력>");
        System.out.println("이름: " + studentName);
        System.out.println("학번: " + studentNumber);
        System.out.println("학과: " + studentMajor);
    }
}