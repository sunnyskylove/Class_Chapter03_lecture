package com.ohgiraffers.section02.looping;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void testTest() {
        //1. 1부터 10까지의 숫자를 출력하는 프로그램
//        Scanner sc = new Scanner(System.in);
//        System.out.print("1부터 10까지의 수 : ");
//        int num = sc.nextInt();       // 입력한 값을 출력할때 쓰임!!!!!!!!!!!!
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public void test2(){
        // 2. 10부터 1까지의 숫자를 역순으로 출력하는 프로그램
        for(int i = 10; i< 11; i--){
            System.out.println(i);
        }
    }
 public void test3(){
     /* 구구단 7단을 출력하는 프로그램 */
             for(int su= 1; su < 10; su++){
              System.out.println(7 + " * " + su  +" = " + (7*su));
          }
      }
    /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
    public void test4(){

        for(int i=2; i <= 100; i+=2 ){      // 증감식일땐 ; 붙이지 않는다, 2를 더해야할때(짝수) 연산법칙 사용할것!!!
            System.out.println(i);
        }
    } public void test5(){
        /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
           * 팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6 */
           // (공통: 1씩 증감?)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("원하는 팩토리얼 숫자를 입력해 주세요 :");
//        int f = sc.nextInt();
//
//        for(int i= 1; i<=f; i++){
//            for(int j= 1; j<i*f; j++)
//            System.out.println("입력하신 숫자의 팩토리얼은" + (i*f));
            //내가 만든 오답...ㅠㅠ 모르겠다~~ ㅠㅠㅠㅠ

        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼 계산을 위한 정수값 입력: ");
        int num = sc.nextInt();

        int fac = 1;	// 초기값 설정
        for(int i = num; i > 0; i--) { // (int i=1; i<=num; i++) 조건식을 다음과 같이 변경해도 동일하게 동작한다.
            fac = fac * i;	// fac *= i;
        }
        System.out.println(num + "! = " + fac);
    }

    }











