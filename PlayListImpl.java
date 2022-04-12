package fr.ippon.jhipster.bpm.ayoub;

import java.util.Arrays;
import java.util.List;

public class PlayListImpl implements PlayListInterface{

    private static final int MAX_MUSIQUES = 10;
    String name;
    String genre;
    Music[] musiques;

    public PlayListImpl(String name, String genre, Music[] musiques) {
        this.name = name;
        this.genre = genre;
        this.musiques = musiques;
    }

    public static int getMaxMusiques() {
        return MAX_MUSIQUES;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Music[] getMusiques() {
        return musiques;
    }

    public void setMusiques(Music[] musiques) {
        this.musiques = musiques;
    }

    @Override
    public void setMaxMusique(int maxMusique) {
        this.musiques=new Music[maxMusique];
    }

    @Override
    public String affiche() {
        return toString();
    }

    @Override
    public String toString() {
        return "PlayListImpl{" +
            "name='" + name + '\'' +
            ", genre='" + genre + '\'' +
            ", musiques=" + Arrays.toString(musiques) +
            '}';
    }
}
