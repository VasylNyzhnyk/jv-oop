package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm working!!!");

    }

    @Override
    public void stopWork() {
        System.out.println("I'm don't working");

    }
}

