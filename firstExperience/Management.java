package javastudy.ex1224.ex;

import java.util.Scanner;

public class Management {

	private static Array[] members = new Array[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int caount = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.회원등록 | 2.회원조회 | 3.회원탈퇴 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			String num = scanner.next();
			if(num.equals("1")) {
				System.out.println("회원을 등록하시겠습니까? 예:y,아니오:n");
				System.out.print("입력> ");
				String s = scanner.next();
				if(s.equals("y")) {
					System.out.print("이름> ");
					String name = scanner.next();
					System.out.print("주소> ");
					String addr = scanner.next();
					System.out.print("연락처> ");
					String phonNumber = scanner.next();
					String number = String.format("%03d", caount); 
					caount++;
					Array a = new Array(number,name,addr,phonNumber);
					for(int i=0; i<members.length; i++) {
						if(members[i]==null) {
							members[i]=a;
							System.out.println("회원등록이 완료 되었습니다. 회원번호 "+number+"입니다.");
							break;
						}else if(i==members.length-1) {
							System.out.println("등록할 수 있는 수가 가득 찼습니다.");
							break;
						}
					}
				}else if(s.equals("n")) {
					System.out.print("아니오를 선택하였습니다.");
				}else {
					System.out.print("잘못된 입력입니다.");
				}
			}else if(num.equals("2")) {
				System.out.println("회원조회 하시겠습니까? 예:y,아니오:n");
				System.out.print("입력> ");
				String s = scanner.next();
				if(s.equals("y")) {
					System.out.println("회원번호 또는 회원명으로 조회가 가능하십니다. 회원번호:1,회원명:2");
					System.out.print("입력> ");
					String or = scanner.next();
					if(or.equals("1")) {
						System.out.println("회원번호를 입력하여 주세요.");
						System.out.print("입력> ");
						String number = scanner.next();
						for(int i=0; i<members.length; i++) {
							if(members[i]!=null && members[i].getNumber().equals(number)) {
								System.out.println("회원번호: "+members[i].getNumber());
								System.out.println("회원명: "+members[i].getName());
								System.out.println("회원주소: "+members[i].getAddr());
								System.out.println("회원연락처: "+members[i].getPhonNumber());
								break;
							}else if(i==members.length-1) {
								System.out.print("일치하는 회원이 없습니다.");
								break;
							}
						}
					}else if(or.equals("2")) {
						System.out.println("회원명을 입력하여 주세요.");
						System.out.print("입력> ");
						String name = scanner.next();
						for(int i=0; i<members.length; i++) {
							if(members[i]!=null && members[i].getName().equals(name)) {
								for(i=i; i<members.length; i++) {
									if(members[i]!=null && members[i].getName().equals(name)) {
										System.out.println("회원번호: "+members[i].getNumber());
										System.out.println("회원명: "+members[i].getName());
										System.out.println("회원주소: "+members[i].getAddr());
										System.out.println("회원연락처: "+members[i].getPhonNumber());
										System.out.println("------------------");
									}
								}
								break;
							}else if(i==members.length-1) {
								System.out.println("일치하는 회원이 없습니다.");
								break;
							}
						}
					}else {
						System.out.println("잘못된 입력입니다.");
					}
				}else if(s.equals("n")) {
					System.out.println("아니오를 선택하였습니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if(num.equals("3")) {
				System.out.println("회원탈퇴 하시겠습니까? 예:y,아니오:n");
				System.out.print("입력> ");
				String s = scanner.next();
				if(s.equals("y")) {
					System.out.println("회원번호를 입력하세요");
					System.out.print("입력> ");
					String number = scanner.next();
					for(int i=0; i<members.length; i++) {
						if(members[i].getNumber().equals(number)) {
							System.out.println(members[i].getName()+" 회원님이 탈퇴되었습니다.");
							members[i]=null;
							break;
						}else if(i==members.length-1) {
							System.out.print("일치하는 회원이 없습니다.");
						}
					}
				}else if(s.equals("n")) {
					System.out.println("아니오를 선택하였습니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if(num.equals("4")) {
				run=false;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}
