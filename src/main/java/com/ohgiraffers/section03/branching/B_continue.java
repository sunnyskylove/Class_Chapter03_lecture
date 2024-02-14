package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement(){

        /* 수업목표. continue 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   continue 문은 반복문 내에서 사용한다.
        *   해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
        *   일반적으로 if(조건식) { continue; } 처럼 사용된다.
        *   보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용됨.
        * */

        /* 필기. 1부터 100 사이의 4의 배수이면서, 5의 배수인 값 출력 */

        for( int i = 1; i < 100; i++){

            if(i % 4 == 0 && i % 5 == 0);       // i를 4 또는 5로 나눴을때 나머지가 0이 되면, 4의배수/5의배수

            /*필기. i값이 4와 5의 공배수인 경우 i 출력 */
            System.out.println(i);

//        } else {
            /* 필기. 공배수가 아닌 경우 증감식으로 넘어감 */
            continue;     //이와 반대되는 조건이면, 증감으로 계속 나갈거야,안써도 됨
        }
    }

    public void testSimpleContinueStatement2(){

        /*필기. continue 문은 모든 반복문을 건너 뛰는 것이 아닌, 자신에게
        *       인접한 반복문 실행만 건너뛴다. (인접한 반복문만 탈출~~)
        * */

        /* 필기.
        *   구구단 2~9단까지 출력
        *   각 단의 수가 짝수인 경우 출력을 생략한다.
        * */

        for(int dan = 2; dan<10; dan++){
            for(int su=1; su<10; su++){

                if(su % 2 == 0){         //su가 짝수이면,

                    continue;          // 1경우) 다음 반복으로 넘어가겠다는 의미. 따라서 홀수로만 출력됨

//                      break;               // 2경우) 멈춰진다. 따라서 2짝수나오면 바로 종료됨

                }

                System.out.println(dan + " * " + su + " = " + (dan * su));

            }

        }

        System.out.println();       //개행해준다~공백출력!

    }

}
