package CommandPattern;

import java.util.ArrayList;
import java.util.List;

import CommandPattern.Abstract.Command;

public class Invoker {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void execute(){
        for (Command command :
                commandList) {
            command.execute();
        }
    }

}