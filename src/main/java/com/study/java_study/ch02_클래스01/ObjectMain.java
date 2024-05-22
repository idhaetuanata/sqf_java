package com.study.java_study.ch02_클래스01;

// 코드실행 단축키 : ctrl + shift + f10
// **코드 한줄 삭제 : ctrl+y
// **코드 한줄 복사 : ctrl+d
// **코드 이동 Alt+ Shift + 방향키****

import java.sql.SQLOutput;

public class ObjectMain {
        //psvm 잊지말고
    public static void main(String[] args) {
        //어제 일반자료형을 배웠어요.
        int a = 10;


        //매우 중요한 내용입니다. 이걸 알아야 클래스를 이해할수 있어요.

        //int는 4byte죠. 숫자를 담을수있는 저장공간.

        //우리눈엔 10이 문자죠. 근데 10이라는 표기법이 , 메모리상에 이미 정의가 되어있다(리터럴 상수)

                                                                            //cf 리터럴 상수 : 리터럴 상수(literal constant)는 프로그래밍에서 값을 직접 코드에 명시하는 것으로, 변수에 저장되지 않고 코드에 직접 사용되는 값을 의미합니다. 리터럴 상수는 프로그램 실행 중에 변경되지 않는 고정된 값을 나타내며, 다양한 데이터 타입으로 표현될 수 있습니다.
        //
        // 리터럴 상수의 종류
        //정수 리터럴 : int a = 10;
        //실수 리터럴 : float나 double 타입으로 사용됩니다.
        //문자 리터럴:
        //예: 'A', 'b', '1'
        //단일 문자를 나타내며, 작은 따옴표('')로 감싸서 표현합니다.
        //문자열 리터럴:
        //예: "Hello", "World", "123"
        //문자열을 나타내며, 큰 따옴표("")로 감싸서 표현합니다.
        //String greeting = "Hello";
        //불리언 리터럴:
        //예: true, false
        //참 또는 거짓을 나타내는 논리값을 표현합니다.
        //boolean isTrue = true;
        //리터럴 상수의 특징
        //변경 불가: 리터럴 상수는 프로그램 실행 중에 값을 변경할 수 없습니다.
        //직접 사용: 변수에 저장되지 않고 코드 내에서 직접 사용됩니다.
        //명확성: 코드의 가독성을 높이고, 특정 값을 명확하게 표현하는 데 도움을 줍니다.



        //int num;
        //String name; 스트링은 문자열을 지정할때.

        // 정수형 변수 선언이 하나잇고,
        // 문자열을 담을수있는 변수를 하나 만듭니다.

        //변수는 무조건 소문자로 시작합니다.
        //대문자로 시작하는것과 소문자로 시작하는건 다른겁니다.

        //ObjectA objectA;

        //ObjectA는 int하나와 String하나로 구성되있습니다. 근데 이런게 있을까요? 없어요.
        //방금전에 당신이 만든거지요. 이 묶음으로.
        //그렇기 때문에, 데이터를 값을 넣어야 합니다.

        ObjectA objectA1 = new ObjectA();  //100번
        ObjectA objectA2 = new ObjectA();  //200번

        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);









    }
}
