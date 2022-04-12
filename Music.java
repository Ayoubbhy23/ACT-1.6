package fr.ippon.jhipster.bpm.ayoub;

public class Music {
    String title;
    String author;
    String interprete;
    String genre;

    public Music(String title, String author, String interprete, String genre) {
        this.title = title;
        this.author = author;
        this.interprete = interprete;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Music other = (Music) obj;

        if (!this.title.equals(other.title)) {
            return false;
        }

        if (!this.author.equals(other.author)) {
            return false;
        }

        if (!this.genre.equals(other.genre)) {
            return false;
        }

        if (!this.interprete.equals(other.interprete)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Music{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", interprete='" + interprete + '\'' +
            ", genre='" + genre + '\'' +
            '}';
    }
}
