import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StudentManagement sm = new StudentManagement();
		
		System.out.println("=================== 학생 관리 시스템 ====================");

		while (true) {
			Student student = new Student();
			System.out.println("1) 입력   2) 조회   3) 수정   4) 삭제   5) 전체조회   0) 종료 : ");
			int select = scan.nextInt();
			
			if (select == 0) {
				System.out.println("====================================================");
				System.out.println("시스템이 종료 되었습니다.");
				break;
			} else if (select == 1) {
				sm.input(student);
			} else if (select == 2) {
				sm.select();
			} else if (select == 3) {
				sm.update();
			} else if (select == 4) {
				sm.delete();
			} else if (select == 5) {
				sm.selectAll();
			} else {
				System.out.println("없는 메뉴얼입니다. 다시 입력해주세요.");
			}
			
		}
	}
}
