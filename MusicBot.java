import java.util.ArrayList;
import java.util.List;

public class MusicBot {
    private List<IMusicObserver> observers = new ArrayList<>();

    public void addObserver(IMusicObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IMusicObserver observer) {
        observers.remove(observer);
    }

    public void createMusic(Music composition) {
        System.out.println('\n' + "New song was dropped!" + '\n');
        for (IMusicObserver observer : observers) {
            observer.update(composition);
        }
    }
}


