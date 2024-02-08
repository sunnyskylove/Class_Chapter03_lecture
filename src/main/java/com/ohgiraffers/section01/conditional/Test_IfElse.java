package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Test_IfElse {

    public void TestTest() {

        Scanner sc = new Scanner(System.in);
        System.out.println("짝수를 입력하세요. : ");
        int num = sc.nextInt();

        if(num % 2 == 0) {

            System.out.println("입력하신 정수는 짝수입니다.");

        } else {
            System.out.println("입력하신 정수는 홀수입니다.");

            System.out.println("프로그램을 종료합니다.");
        }


    }
}
