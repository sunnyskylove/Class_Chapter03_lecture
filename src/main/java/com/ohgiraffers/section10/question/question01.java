package com.ohgiraffers.section10.question;

import java.util.Scanner;

// IF 구문으로
public class question01 {
    public static void main(String[] args) {
        System.out.println(" 점수를 입력해주시면 등급 확인이 가능합니다 : ");

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("축하합니다~ A 등급입니다.");

        } else if (grade >= 80 && grade <= 90) {
            System.out.println("어머나~ B 등급입니다.");

        } else if (grade >= 60 && grade <= 70) {
            System.out.println("안타깝네요. D 등급입니다.");

        } else if (grade < 60) {
            System.out.println("힘내세요.. F 입니다.");

        }
    }
}
        //문제_정고은
//문제: 성적 등급 매기기

//학생의 점수를 입력받아서 해당 점수에 따라 등급을 부여하는 프로그램을 작성하세요.

//조건 : If문 으로 작성할 것

//90 이상: A
//80 이상 90 미만: B
//70 이상 80 미만: C
//60 이상 70 미만: D
//60 미만: F

// Switch문으로~~       package Practice;
//
//import java.util.Scanner;
//
//public class Test04_01 {
//
//    public static void main(String[] args) {
//
//        // switch 문
//        Scanner sc = new Scanner(System.in);
//        System.out.print("점수를 입력하세요. : ");
//        int score = sc.nextInt();
//
//        //switch문 작성
//        int result = score / 10;
//        switch (result){
//            case 10:
//            case 9:
//                System.out.println("당신의 성적은 A!!");
//                break;
//            case 8:
//                System.out.println("당신의 성적은 B!!");
//                break;
//            case 7:
//                System.out.println("당신의 성적은 C!!");
//                break;
//            case 6 :
//                System.out.println("당신의 성적은 D!!");
//                break;
//            default:
//                System.out.println("당신의 성적은 F!!");
//                break;
//        }
//
//
//    }
//}






