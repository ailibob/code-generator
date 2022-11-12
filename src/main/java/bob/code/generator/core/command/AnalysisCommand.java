package bob.code.generator.core.command;

import bob.code.generator.core.Command;
import bob.code.generator.core.CommandContext;
import bob.code.generator.core.Description;
import bob.code.generator.core.entity.Attribute;
import bob.code.generator.utils.ClassUtils;
import lombok.Data;
import lombok.val;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

@Data
public class AnalysisCommand implements Command {
    /**
     * 目标类
     */
    private Class<?> objectClass;

    private CommandContext commandContext;

    public AnalysisCommand(Class<?> objectClass){
        this.setObjectClass(objectClass);
        this.commandContext = CommandContext.getCommandContext();
    }

    @Override
    public void execute() {
        // 类名
        commandContext.setClassName(objectClass.getSimpleName());
        // 类描述
        analysisClassAnnotations(objectClass);
        // 属性
        analysisFields();
    }

    private void analysisClassAnnotations(Class<?> objectClass) {
        Arrays.asList(objectClass.getDeclaredAnnotations()).forEach(it -> commandContext.setClassDescription(getDescription(it)));
    }

    private String getDescription(Annotation it) {
        if (it instanceof Description){
            return ((Description) it).value();
        }
        return null;
    }

    private void analysisAnnotations(Field field,Attribute attribute) {
        Arrays.asList(field.getDeclaredAnnotations()).forEach(it ->{
            attribute.setDescription(getDescription(it));
        });
    }

    private void analysisFields() {
        Arrays.asList(objectClass.getDeclaredFields()).forEach(it ->{
            val attribute = Attribute.builder()
                    .name(it.getName())
                    .type(ClassUtils.getSimpleName(it.getGenericType().getTypeName()))
                    .build();
            // 注解
            analysisAnnotations(it,attribute);
            commandContext.getAttributes().add(attribute);
        });
    }
}
