package fr.ippon.jhipster.bpm.ayoub;

public class MusicImpl implements MusicInterface{
    @Override
    public boolean verifier(Music music1, Music music2) {
        return music1.equals(music2);
    }

    @Override
    public void afficher(Music music) {

    }
}
