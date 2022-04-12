package Streaming;

import java.util.ArrayList;

public class PlayListeUI {

	public static void main(String[] args) {

		MusiqueImpl m1=new MusiqueImpl("Hello", "Adele","NA", "Pop");
		MusiqueImpl m2=new MusiqueImpl("Humble", "KL", "RAS", "Hip Hop");

		m1.AfficherMusique();
		m2.AfficherMusique();

		m1.VerifierMusique(m1, m2);

		ArrayList<MusiqueImpl> Liste = new ArrayList<>() ;

		PlayListImpl pl1=new PlayListImpl("Akon", "Hits", 3, Liste);

		pl1.AjouterMusique(m1);
		pl1.AjouterMusique(m2);
		pl1.AfficherPlaylist();

	}

}