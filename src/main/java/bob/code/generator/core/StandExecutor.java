package bob.code.generator.core;

public class StandExecutor implements CommandExecutor{
    @Override
    public void executor(Command command) {
        command.execute();
    }
}
