package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_doWhile {

    public void testSimpleDoWhileStatement(){

        /*수업목표. do-while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        /* 필기.
        *   [do-while 문 표현식]
        *   초기식;
        *   do {
        *    1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문((반복할 구문);
        *    증감식;
        *    } while(조건식);
        * */

        do {

            System.out.println("최초 1번만 동작하니?");

        } while (false);

        System.out.println("반복문 종료 확인");   // 1번 실행하고 끝나는지 확인위해 또 한번 출력문 작성(false)
    }

    public void testDoWhileExample1(){

        /* 필기.
        *   키보드로 문자열 입력 받아 반복적으로 출력
        *   단, exit 가 입력되면 반복문을 종료한다.
        * */

        Scanner sc = new Scanner(System.in);
        String str = "";                //문자열의 초기화는 공백 ""

        do {

            System.out.println("문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);

           /*필기. equals() : 문자열은 == 비교가 불가능하다. 이유를 물으신다면 나중에 해드릴께요.*/
        } while(!str.equals("exit"));       //문자열이 exit 입력하면, 종료하겠다는 의미(위에 조건)

        System.out.println("프로그램을 종료합니다.");

    }


}
