package p25_08_2022;

import java.util.ArrayList;

public class History {
	private ArrayList<HistoryPage> stranice = new ArrayList<HistoryPage>();

	public void openPage(HistoryPage stranice) {
		this.stranice.add(stranice);
	}

	public void deleteThroughLink(HistoryPage link) {
		for (int i = 0; i < stranice.size(); i++) {
			if (this.stranice.get(i).getLink().equals(link.getLink())) {
				this.stranice.remove(i).getLink();
			}
		}
	}

	public void deleteCookies(HistoryPage link) {
		for (int i = 0; i < stranice.size(); i++) {
			if (this.stranice.get(i).getLink().equals(link.getLink())) {
				this.stranice.get(i).removeCookies();
			}
		}
	}

	public void deleteHistory() {
		for (int i = 0; i < stranice.size(); i++) {
			this.stranice.remove(i);
		}

	}

	public void sacuvajKredenciju(String naziv, HistoryPage stranice) {
		for (int i = 0; i < this.stranice.size(); i++) {
			this.stranice.get(i).save(stranice.getUsername(), stranice.getPassword());
			this.stranice.get(i).setNaziv(naziv);
		}
	}

	public void watchHistory() {
		for (int i = 0; i < this.stranice.size(); i++) {
			this.stranice.get(i).print();
		}
	}

	public void obrisiSveKolacice() {
		for (int i = 0; i < stranice.size(); i++) {
			this.stranice.remove(i).removeCookies();
		}
	}

	public void obrisiSveKolaciceZaZadnjihSatVremena(int trenutniSat, int trenutniMinut) {
		for (int i = 0; i < this.stranice.size(); i++) {
		}
	}
}