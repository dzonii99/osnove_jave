package miniProjekat;

import java.util.ArrayList;

public class XandOGame {
	ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;

	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
	}

	public XandOGame(Player playerX, Player playerO) {
		this();
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void print() {
		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(table.get(i + j) + " | ");
			}
			System.out.println();
			i = i + 2;
		}
	}

	public void startGame() {
		for (int i = 0; i < 9; i++) {
			table.set(i, " ");
		}
		this.nextPlayer = "x";
	}

	public boolean isGameOver() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				return false;
			}
		}
		return true;
	}

	public boolean isFieldFree(ArrayList<String> table, int pozicija) {
		for (int i = 0; i < this.table.size(); i++) {
			if (!table.get(pozicija).equals("x") && !table.get(pozicija).equals("o")) {
				return true;
			}
		}
		return false;
	}

	public void playNext() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else if (this.nextPlayer.equals("o")) {
			this.nextPlayer = "x";
		}
	}

	public void makeAMove(int pozicija) {
		if (isFieldFree(table, pozicija)) {
			table.set(pozicija, nextPlayer);
		}
	}

	public boolean isWinnerX() {
//		if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")
//				|| this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")
//				|| this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")
//				|| this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")
//				|| this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")
//				|| this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")
//				|| this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")
//				|| this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
		int brUzastopnih = 0;
		int pobedio = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++)

			{
				if (table.get(i + j) == "x")
					brUzastopnih++;

			}
			if (brUzastopnih == 3) {
				brUzastopnih = 0;
				pobedio = 1;
				i = i + 2;

			} else {
				brUzastopnih = 0;
				i = i + 2;
			}

		}
		for (int i = 0; i < 9; i = i + 4)

		{
			if (table.get(i) == "x")
				brUzastopnih++;
		}

		if (brUzastopnih == 3) {
			brUzastopnih = 0;
			pobedio = 1;

		} else {
			brUzastopnih = 0;

		}

		for (int i = 2; i < 7; i += 2) {

			if (table.get(i) == "x")
				brUzastopnih++;

		}
		if (brUzastopnih == 3) {
			brUzastopnih = 0;
			pobedio = 1;
		} else

			brUzastopnih = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j = j + 3)

			{
				if (table.get(i + j) == "x")
					brUzastopnih++;

			}
			if (brUzastopnih == 3) {
				brUzastopnih = 0;
				pobedio = 1;

			} else

				brUzastopnih = 0;

		}

		if (pobedio == 1)
			return true;
		else
			return false;
	}

	public boolean isWinnerO() {
//		if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")
//				|| this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")
//				|| this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")
//				|| this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")
//				|| this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")
//				|| this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")
//				|| this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")
//				|| this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
		int brUzastopnih = 0;
		int pobedio = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++)

			{
				if (table.get(i + j) == "o")
					brUzastopnih++;

			}
			if (brUzastopnih == 3) {
				brUzastopnih = 0;
				pobedio = 1;
				i = i + 2;

			} else {
				brUzastopnih = 0;
				i = i + 2;
			}

		}
		for (int i = 0; i < 9; i = i + 4)

		{
			if (table.get(i) == "o")
				brUzastopnih++;
		}

		if (brUzastopnih == 3) {
			brUzastopnih = 0;
			pobedio = 1;

		} else {
			brUzastopnih = 0;

		}

		for (int i = 2; i < 7; i += 2) {

			if (table.get(i) == "o")
				brUzastopnih++;

		}
		if (brUzastopnih == 3) {
			brUzastopnih = 0;
			pobedio = 1;
		} else

			brUzastopnih = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j = j + 3)

			{
				if (table.get(i + j) == "o")
					brUzastopnih++;

			}
			if (brUzastopnih == 3) {
				brUzastopnih = 0;
				pobedio = 1;

			} else

				brUzastopnih = 0;

		}

		if (pobedio == 1)
			return true;
		else
			return false;
	}

	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 && pozicija <= 8) {
			return true;
		}
		return false;
	}

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		}
		if (this.isWinnerO() == true) {
			return 2;
		}
		return 0;
	}

}
