package bob.code.generator.core;

import bob.code.generator.core.entity.Attribute;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CommandContext {
    /**
     * 作者名称
     */
    private String userName;
    /**
     * 属性集合
     */
    private List<Attribute> attributes;
    /**
     * 类名
     */
    private String className;
    /**
     * 类描述
     */
    private String classDescription;

    public static volatile ThreadLocal<CommandContext> context = new ThreadLocal<>();

    public static CommandContext getCommandContext() {
        if (context.get() != null){
            return context.get();
        }
        synchronized (CommandContext.class){
            if (context.get() != null){
                return context.get();
            }
            CommandContext commandContext = new CommandContext();
            commandContext.setAttributes(new ArrayList<>());
            context.set(commandContext);
            return context.get();
        }
    }
}
