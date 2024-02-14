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


        System.out.println("===================================================================");
        B_while a4 = new B_while();

//        a4.testSimpleWhileStatement();
//        a4.testWhileExample1();                    //문자열 입력해서 인덱스 확인
//        a4.testWhileExample2();                 // 구구단

        B_doWhile c = new B_doWhile();
//        c.testSimpleDoWhileStatement();           //do_while문 (딱 1번만 출력나옴/1~10)_false
//          c.testDoWhileExample1();        //ㄴequals/문자열 입력하면 고대로~, exit 입력하면 종료멘트후 종료됨

        System.out.println("============================문제풀이========================================");
        //연습. Test_for 문제
//        Test_for a3 = new Test_for();
//        a3.testTest();        // 1~10 출력
//        a3.test2();           //역정렬 다시~!!
//        a3.test3();       // 구구단 7단 출력
//        a3.test4();         // 1~100 중 짝수만 출력
//        a3.test5();
//        a3.test6();            // 시,분 출력
//        a3.test7();                 // 별트리 출력____보류...ㅠㅠ

        //연습. Test_while 문제
        Test_while b = new Test_while();
        b.testAgain();                 // 1부터 10까지의 숫자를 출력하는 프로그램
//        b.testAgain02();                 // 2. 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 / 이상하다..90만단위로 -됨..ㅠㅠ
//        b.testAgain03();                   // 구구단 7단을 출력하는 프로그램  / 이상하다..ㅠㅠ 7*1=7만 출력됨..ㅠㅠ


    }
}