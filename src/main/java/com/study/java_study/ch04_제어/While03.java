package com.study.java_study.ch04_제어;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class While03 {

    public static void main(String[] args) { // 1. psvm부터
        //2.스캐너 입력합니다
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true
        //isrun에 트루를넣어줘요.
                ; //boolean은 true or false 둘중하나

        
        //***isRun이 false가 되면 실행종료된다는 것이 핵심***
        
        // 2번메뉴를봅시다.
        // 2번 메뉴로 들어왓을때, 회원조회로 들왓다,
        //isrunmenu를 true를 걸어요.
        //다시 그안에 또 반복 걸어요.
        //조건은, isrunmenu2가 true인상태로 계속 돌아여.
           //루프 멈출떄까지 case2가 isrun의 무한루프는 돌지않음.
        
        //selectedmenu라는 변수를 재사용해써요. 왜냐면, 어차피 다시 입력을 받게끔, 어차피
        //새로 받아야하기땜에 재사용해도 됩니다.

        //b는 back이에여. 뒤로 돌아간다는건
        //바깥에 와일이 잇는데, 안에잇는 와일이 돌고잇엇고 바깥와일은 멈춰잇엇죠

        //안쪽루프를 멈추면 다시 밖에while루프가 돈다 이거져

        //isrunmenu2만 false로 바꿔주면, 작은 while이 끝이나요. 그럼 바깥게 돌거고
        //main에서 case2에 브레이크가 걸립니다.(코드를 보세요.)

        //그럼 다시 바깥와일이 돈다.
        //바깥와일도 false로 바꾸면 꺼지겠져.
        //Q>>
        //2번메뉴에 들어왔을때, 바깥루프까지 프로그램 종료메뉴까지도 여기서 만들수 있다/없다?

        //프로그램 종료가 밖에잇자나여. 2번에서 뒤로가기 만들었는데, 여기서 프로그램 종료 만들수 잇을까요 없을까요?

        //잇죠.

        //왜? isrunmenu2만 false로 바꾸는게 아니라
        //바깥에 잇는 isrun도 같이 false로 바꾸면 둘다 시동이 꺼지져.

        //그럼 프로그램 종료가 되겟져.


        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.println(("메뉴 입력"));

            //스위치문에 입력한애가 들어갔어요. 입력한거랑 같은케이스 찾아야합니다.


            String selectedMenu = scanner.nextLine();
            switch (selectedMenu){
            case "1":
                System.out.println("회원 등록으로 들어왔어요");
                break; //while의 브레이크가 아닙니다. switch case의 브레이크.

            case "2":
                System.out.println("회원 조회로 들어왔다");
                
                boolean isRunMenu2 = true;
                while(isRunMenu2) {  //반복 돌립니다 . 한번 더 작은while을 만듭니다.

                    System.out.println("[회원 조회]");
                    System.out.println("1.회원 번호로 조회");
                    System.out.println("2. 회원 이름으로 조회");
                    System.out.println("b. 뒤로가기");
                    System.out.println("메뉴 선택: "); //메뉴 받아오기.
                    selectedMenu = scanner.nextLine();
                    switch (selectedMenu) {
                        case "1":
                            System.out.println("번호로 조회하기");
                        case "2":
                            System.out.println("이름으로 조회하기");
                        case "b":
                            System.out.println("메인 메뉴로 돌아가기");
                            //방법은.
                            isRunMenu2 = false;
                            break;
                            
                            
                        default:
                            System.out.println("잘못된 입력입니다. 다시 입력하세요");
                            
                            
                            
                    }
                    System.out.println(); //스위치가 끝나면 줄바꿈 해주고.
                    }

                    System.out.println("[회원 조회]");
                break;
                //0001회원조회 먼저 봅시다. 와일을 돌려요.

            }
            //이게 머냐면, 1번을 띄워요. 1번메뉴, 2번메뉴, 등등 할건데.
                //q를 입력하면, 나갑니다.
                //q 이외의 다른것을 입력하면, 다시 입력하라고 해요.

        }
        //줄바꿈을줍시다.
        System.out.println();
        //ㅋㅋ


        System.out.println("프로그램 종료");


        //루프 푸는법은 break를 걸거나, 변수값을 false(isrun을) 로 잡으면됩니다.
        //2중으로 걸순없어여. 브레이크 걸기전에 isrun에다가 false를 넣습니다.


    }


        }
