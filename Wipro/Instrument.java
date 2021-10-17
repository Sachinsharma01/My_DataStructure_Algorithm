package Wipro;

public abstract class Instrument {
    public abstract void play();
}
class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan!!");
    }
    public void type() {
        System.out.println("open");
    }
}
class Flute extends Instrument{
    @Override
    public void play() {
        System.out.println("Flute is Playing toot toot toot!!");
    }
    public void color() {
        System.out.println("Black");
    }
}
class Guitar extends Instrument{
    @Override
    public void play() {
        System.out.println("Guitar is Playing tin tin!!");
    }
    public void length() {
        System.out.println("1m");
    }
}

class MainInstrument {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[10];
        instrument[0] = new Flute();
        instrument[1] = new Guitar();
        instrument[2] = new Piano();
        for (int i = 0; i < instrument.length; i++) {
            instrument[i].play();
        }
    }
}