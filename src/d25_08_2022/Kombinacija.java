package d25_08_2022;

import java.util.ArrayList;

public class Kombinacija {
	private String id;
	ArrayList<Integer> nizBrojeva = new ArrayList<Integer>(7);

	public Kombinacija(String id, int jedan, int dva, int tri, int cetri, int pet, int sest, int sedam) {
		this.id = id;
		this.nizBrojeva.add(jedan);
		this.nizBrojeva.add(dva);
		this.nizBrojeva.add(tri);
		this.nizBrojeva.add(cetri);
		this.nizBrojeva.add(pet);
		this.nizBrojeva.add(sest);
		this.nizBrojeva.add(sedam);
	}

	public String getId() {
		return id;
	}

	public int getJedan() {
		return this.nizBrojeva.get(0);
	}

	public int getDva() {
		return this.nizBrojeva.get(1);
	}

	public int getTri() {
		return this.nizBrojeva.get(2);
	}

	public int getCetri() {
		return this.nizBrojeva.get(3);
	}

	public int getPet() {
		return this.nizBrojeva.get(4);
	}

	public int getSest() {
		return this.nizBrojeva.get(5);
	}

	public int getSedam() {
		return this.nizBrojeva.get(6);
	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		for (int i = 0; i < nizBrojeva.size(); i++) {
			if (this.nizBrojeva.get(i) != k.nizBrojeva.get(i)) {
				return false;
			}
		}
		return true;

	}

	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("Brojevi: ");
		for (int i = 0; i < nizBrojeva.size(); i++) {
			System.out.print(nizBrojeva.get(i) + ", ");
		}
	}

}
