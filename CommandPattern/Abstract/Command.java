package CommandPattern.Abstract;

import CommandPattern.Light;

public abstract class Command {
    protected Light light;

    public Command(Light light) {
        this.light = light;
    }

    public abstract void execute();
}
