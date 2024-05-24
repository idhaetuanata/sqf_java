package com.study.java_study.ch05_입력;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 입력02 {

    public static void main(String[] args) { //변수선언, 기본값 초기화
        String name = null;        //next()
        int age = 0;               //nextInt()
        String address =  null;       //nextLine()
        String gender =   null;        //next()
        String phone =    null;         //nextLine()

        /*
        이름: 김준일
        나이: 31
        주소: 부산 동래구 중앙대로
        성별: 남
        연락처: 010-9988-1916
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        name = scanner.next(); //스캐너가 필요함. 그래서 24번에 스캐너를 정의해준다.
        System.out.print("나이: ");
        age = scanner.nextInt(); //스캐너에서 nextInt(숫자/정수)이므로 Int를 붙인다.
        scanner.nextLine();
        System.out.print("주소: "); //버퍼를 비운다. 것은 ln을 실행시켜준다.
        address = scanner.nextLine(); //
        System.out.print("성별: ");
        gender = scanner.next();
        scanner.nextLine();
        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println();

        //ln을 제외한 나머지는, 스페이스와 엔터를 무시한다.
        //무시된 이후 마지막 엔터는, 버퍼에 남아있음.
        //
        System.out.println("이름: "   + name);
        System.out.println("나이: "   + age);
        System.out.println("주소: "   + address);
        System.out.println("성별: "   + gender);
        System.out.println("연락처: " + phone );

        //system.out.printf에서는, 자동으로 줄을 바꾸지 않음. 줄을 바꾸려면 /을 포함해야함.

        //print(줄바꿈 없음), println(줄바꿈o), printf(형식화된 출력.)

    }
}

//while문은,
//while01을 만드세요.클래스. 04에 만들면 됩니다.