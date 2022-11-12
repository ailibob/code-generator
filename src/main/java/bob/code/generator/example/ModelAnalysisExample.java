package bob.code.generator.example;

import bob.code.generator.core.CommandContext;
import bob.code.generator.core.CommandExecutor;
import bob.code.generator.core.StandExecutor;
import bob.code.generator.core.command.AnalysisCommand;
import bob.code.generator.core.configure.ConfigurationSingleton;
import bob.code.generator.example.model.Bob;
import freemarker.template.Template;
import lombok.val;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ModelAnalysisExample {


    /**
     * 该案例是对模型解析的案例
     */
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new StandExecutor();
        // 解析指令
        val analysisCommand = new AnalysisCommand(Bob.class);
        commandExecutor.executor(analysisCommand);
        // 获取模版
        CommandContext commandContext = CommandContext.getCommandContext();
        Template temp = ConfigurationSingleton.getTemplate("example/model.ftl",commandExecutor.getClass().getClassLoader());
        // 组装模版参数
        Map<String, Object> latest = new HashMap<>();
        latest.put("userName", "Bob");
        latest.put("modelDesc", commandContext.getClassDescription());
        latest.put("ModelName", commandContext.getClassName());
        latest.put("attributes", commandContext.getAttributes());
        // freeMarker 自带时间函数用不明白..
        latest.put("date", new Date().toString());
        // 模版文件输出
        ConfigurationSingleton.outputTemplate("src/main/resources/output/model",temp,latest);
    }
}
