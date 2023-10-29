public class Main {
    public static void main(String[] args) {
        MusicBot spotify = new MusicBot();

        Meloman user1 = new Meloman("DJ Aibyn");
        Meloman user2 = new Meloman("Marshmello");

        spotify.addObserver(user1);
        spotify.addObserver(user2);

        Music classicalMusic = new ClassicalMusic();
        Music electronicMusic = new ElectronicMusic();
        Music popMusic = new PopMusic();

        spotify.createMusic(classicalMusic);


        spotify.removeObserver(user1);
        spotify.createMusic(electronicMusic);
        spotify.createMusic(popMusic);
    }
}