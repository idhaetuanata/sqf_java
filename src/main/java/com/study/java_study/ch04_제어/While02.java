package com.study.java_study.ch04_제어;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While02 {

    //psvm

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    //입력받기위해 사용. 사용자로부터 콘솔입력을 받거나 파일내용을 읽을떄 씀.
        //문자열,정수,실수 등 다양한 타입의 데이터를 읽는 메소드를 제공함.
    System.out.print("개수: ");
        int count = scanner.nextInt();

        int i = 0;
        while(i < count){
            if( i % 2 == 0) {

                //i로 2로 나눴을때 0이니?

                //i가 %2로 나눴을때 0인지 체크합니다.
                System.out.println("짝수입니다.");
                i++;
                continue;

            }
            System.out.println("홀수입니다.");
            i++;
//          continue를 한번 써봅시다. 다음 반복을 계속하라, 라는 명령입니다.
          //  i++;
            //지금 까지만 실행하고, 다음 반복으로 넘어가라.
            //i가 0입니다. 계속 0일겁니다. i++; 안하면. 그럼 무한으로 돌아가겟져.
            //continue 밑에다 i++적으면 안댑니다. 위에 써줘야대여

            //리턴할때마다 1씩 더해줍니다.

            }
        //

        //짝수 아니면 홀수입니다. 하면 else 쓰면되겠죠.
        //대신 continue를 한번 써볼게요. 실용적이진 않는데 이상황에선 else 쓰면대여
        //for문으로 만드는게 좋습니다. 횟수의 증가를 원하면,
        //while보단 for가 나아요. i말고 j써야합니다. while문 밖에 써야합니다.


        //2405241133

          //      for(int j = 0; j < count; j++){
              //      if(1 % 2 ==0); {
            //            System.out.println("짝수입니다.");
                //        continue;
                    }
                    // System.out.print("홀수입니다");
                }


