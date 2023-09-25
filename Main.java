import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String studentName;
        String studentNumber;

        System.out.print("이름을 입력하세요: ");
        studentName = scan.next();
        System.out.print("학번을 입력하세요: ");
        studentNumber = scan.next();

        System.out.println("<출력>");
        System.out.println("이름: " + studentName);
        System.out.println("학번: " + studentNumber);
    }
}