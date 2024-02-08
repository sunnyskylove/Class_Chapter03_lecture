package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Test_git01 {

    public void TestGit() {

        // 제어문_practice_normal
        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

        System.out.println("1~10 사이의 정수 입력하기 : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >=1 && num <= 10) {
            // 작은 수의 조건부터 식을 만들어준다.

        } if (num % 2 == 0){
            System.out.println("입력하신 정수는 짝수입니다.");

        } else
            System.out.println("입력하신 정수는 홀수입니다.");

//  중첩if_조건이 2개만(홀수,짝수) 있기 떄문에 1개만 만들고, 나머지는 이미 else로 (조건)없이 출력으로 종료한다.
//  IfIfElse

        }


    }

