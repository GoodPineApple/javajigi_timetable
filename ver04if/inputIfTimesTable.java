package timesTable.ver04if;

import java.util.Scanner;

/**
 * Created by taemi on 2017-06-28.
 */
public class inputIfTimesTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isValidated = true;
        while(isValidated){
            System.out.println("출력할 단을 입력하시오 : ");
            int input = scan.nextInt();
            if(input<2 || input>9){
                System.out.println("2~9 사이의 숫자를 입력하세요");
            } else {
                for (int i = 1; i < 10; i++) {
                    System.out.println(input * i);
                }
                isValidated = false;
            }
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
