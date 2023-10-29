public class Meloman implements IMusicObserver {
    private String name;

    public Meloman(String name) {
        this.name = name;
    }

    @Override
    public void update(Music composition) {
        System.out.println(name + " received a new music composition: " + composition.compose());
    }
}


