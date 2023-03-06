import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {

	Scanner scan;
	HashMap<Integer, Student> stu;
	int number = 1;
	boolean check;

	StudentManagement() {
		scan = new Scanner(System.in);
		stu = new HashMap<Integer, Student>();
	}

	/* student and score input */
	public void input(Student s) {
		System.out.println("이름을 입력해주세요 : ");
		String name = scan.next();

		s.setName(name);

		System.out.println(name + "님의 국어 점수를 입력 해주세요 : ");
		int kor = scan.nextInt();
		s.setKor(kor);

		System.out.println(name + "님의 수학 점수를 입력 해주세요 : ");
		int math = scan.nextInt();
		s.setMath(math);

		System.out.println(name + "님의 영어 점수를 입력 해주세요 : ");
		int eng = scan.nextInt();
		s.setEng(eng);

		s.setSum(kor, math, eng);

		stu.put(number, s);
		number += 1;

		System.out.println(name + "님의 정보가 입력 되었습니다.");

	}

	/* student select */
	public void select() {
		System.out.println("누구의 정보를 검색하시겠습니까 ? : ");
		String name = scan.next();
		Set<Integer> keySet = stu.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			if (name.equals(stu.get(key).getName())) {
				System.out.println("번호 [" + key + "]");
				System.out.println("이름 : " + stu.get(key).getName());
				System.out.print("국어 : " + stu.get(key).getKor() + ", ");
				System.out.print("수학 : " + stu.get(key).getMath() + ", ");
				System.out.println("영어 : " + stu.get(key).getEng());
				System.out.print("총점 : " + stu.get(key).getSum() + ", ");
				System.out.println("평균 : " + stu.get(key).getAvg());
				System.out.println(" ");
				check = true;
				break;
			}
			check = false;
		}
		if (check == false) {
			System.out.println(name + "님의 정보가 존재하지않습니다.");
		}
	}

	/* student update */
	public void update() {
		System.out.println("누구의 정보를 수정하시겠습니까 ? : ");
		String name = scan.next();

		Set<Integer> keySet = stu.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			if (name.equals(stu.get(key).getName())) {
				System.out.println(name + "님의 바뀐 국어 성적을 입력해주세요 : ");
				int kor = scan.nextInt();
				stu.get(key).setKor(kor);

				System.out.println(name + "님의 바뀐 수학 성적을 입력해주세요 : ");
				int math = scan.nextInt();
				stu.get(key).setMath(math);

				System.out.println(name + "님의 바뀐 영어 성적을 입력해주세요 : ");
				int eng = scan.nextInt();
				stu.get(key).setEng(eng);

				stu.get(key).setSum(kor, math, eng);
				check = true;
				break;
			}
			check = false;
		}
		if (check == false) {
			System.out.println(name + "님의 정보가 존재하지않습니다.");
		}
	}

	/* student delete */
	public void delete() {
		System.out.println("누구의 정보를 삭제 하시겠습니까 ? : ");
		String name = scan.next();

		Set<Integer> keySet = stu.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			if (name.equals(stu.get(key).getName())) {
				stu.remove(key);
				System.out.println(name + "님의 정보를 삭제 하였습니다.");
				check = true;
				break;
			}
			check = false;
		}
		if (check == false) {
			System.out.println(name + "님의 정보가 존재하지않습니다.");
		}
	}

	/* All student */
	public void selectAll() {
		Set<Integer> keySet = stu.keySet();
		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			int key = iterator.next();
			System.out.println("번호 [" + key + "]");
			System.out.println("이름 : " + stu.get(key).getName());
			System.out.print("국어 : " + stu.get(key).getKor() + ", ");
			System.out.print("수학 : " + stu.get(key).getMath() + ", ");
			System.out.println("영어 : " + stu.get(key).getEng());
			System.out.print("총점 : " + stu.get(key).getSum() + ", ");
			System.out.println("평균 : " + stu.get(key).getAvg());
			System.out.println(" ");
		}
	}

}
