package com.ohgiraffers.section02.looping;

public class Application01 {

    public static void main(String[] args) {

        A_for a = new A_for();              //불러올 클래스 이름 = new 불러올 클래스이름();
//        a.testSimpleForStatement();       // 불러올 클래스의 void 이름)();
//        a.testForExample1();
//        a.testForExample2();
//        a.testForExample3();
//        a.testForExample4();
//        a.printSimpleGugudan();             // 보고 싶은 구구단 출력

        A_nestedFor a2 = new A_nestedFor();         //  A_nestedFor 클래스 새로 만들어졌으니깐~~
//        a2.printGugudanFromTwoToNine();
//        a2.printUpgradeGugudan();
//        a2.printStarInputRowTimes();                // 예를 들어, 3을 입력하면: "3줄행으로 별5개" 나옴

        Test a3 = new Test();
//        a3.testTest();        // 1~10 출력
//        a3.test2();           //역정렬 다시~!!
//        a3.test3();       // 구구단 7단 출력
//        a3.test4();         // 1~100 중 짝수만 출력
        a3.test5();




    }


}