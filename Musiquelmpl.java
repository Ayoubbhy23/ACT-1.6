package Streaming;

import java.util.Objects;

public class MusiqueImpl implements interfaceMusique {
	
	String titre;
	String autheur;
	String interprete;
	String genre;
	
	public MusiqueImpl(String titre, String autheur, String interprete, String genre) {
		super();
		this.titre = titre;
		this.autheur = autheur;
		this.interprete = interprete;
		this.genre = genre;
	}

	public String getTitre() {return titre;}

	public void setTitre(String titre) {this.titre = titre;}

	public String getAutheur() {return autheur;}

	public void setAutheur(String autheur) {this.autheur = autheur;}

	public String getInterprete() {return interprete;}

	public void setInterprete(String interprete) {this.interprete = interprete;}

	public String getGenre() {return genre;}

	public void setGenre(String genre) {this.genre = genre;}

	@Override
	public String toString() {
		return " titre :" + titre + ",\n autheur:" + autheur + ",\n interprete:" + interprete + "\n genre="+ genre + "";
	}
	
	@Override
	public void AfficherMusique() {
		System.out.println(" ");
		System.out.println(toString());
		
	}

	@Override
	public boolean VerifierMusique(MusiqueImpl musique1, MusiqueImpl musique2) {
		boolean ressemblance=false;
		if (musique1.getTitre().equals(musique2.getTitre()) 
			{ressemblance=true;
		 	System.out.println("la même musique");
			}
		 else 
		 { System.out.println("c'est pas la même musique");
		 } 
		return ressemblance;		  
	}	
}

	
	
		
		
	
