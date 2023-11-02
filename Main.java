public class Main {
    public static void main(String[] args) {
        MusicBot spotify = new MusicBot();

        Meloman user1 = new Meloman("DJ top G");
        Meloman user2 = new Meloman("The Weeknd");

        spotify.addObserver(user1);
        spotify.addObserver(user2);

        MusicFactory musicFactory = new MusicFactory();

        Music classicalMusic = musicFactory.createMusic("Classical");
        Music electronicMusic = musicFactory.createMusic("Electronic");
        Music popMusic = musicFactory.createMusic("Pop");

        spotify.createMusic(classicalMusic);


        spotify.removeObserver(user1);

        spotify.createMusic(electronicMusic);
        spotify.createMusic(popMusic);
    }
}