package com.study.java_study.ch01_변수와_자료형;

// 코드실행 단축키 : ctrl shift f10
// **코드 한줄 삭제 : ctrl+y
// **코드 한줄 복사 : ctrl+d

// https://docs.google.com/spreadsheets/d/1yZrgSC9hEjDGgUWfH47LTpG9EWTrcWzMiGVgb2Z3NIE/edit#gid=1514832843

public class Operation01 {
    public static void main(String[] args) {
        //psvm으로 가볍게
        //2405210339

        //산술연산자
        //사칙연산 알면 다 함
        //거기에 나머지 값 구하는 방법들이 있는디
        //예를들어

        int num1 = 10+ 20;
        int num2 = 9/2;
        System.out.println(num2);

        //실행코드 뭐더라? 컨+f10+쉬프트

       //연산자를 하나 더. %라는 연산자가 있음.
        //예를들어 int num3 = 9%2;같은걸 한번 쳐보면

        int num3 = 9%2;
        System.out.println(num3
        );

        //x에다가 % 2를 하게되면?
        //int num4 = ?%2;라고 보면, 2의 배수인지 확인

        int num4 = 10 % 2;
        System.out.println(num3);

        //킵고잉

        //int num4 = 5 % 2 == 0 ;

        //수학에선 이꼴이 등호지만, PG에는 대입으로 씀.
        //이꼴은 코딩에선 ==라고 씀

        //5 % 2가 0이니?라고 묻는거임. 그럼 false라고 나오겟지
        //이 연산의 결과는 어떤 자료형에 담느냐? 물어보면, boolean을 써야댐.

        boolean num5 = 5 % 2 == 0;
        System.out.println(num5);

        //2405211607 한턴쉬고

        //연산자에 대해서 다시 봅시다. 산술연산자는 +,-,*,
        //먼저 sout에서 슬래시좀 넣어주고, 따옴표 잊지말고
        System.out.println("/////////");


        //증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i); //실행값 1이나옴.

        //i에다가, 기존의 i에 +1한것과 같다. 코드로는 i=i+1;

        i = i + 1;
        System.out.println(i); //실행값 2가 나옴.

        //연산을 해석할때, 뒤부터 해석합니다. 앞부터 해석하면 1이 되버리겟져 i가

        ++i;
        System.out.println(1);
        System.out.println(++i); //결과를 예상해보면 몇일까여? 4져
        System.out.println(i++); //결과예상시? 4나와야함.

        //앞에 붙이던, 뒤에 붙이던, 증가된 값이 나옴. 근데 결과가 다르게 나옴. 다음번에 i를 또 sout1하면

        System.out.println(i); //멀까용
        //5가 나옴

        //왜 5가나오느냐? 첫줄이 3이고. 4되고. 5가되야 되는데 4가나옴.
        //reason : ++가, sout++i라고 생각하면 댐.
        //현재, ++가 뒤에 붙으면, 지금은 증가시키지 마십시오. 하는거
        //지금은 그냥 쓰고, 그 담에 증가시켜라, 라는 뜻임. 그래서 1이 더해지는거임

        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        //설명생략.

        //논리연산자.
        //true or false로 연산하는것임. true에 엔드 두개를 주고, 트루를 잡아봄.



        System.out.println(true && true); // output : true
        //true는 1이다. false는 0이다. 라고 생각해보자.
        // && = and(곱) ,
        // || = or(합)을 이야기함. (||은 백스페이스 밑에있는 키 (역슬래시)에 시프트 친거임
        // ! = not(부정)


        System.out.println(true && true); //output : true
        System.out.println(true && false); //output : false
        System.out.println(true || true); //op : true
        System.out.println(false|| false); //op : false

        //or연산을 썼을때 나오는 경우의 수는 둘 다 false여야지만 , 1+0 = 1이듯이 true or true 는 true가 나오겟지

        //이제 and와 or이란 연산을 쓸수있을거임


        //관계연산과 관계연산의 종류 2405211626
        System.out.println(3>2&& 1 == 1);
        //이 조건과 이 조건이 둘다 참일때, 결과값이 true가 나옴.


        //초과 미만 이상 이하 다 있고, 2 가지만 이해하고 잇음 댐. 그중 하나 이미 했음

        //비교연산 했자늠. 유남쌩

        //! = not(부정). 위에도 추가할거임.

        System.out.println(!true && true);
        //결과값이 머나올건지, 항상 예상하고 할것. 결과 fasle 나올거임.
        //연산자는 연산의 우선순위가 중요함.
        //완벽히 이해했다면, 다음의 코드와 결과값이 같은것을 예상
        System.out.println(!(true&&true));

        //false 나옴.

        System.out.println(3>2&&1 ==1); //true 예상
        System.out.println(1 !=1); //exp true 예상

        //이제는...




        //조건연산자

        //연산에는 1+1=2라고 하면, 결과가 머야. 2라는 결과가 나올건데. 1+1의 연산 실행시 결과가 존재함.
        //ture and true 하면 true라는 결과가 잇음.
        //다음의 코드 참조

        System.out.println(3>2 ? "참" : "거짓");

        //참 거짓이라고 하지말고 어떤 숫자를 넣어보면

        System.out.println(3>2? 10 : 20);
        //10 나오겟지?
        //ㅇㅋ

        //그러면;
        int x = 10;
        int y = 2;

        //다음줄은 int말고 string을 해보면..

        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
                //exp true.
        String result2 = "" + 10 / 2;
        //10

        //조건만드는게 핵심


        //복합대입연산자 , 산술연산
        int number = 10;
        number += 5;
        number -= 1; // 자신에게 1을 뺴서 대입하세요.
        number *= 2; //2곱해서 대입하고...머 등등.
        number /=2; //생략
        number %= 2; //2나누고 나머지값 대입하시오.



        //2405221212, 자바수업 2일차
        //반복문 먼저 했었는데, 이제는.. 클래스에 대해서에 대해 먼저 설명합니다.
        //기억하십시오. 클래스는 자료형입니다.

        //어제 일반자료형/참조자료형에 대해서 이야기했습니다.

        //뤼튼
        //GPT-4
        //
        //프로그래밍 언어에서 자료형은 크게 일반자료형(primitive type)과 참조자료형(reference type)으로 나뉩니다.
        //이 둘의 차이점은 메모리 관리와 데이터 처리 방식에서 주로 나타납니다.


        //일반자료형(Primitive Type)
        //
        //일반자료형은 가장 기본적인 데이터 유형으로, 언어에 따라 미리 정의된 자료형입니다.
        //일반적으로 크기가 고정되어 있으며, 메모리에 직접 값을 저장합니다.
        //예로는 정수형(int), 실수형(float), 문자형(char), 부울형(boolean) 등이 있습니다.

        //메모리 관리

        //일반자료형 변수는 스택 메모리에 저장됩니다.
        //변수에 직접 값을 저장하므로, 값 자체가 변수에 할당됩니다.
        //예를 들어, int a = 5; 라고 하면, 변수 a는 메모리 주소에 5라는 값을 직접 저장합니다.

        //성능

        //메모리 접근과 처리 속도가 빠릅니다.
        //값이 고정적이고 간단하므로 연산 성능이 좋습니다.

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //참조자료형(Reference Type)


        //특징
        //
        //참조자료형은 객체를 참조하는 변수 타입입니다.
        //메모리에 객체의 실제 데이터가 저장되는 것이 아니라, 객체가 저장된 메모리 주소를 참조합니다.
        //예로는 배열(array), 클래스(class), 인터페이스(interface), 컬렉션(collection) 등이 있습니다.
        //메모리 관리
        //
        //참조자료형 변수는 힙 메모리에 객체를 저장하고, 스택 메모리에는 그 객체의 메모리 주소를 저장합니다.
        //예를 들어, String s = "Hello"; 라고 하면, 문자열 객체 "Hello"는 힙 메모리에 저장되고, 변수 s는 그 객체의 주소를 참조합니다.
        //성능
        //
        //메모리 접근이 상대적으로 느립니다.
        //객체가 복잡하고 크기가 가변적이므로 메모리 관리가 중요합니다.
        //참조를 통해 접근하므로, 추가적인 메모리 간접 참조가 필요합니다.

        //예시를 통한 비교
        //일반자료형 예시 (Java)
        //java
        //
        //
        //int a = 10;
        //int b = a;
        //b = 20;
        //
        //System.out.println(a); // 출력: 10
        //System.out.println(b); // 출력: 20
        //b에 a를 복사했을 때 값이 복사됩니다. b의 변경은 a에 영향을 미치지 않습니다.
        //참조자료형 예시 (Java)
        //java
        //
        //
        //int[] array1 = {1, 2, 3};
        //int[] array2 = array1;
        //array2[0] = 10;
        //
        //System.out.println(array1[0]); // 출력: 10
        //System.out.println(array2[0]); // 출력: 10
        //array2는 array1의 참조를 복사합니다. array2의 변경은 array1에 영향을 미칩니다.
        //요약
        //일반자료형: 값 자체를 저장하며, 메모리 접근이 빠르고 값 복사가 일어납니다.
        //참조자료형: 객체의 주소를 저장하며, 메모리 접근이 느리고 참조를 통해 간접적으로 객체에 접근합니다.
        //이러한 차이점을 이해하면 메모리 관리와 성능 최적화에 도움이 됩니다.



























    }

}
