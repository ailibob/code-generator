package bob.code.generator.core;

import bob.code.generator.core.entity.Attribute;

import java.util.List;
import java.util.Map;

public class CommandContext {
    private Map<String, List<Attribute>> attributesMap;
    public static volatile ThreadLocal<CommandContext> context;

    public static CommandContext getThreadLocal() {
        if (context != null){
            return context.get();
        }
        synchronized (CommandContext.class){
            if (context != null){
                return context.get();
            }
            CommandContext commandContext = new CommandContext();
            context.set(commandContext);
            return context.get();
        }
    }
}
