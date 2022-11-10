package bob.code.generator.core.command;

import bob.code.generator.core.Command;
import lombok.Data;
import lombok.val;

@Data
public class AnalysisCommand implements Command {
    /**
     * 目标类
     */
    private Class<?> objectClass;

    public AnalysisCommand(Class<?> objectClass){
        this.setObjectClass(objectClass);
    }
    @Override
    public void execute() {
        // 类名 && 小写类名
        val canonicalName = objectClass.getCanonicalName();
        // 属性集合

        // 根据注解获取注释
    }
}
