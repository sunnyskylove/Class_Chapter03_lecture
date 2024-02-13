package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine(){

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. (1) */

        /* 필기. for문 안에서 for문을 이용할 수 있다. */

        /*필기. 단이 1개씩 증가하는 동안 수행할 내용은 해당 단의 구구단을 출력하는 것. */
        // *공통: dan= ~단 이 반복됨(2~9단까지 계획), su= 바뀌는 수 (1~10전까지 증가)
        for (int dan = 2; dan < 10; dan++){

            for(int su = 1; su < 10; su++){      // 아래 출력값이 해당 메소드의{}안에 있어서 해당 su는 9까지 다 돌아야, 위의 for로 다시 돌아간다.
                System.out.println(dan + "*" + su + " = " + (dan * su));
            }
            System.out.println();                           //하나 종료!
        }

    }
    /* 중요! 이중 for문을 메소드로 만들어서 하는 활용법 */
    public void printUpgradeGugudan(){

        for(int dan = 2; dan < 10; dan++){

            printGugudanOf(dan);              // dan 이라는 값을 보낸다.(메소드 호출), parameter라는 다른 변수 이름으로 보낼수도 있다.

        }

    }

    public void printGugudanOf(int parameter){        //printGugudanOf(dan); 이 보내서 (int parameter)로 받은 것임

        for(int su = 1; su < 10; su++){

            System.out.println(parameter + " * " + su + " = "  + (parameter * su));
            // 따라서 출력도 받은 변수로 출력
        }

    }

    public void printStarInputRowTimes(){

        /* 필기.
        *   키보드로 정수를 하나 입력 받아(Scanner 만들고),
        *   해당 정수 만큼 한 행에 "*" 를(공통인자) 5개씩 출력하세요.
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();                          //입력한 행을 변수에 담아주기~

        for(int i = 1; i <= row; i++){              // 1부터 행 순환

            for(int j = 1; j < 6; j++){             // 아래 *가 5만큼 만들어지면 위의 for로 감
                System.out.print("*");                      // 5개의 별이 나오게 출력

            }

            System.out.println();       // 줄 띄우기 위해서 한번 더 출력해준다.

        }




    }

}
