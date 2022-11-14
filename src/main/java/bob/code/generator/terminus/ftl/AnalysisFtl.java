package bob.code.generator.terminus.ftl;

import bob.code.generator.core.CommandContext;
import bob.code.generator.core.configure.ConfigurationSingleton;
import lombok.val;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AnalysisFtl {

    public void analysis(ClassLoader classLoader){
        // 获取模版
        val template = ConfigurationSingleton.getTemplate(getTemplatePath(), classLoader);
        // 输出文件
        ConfigurationSingleton.outputTemplate(getOutputPath(),template,getAttributes());
    }
    
    public Map<String,Object> commonAttribute(){
        Map<String, Object> attributes = new HashMap<>();
        CommandContext commandContext = CommandContext.getCommandContext();
        attributes.put("userName", commandContext.getUserName());
        attributes.put("modelDesc", commandContext.getClassDescription());
        attributes.put("ModelName", commandContext.getClassName());
        attributes.put("attributes", commandContext.getAttributes());
        attributes.put("modelName", commandContext.getClassName().substring(0,1).toLowerCase() + commandContext.getClassName().substring(1));
        attributes.put("date", new Date().toString());
        return attributes;
    }

    /**
     * 获取属性
     */
    public abstract Map<String,Object> getAttributes();

    /**
     * 获取模版文件路径
     */
    public abstract String getTemplatePath();

    /**
     * 获取输出路径
     */
    public abstract String getOutputPath();
}
