package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private int kor, eng, math;
	private String name;
	private double tot, avg;

	Scanner scanner = new Scanner(System.in);

	public SungJukImpl() {
		System.out.print("이름을 입력해주세요 : ");
		this.name = scanner.next();

		System.out.print("국어 점수를 입력해주세요 : ");
		this.kor = scanner.nextInt();

		System.out.print("영어 점수를 입력해주세요 : ");
		this.eng = scanner.nextInt();

		System.out.print("수학 점수를 입력해주세요 : ");
		this.math = scanner.nextInt();

	}

	@Override
	public void calc() {
		this.tot = kor + eng + math;
		this.avg = tot / 3;
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.3f", avg));
	}
}
