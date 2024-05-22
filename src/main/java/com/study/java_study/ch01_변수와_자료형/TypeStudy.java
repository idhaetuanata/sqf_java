package com.study.java_study.ch01_변수와_자료형;

// 코드실행 단축키 : ctrl shift f10
// **코드 한줄 삭제 : ctrl+y
// **코드 한줄 복사 : ctrl+d

// https://docs.google.com/spreadsheets/d/1yZrgSC9hEjDGgUWfH47LTpG9EWTrcWzMiGVgb2Z3NIE/edit#gid=1514832843

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TypeStudy {
    public static void main(String[] args) {
        // [ 일반 자료형]
        // 1. 논리
        boolean a = false;
        boolean b = true;

        //boolean라는 것은 참/또는 거짓이라는 논리형 타입을
        //넣을때 사용함. 1바이트 크기를 갖고있음.
        //결과로 true or false라는 논리값을 반환함.


        // 2. 숫자(정수)
        int c = 1000;
        long d= 1000000000l;

        //long은 뒤에 반드시 l을 붙여야함. 이유는 알필요없음

        // 3. 숫자(실수)
        double ㄷ = 3.14;

        // 4. 문자
        char f = '가' ; // AC00라는 값임.
        //작은 따옴표를 사용함. 두 자 부타는 큰따움표로 묶는데,
        //문자에요? 아니에요? ㅋㅋ 아니에여. 여기부터는 문자열이라고 함.
        //유니코드라 그랫자나. 캐릭터는 2byte밖에 못 담음

        // 5.문자열
        String g = "가나";
        //머가 다르냐? 대문자로 시작함. 캐릭터라고 하는 자료형은 2byte짜리 하나임.
        //string은 파고들어가면 바이트단위로 쪼개져있음. 캐릭터를 바이트 단위로 쪼개놨음. 그래서, 문자열이락 ㅗ하는 걸로 쭊 배열이라고 만들어져잇음 딥하게 드가면 어려움
        //두 개 의 글자 이상을 조합해서 저장하려 하면 스트링이란 걸 써야되구나 그정도면 댐 글고 " "로 묶고


    //한턴쉬고 24052210306



    //sout라고 치면 자동완성됨. 그리고 f를 넣으면 위와같이 됨.


        System.out.println((char)((int)f+1));

        //형변환은 문자->정수->실수의 순서대로 변환함.
        //문자는 정수에 포함이 됨. ASCI 참조.

        double num = 3.14;
        System.out.println(num); //이거 일일이 치지말고, sout라고 치면 자동완성
        //num은 쳐줘야댐.

        int num2 = (int)num;

        //인트는 정수임. 정수를 담을수있는 통에 실수를 담으면
        //빨간줄 뜨는 이유가 그거임. int num2 = num;에 빨간줄이 쳐져있는 이유.
        //정수값만 담을수 있는데, 실수 담으면, 소숫점 버리는 유도리가 컴퓨터는 없음 , 그래서 에러뜸
        //명시적 형변환

        System.out.println(num2);
        double num3 = num2;
        System.out.println(num3);

        //반대로 다이어그램에서 하위그룹에 있는 경우는 유도리 발휘가능. 데이터손실 없음. (명시하지 않아도 됨. 무시적 형변환)

        //일반자료형과 참조자료형에서는 좀 다름. 객체지향을 배우면 상속관계를 배울것임.
        //상속관계 속에서도 업캐스팅,다운캐스팅이 있는데, 이게 매우 중요함. 나중에




        //이제, 데이터를 변수에 넣을때 어떤 일이 일어나는지 보자.

























































































    }
}

// 코드실행 단축키 : ctrl shift f10
// **코드 한줄 삭제 : ctrl+y
// **코드 한줄 복사 : ctrl+d

    // https://docs.google.com/spreadsheets/d/1yZrgSC9hEjDGgUWfH47LTpG9EWTrcWzMiGVgb2Z3NIE/edit#gid=1514832843



