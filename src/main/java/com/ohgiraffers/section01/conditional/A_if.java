package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){


        /* 수업목표. if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   [if 문 표현식]
        *   if(조건식) {
        *      조건식이 true 일 경우 실행하는 명령문;
        *   }
        * */

        /* 필기.
        *   조건식 : true or false 가 나오는 연산식을 조건식이라고 한다.
        *   if문은 조건식의 결과가 참(true) 이면 {} 안에 있는 코드를 실행하고,
        *   조건식의 결과 값이 거짓(false) 이면 {} 안에 있는 코드를 무시한다.
        * */

        /* 필기.
        *   정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다."
        *   라고 출력하고, 아니면 출력하지 않는 구문을 작성해보자.
        *   단, 조건과 상관 없이 프로그램이 종료될 때, "프로그램을 종료합니다."
        *   라고 출력되도록 한다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력하세요 : ");
        int num = sc. nextInt();

        if(num % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수입니다.");

        }

        System.out.println("프로그램을 종료합니다...");
        // 따로 메소드 생성 (예: 짝수로 입력할시 종료됩니다로 뜬다._위와 반대결과시)
        // 그리고 실행은 Application01에서 한다.
        // 자료생성을 Application01에서 했어서..

    }

    public void testNestedIfStatement(){

        /* 수업목표. 중첩된 if문 의 흐름을 이해하고 적용할 수 있다. (이중 if)*/

        /* 필기. 중첩된 if문 실행 흐름 확인 */

        /* 필기.
        *   정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
        *   짝수이면 "입력하신 숫자는 양수이면서 짝수입니다."라고 출력하고,
        *   둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을
        *   작성해보자.
        *   단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다."
        *   라고 출력되도록 한다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();
        // 여기서, sc는 지역변수라고 해서 중복 쓰임에도 상관없다.

        if(num > 0) {

            if(num % 2 == 0) {

                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
                // if문에 만족못하면(false면), 무시되고 다음("프로그램을 종료합니다...")으로 그냥 넘어가게 됨.

            }

        }

        System.out.println("프로그램을 종료합니다...");

    }

}
