package bob.code.generator.terminus.ftl.domain;

import bob.code.generator.core.CommandContext;
import bob.code.generator.terminus.dict.OutputPathDict;
import bob.code.generator.terminus.dict.TemplatePathDict;
import bob.code.generator.terminus.ftl.AnalysisFtl;

import java.util.HashMap;
import java.util.Map;

public class Convert extends AnalysisFtl {
    @Override
    public Map<String, Object> getAttributes() {
        return new HashMap<>(super.commonAttribute());
    }

    @Override
    public String getTemplatePath() {
        return TemplatePathDict.CONVERT;
    }

    @Override
    public String getOutputPath() {
        return OutputPathDict.CONVERT.replace("%PlaceHolder%", CommandContext.getCommandContext().getClassName());
    }
}
