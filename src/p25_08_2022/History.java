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

	public void deleteCookies(String link) {
		for (int i = 0; i < stranice.size(); i++) {
			if (this.stranice.get(i).getLink().equals(link)) {
				this.stranice.get(i).removeCookies();
			}
		}
	}

	public void deleteHistory() {
		for (int i = 0; i < stranice.size(); i++) {
			this.stranice.remove(i);
		}

	}

	public void sacuvajKredenciju(String naziv, String username, String password) {
		for (int i = 0; i < this.stranice.size(); i++) {
			if (this.stranice.get(i).getNaziv().equals(naziv)) {
				this.stranice.get(i).save(username, password);
			}
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
		int trenutnoVremeUMin = trenutniSat * 60 + trenutniMinut;
		for (int i = 0; i < this.stranice.size(); i++) {
			int vremeCelo = this.stranice.get(i).getVremeSati() * 60 + this.stranice.get(i).getVremeMinuti();
			if (vremeCelo > trenutnoVremeUMin - 60) {
				this.stranice.get(i).removeCookies();
			}
		}
	}
}