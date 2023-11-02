public class MusicFactory {
    public Music createMusic(String musicType) {
        if (musicType.equalsIgnoreCase("Classical")) {
            return new ClassicalMusic();
        } else if (musicType.equalsIgnoreCase("Electronic")) {
            return new ElectronicMusic();
        } else if (musicType.equalsIgnoreCase("Pop")) {
            return new PopMusic();
        } else {
            throw new IllegalArgumentException("Invalid music type: " + musicType);
        }
    }
}