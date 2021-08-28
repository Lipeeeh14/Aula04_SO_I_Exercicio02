package view;

import controller.ThreadImprimeNum;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			ThreadImprimeNum tNum = new ThreadImprimeNum();
			tNum.start();
		}
	}

}
