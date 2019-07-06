package test;

import java.util.Random;
import java.util.Scanner;

public class Test {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int swt = menu();
		int mine = 5000, goal = 100000, mysai, sai;
		do {
			System.out.println(" mine: " + mine + " , goal: " + goal + "¥n" + "to goal: " + (goal-mine));
			switch(swt) {
			case 1:
				System.out.println(" how much do you bet?");
				int bet = bet(mine);
				mine -= bet;
				System.out.println(" what number do you think to come?");
				do {
					try {
						mysai = Integer.parseInt(sc.nextLine());
					} catch(Exception e) {
						mysai = -1;
						System.out.println(e.getMessage());
					}
				} while(mysai < 0 || mysai > 6);
				sai = sai();
				System.out.println(" sai = " + sai + " yours = " + mysai);
				if(sai == mysai) {
					mine += 2.5 * bet;
					System.out.println(" YOU WIN");
				} else {
					System.out.println(" YOU LOSE");
				}
				break;

			case 2:
				System.out.println(" test sai¥n      OK? if ok -> Enter Y  or N");
				String flg = sc.nextLine();
				if(flg.equals("Y")) {
					sai = sai();
					System.out.println(" sai = " + sai + "¥n     end");
				} else if(flg.equals("N")) {
					System.out.println(" end");
				} else {
					System.out.println(" fuckoff");
				}
				break;

			case 3:
				System.out.println(" hou much do you want?");
				int x;
				try {
					x = Integer.parseInt(sc.nextLine());
					System.out.println("     fuck off bro");
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 0:
				System.out.println("      finish you lose ");
				break;
			}
		}while (true);
	}

	public static int menu() {
		int i=0;
		do {
			try {
				System.out.println(" 1:bet, 2:sai, 3:earn");
				i = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				i = -1;
				System.out.println(e.getMessage());
			}
		} while (i < 1 || i > 3);
		return i;
	}
	public static int bet(int mine) {
		int bet=0;
		do {
			try {
				bet = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				bet = -1;
				System.out.println(e.getMessage());
			}
		} while (bet > mine || bet <0);
		return bet;
	}

	public static int sai() {
		Random rnd = new Random();
		int sai = rnd.nextInt(5) + 1;
		return sai;
	}
}
