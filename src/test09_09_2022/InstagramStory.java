package test09_09_2022;

import java.util.ArrayList;

public class InstagramStory {
	private InstagramUser autorStorija;
	private String linkZaSwipeUp;
	private InstagramLocationAddOn linkDoSlike;
	private ArrayList<InstagramAddOn> dodaci = new ArrayList<InstagramAddOn>();
	private ArrayList<InstagramUser> pregledi = new ArrayList<InstagramUser>();

	public String getLinkZaSwipeUp() {
		return linkZaSwipeUp;
	}

	public void setLinkZaSwipeUp(String linkZaSwipeUp) {
		this.linkZaSwipeUp = linkZaSwipeUp;
	}

	public InstagramUser getAutorStorija() {
		return autorStorija;
	}

	public InstagramLocationAddOn getLinkDoSlike() {
		return linkDoSlike;
	}

	public InstagramStory(InstagramUser autorStorija, InstagramLocationAddOn linkDoSlike) {
		super();
		this.autorStorija = autorStorija;
		this.linkDoSlike = linkDoSlike;
	}

	public void dodavanjeAddOn(InstagramAddOn dodatak) {
		this.dodaci.add(dodatak);
	}

	public void brisanjeAddOn(int id) {
		for (int i = 0; i < dodaci.size(); i++) {
			if (this.dodaci.get(i).getId() == id) {
				this.dodaci.remove(i);
			}
		}

	}

	private boolean pregledIstogKorisnika(String username) {
		for (int i = 0; i < this.pregledi.size(); i++) {
			if (this.pregledi.get(i).getUsername().equals(username)) {
				return true;
			}
		}
		return false;

	}

	public void pogledajStori(InstagramUser user) {
		if (this.pregledIstogKorisnika(user.getUsername()) == false) {
			this.pregledi.add(user);
		}

	}
//	Primer stampe:
//		@milan	Milan Jovanovic
//		Story: 
//		Image: https://www.instagram.com/p/CecrcPyrPMj/
//		[10, 15] (70, 120) L Kej
//		[4, 1] (60, 120) @pera/https://www.instagram.com/pera/
//		[x, y] (60, 100) @mika/https://www.instagram.com/mika/
//			<<< swipe up >>>
//		            http://google.com/ 

	public void postavljanjeStoria() {
		this.autorStorija.print();
		System.out.println("Story: ");
		System.out.print("Image: ");
		System.out.println(this.autorStorija.generiseLink() + "CecrcPyrPMj/");
		this.linkDoSlike.print();
		for (int i = 0; i < dodaci.size(); i++) {
			this.dodaci.get(i).print();
		}
		if (this.linkZaSwipeUp != null) {
			System.out.println("<<<swipe up>>>");
			System.out.println(this.linkZaSwipeUp);
		}

	}

	public int brojPregleda() {
		int brojac = 0;
		for (int i = 0; i < pregledi.size(); i++) {
			brojac++;
		}
		return brojac;
	}

	public void stampajSveKorisnike() {
		System.out.println("Viewers " + this.brojPregleda());
		for (int i = 0; i < this.pregledi.size(); i++) {
			this.pregledi.get(i).print();
		}
	}

}
