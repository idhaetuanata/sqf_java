import java.util.ArrayList;
import java.util.Scanner;

public class ArrayService {
    private static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("殺生簿(Death Note):");
            System.out.println("1. 殺死");
            System.out.println("2. 死因");
            System.out.println("3. 拯救");
            System.out.println("4. 死亡人數列表");
            System.out.println("5. 死亡者全部查詢");
            System.out.println("q. 關閉便箋");
            System.out.print("想殺的人的名字 Warning:此程序要實際運行，必須識別人臉。: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    addName(scanner);
                    break;
                case "2":
                    editName(scanner);
                    break;
                case "3":
                    deleteName(scanner);
                    break;
                case "4":
                    findName(scanner);
                    break;
                case "5":
                    listNames();
                    break;
                case "q":
                    System.out.println("蓋上筆記本");
                    scanner.close();
                    return;
                default:
                    System.out.println("不存在這樣的名字。 請重寫.");
            }
        }
    }

    private static void addName(Scanner scanner) {
        System.out.print("請輸入要登記的名字。: ");
        String name = scanner.nextLine();
        names.add(name);
        System.out.println(name + "那個名字已經登記了。 他馬上就要死了。");
    }

    private static void editName(Scanner scanner) {
        System.out.print("輸入要修改的名字，也不會恢復。 祈求冥福。: ");
        String oldName = scanner.nextLine();
        if (names.contains(oldName)) {
            System.out.print("請輸入新名稱。 死人不會復活。: ");
            String newName = scanner.nextLine();
            names.set(names.indexOf(oldName), newName);
            System.out.println(oldName + "이(가) " + newName + "雖然被修改了，但並不是真的復活了。");
        } else {
            System.out.println(oldName + "他不在目錄裏.");
        }
    }

    private static void deleteName(Scanner scanner) {
        System.out.print("삭제할 이름을 입력하세요: ");
        String name = scanner.nextLine();
        if (names.remove(name)) {
            System.out.println(name + "이(가) 삭제되었습니다.");
        } else {
            System.out.println(name + "이(가) 목록에 없습니다.");
        }
    }

    private static void findName(Scanner scanner) {
        System.out.print("찾을 이름을 입력하세요: ");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println(name + "이(가) 목록에 있습니다.");
        } else {
            System.out.println(name + "이(가) 목록에 없습니다.");
        }
    }

    private static void listNames() {
        if (names.isEmpty()) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            System.out.println("전체 등록된 이름:");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
