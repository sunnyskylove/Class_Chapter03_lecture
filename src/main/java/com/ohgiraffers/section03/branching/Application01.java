package com.ohgiraffers.section03.branching;

public class Application01 {
    public static void main(String[] args) {

         A_break a = new A_break();
//       a.testSimpleBreakStatement();
//      a.testSimpleBreakStatement2();            //구구단 5이상일떄 break 멈춤!

        B_continue b = new B_continue();
//        b.testSimpleContinueStatement();        //1부터 100 사이의 4의 배수이면서, 5의 배수인 값
        b.testSimpleContinueStatement2();

    }

    }


