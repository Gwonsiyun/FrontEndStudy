package javastudy.ex1221.ex278p20;

import java.util.HashSet;
import java.util.Scanner;

public class BankApplication {

	private static final int MAX = 3;
	private static Account[] accountArray = new Account[MAX];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;
	private static HashSet<String> accountDuplicateChk = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			System.out.println(accountArray[0]);
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run=false;
			}else {
				System.out.println("올바른입력이 아닙니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성하기
	private static void createAccount() {
		if(count==MAX) {
			System.out.println("계좌를 더이상 생성할 수 없습니다.");
			return;
		}
		
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		if (accountDuplicateChk.contains(ano)) {
		   System.out.println("이미 존재하는 계좌번호입니다.");
		   return;
		}
		accountDuplicateChk.add(ano);
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano,owner,balance);
		accountArray[count++] = account;
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		
		
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(int i=0; i<count; i++) {
			
				System.out.println(String.format("계좌 : %12s, 계좌주 : %12s, 금액 : %12d", accountArray[i].getAno(), accountArray[i].getOwner(), accountArray[i].getBalance()));

		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account!=null) {
			account.setBalance(account.getBalance()+balance);
			System.out.println("결과: 예금이 성공되었습니다.");
		}else {
			System.out.println("결과: 일치하는 계좌정보가 없습니다.");
		}
		
		
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account!=null) {
			account.setBalance(account.getBalance()-balance);
			System.out.println("결과: 출금이 성공되었습니다.");
		}else {
			System.out.println("결과: 일치하는 계좌정보가 없습니다.");
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account result = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				result = accountArray[i];
				break;
			}
		}
		return result;
	}
}
