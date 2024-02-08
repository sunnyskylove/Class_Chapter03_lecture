package com.ohgiraffers.section01.conditional;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.Scanner;

public class Test_git02 {

    //제어문_Practice_hard
    /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
     * - 저체중(20 미만)인 경우 "당신은 저체중 입니다.", if(num>20)
     * - 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",  else(num >= 20 && num < 25) { }
     * - 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",  else(num >= 25 && num < 30) { }
     * - 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요   else(num >= 30)
     *
     * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
     *
     * 계산 예시) BMI = 67 / (1.7 * 1.7)
     * */
    public void Test_git02(){

        System.out.println("BMI(신체질량지수)를 계산해 드립니다.");
        System.out.print("체중을 kg 로 입력해주세요 :");


        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();             // 자료형대로 입력 double = nextDouble

        System.out.print("신장을 m로 입력해주세요 :");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);      // 계산식 만들기


//        Test_git02 Method1 = new Test_git02();
//        Method1.Test_git02();
//        //메소드 호출 하면 안됨...;; class가 또 생겨짐...;;


        // BMI 조건?

        if(BMI >= 20 && BMI < 25 ){
            System.out.println("당신은 정상체중 입니다.");

        } else if(BMI>20) {
            System.out.println("당신은 저체중 입니다.");

    } else if (BMI >= 25 && BMI < 30) {
            System.out.println("당신은 과체중 입니다.");


    } else if(BMI >= 30) {
        System.out.println("당신은 비만 입니다.");

    } else
        System.out.println("잘못 입력하셨습니다.");

}

//public void Method1 (){
//    System.out.println("weight" + 'kg' + "height" + 'm' + "height" + 'm');

}

