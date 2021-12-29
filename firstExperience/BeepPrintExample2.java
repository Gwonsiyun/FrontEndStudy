package javastudy.ex1229.thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스레드에서 행할 작업 생성
		Runnable beepTask = new BeepTask();
		//스레드 생성
		Thread thread = new Thread(beepTask);
		//스레드 시작
		thread.start();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
