package fr.ippon.jhipster.bpm.ayoub;

public class PlayListUi {

    public static void main(String[] args)
    {
        Music[] musicsList;
        Music music1 = new Music("music1", "author1", "interprete1", "Hits");
        Music music2 = new Music("music2", "author2", "interprete2", "Hits");
        Music music3 = new Music("music3", "author3", "interprete3", "Hits");
        musicsList= new Music[]{music1, music2, music3};

        PlayListInterface playList=new PlayListImpl("My Hits", "Hits",musicsList);

        playList.affiche();

    }
}
