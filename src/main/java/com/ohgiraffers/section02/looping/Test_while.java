package com.ohgiraffers.section02.looping;

public class Test_while {

    public void testAgain(){

        //1. 1부터 10까지의 숫자를 출력하는 프로그램
        int i = 1;

        while (i < 11){

            System.out.println(i);

            i++;
        }

    }

    public void testAgain02(){

        // 2. 10부터 1까지의 숫자를 역순으로 출력하는 프로그램
        int i = 10;
        while(i < 11){

            System.out.println(i);

            i--;
        }
    }
    public void testAgain03(){

        /* 구구단 7단을 출력하는 프로그램 */
        int dan = 7;
        while (dan < 8){

            int su = 1;
            while (su < 10){
                System.out.println(dan + " * " +  su + " = " + (dan * su));
            }
            su++;

        }

        System.out.println();
        dan++;

    }

    public void testAgain04 (){

        /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
        int i = 2;
        while( i < 100){

            System.out.println();

            }


        }

    }


