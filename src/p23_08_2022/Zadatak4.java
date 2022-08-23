package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//		Kreirati klasu ViberKorisnik koja ima:
//			ime i prezime
//			broj telefona
//			da li je trenutno aktivan (boolean)
//			gettere, settere, konstuktore
//
//			Kreirati klasu ViberPoruka koja ima:
//			tekst poruke
//			vreme kad je poslata poruka
//			korisnika koji je poslao poruku
//			korisnika kome je poslata poruka
//			gettere i setere i konstuktore
//			rekaciju na poruku
//			metodu prikazi koja stampa podatke o poruci u formatu:
//			From: [Ime i prezime korisnika] * Active Now ili Not Active - at 
//			[vreme kad je poslata]
//			To: [Ime i prezime korisnika kome je poslata]
//			[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//			POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//			if (this.reakcija != null)
//
//			Kreirati klasu ViberReakcija koja ima:
//			emoji (moze da bude sunglases, heart, smile, like ili sad)
//			korisnika koji je reagovao
//			U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko
//			reakcija na poruke.
		
		
//		ViberKorisnik posiljalac = new ViberKorisnik("Zoran Stojkovic", "0657784574");
//		posiljalac.setAktivnost(true);
//		ViberKorisnik primalac = new ViberKorisnik("Jelena Karleusa", "0694578432");
//		ViberReakcija smajli = new ViberReakcija(":)", primalac);
//		ViberPoruka poruka = new ViberPoruka("Pokidala si sinoc", "23.08.2022. 14:32", posiljalac, primalac, smajli);
//		poruka.print();
//		System.out.println();
//		
//		ViberKorisnik posiljalac2 = new ViberKorisnik("Jelena Karleusa", "0657784574");
//		posiljalac.setAktivnost(false);
//		ViberKorisnik primalac2 = new ViberKorisnik("Zoran Stankovic", "0694578432");
//		ViberReakcija smajli2 = new ViberReakcija("<3", primalac2);
//		ViberPoruka poruka2 = new ViberPoruka("Hvala Zoki", "23.08.2022. 20:32", posiljalac2, primalac2, smajli2);
//		poruka2.print();
		
		ArrayList<ViberPoruka> poruke = new ArrayList<ViberPoruka>();
		Scanner s = new Scanner(System.in);
		
		ViberKorisnik p1 = new ViberKorisnik("Milan Jovanovic", "0657784596");
		p1.setAktivnost(true);
		ViberKorisnik p2 = new ViberKorisnik("Nikola Milovanovic", "0691125386");
		p2.setAktivnost(true);
		
		for(int i=0; i<3; i++) {
			System.out.print("Unesite poruku: ");
			String poruka = s.next();
			s.nextLine();
			ViberPoruka messages = new ViberPoruka(poruka);
			poruke.add(messages);
		}
		for(int i=0;i<poruke.size();i++) {
			System.out.println(poruke.get(i).getText());
		}

	}

}
