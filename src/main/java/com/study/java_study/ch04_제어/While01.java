//object : while으로 하나 만들어봅시다.
//0에서부터 5까지, 랜덤한 값을 하나 받을겁니다.
//입력을 계속 받다가, 랜덤한 값이 무엇인지 찾아낼 것입니다.
//if, 4가 걸렸어요. 근데 우린 모른다 치고.
//맞추면 , 프로그램이 종료되는, 그런걸 만들어봅시다.
//while, for 두개가 반복문인데.
//for은 횟수가 중요하다고 했습니다.


package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        //입력 받아야하니까, 스캐너 썼고.
        while(true) {
            //실행시키면 안 됩니다. 무한루프 걸립니다. ()안이 조건인데, true,
            //참일때 계속 반복해라, 라고 하니깐, 계속 참이자나요. 그럼 무한루프가 걸려요.
            //그래서 exit를 만들어야합니다. 23줄에 만들어봅시다.
            Random random = new Random();

            int num = random.nextInt(5); //0에서 4까지.

            // 얘도 nextInt가 들어잇죠. 스캐너의 넥스트인트랑 다른 넥스트인트입니다.
            // 메소드 이름만 같은거지, 다른 의미를 갖고있어요.
            // 10을 넣어봅시다.
            // 26줄은 0~9까지 랜덤한 값을 가져오게끔 하는 줄이에요.
            // 그럼 만약에, 1~10중 랜덤한 값이라고 하면?
            // +1을 더하면 되겠죠. int num = random.nextInt(10) +1; 이런식으로.

            System.out.print("입력: ");
                    int date = scanner.nextInt();
            //이렇게 쓰면, 계속 입력받겠죠. 34,35줄이.
            //무한대로 입력을 받습니다. 숫자를.
            if(num == date) { //랜덤한 값이랑 데이터가 일치하면,
                //탈출해라.
                break; //반복을 멈추게 합니다. break. 정답을 찿은거에요.
            }
                System.out.println("정답은 " + date + "입니다.");
             //정답이면, 라고 출력하겠죠.
                System.out.println("틀렸음. 다시 입력하시오.");
                        //틀렸으면, 이걸 출력하겠죠.

            //이런식으로 사용합니다. while은 무한루프를 걸어놓고 사용합니다.



            //int num = Math.
            //math에는 수학적 계산을 해주는 것들이 많이들어있어요. 닷 치면 됩니다
            //넘어가고 Random을 써볼게요.
        }

    }
}
