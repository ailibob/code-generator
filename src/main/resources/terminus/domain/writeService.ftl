
import com.google.common.collect.Lists;
import io.terminus.trantorframework.sdk.sql.DS;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ${ModelName}WriteService {
    private final ${ModelName}Repository ${modelName}Repository;
    private final ${ModelName}Convert ${modelName}Convert;

    public ${ModelName}TO create(${ModelName}CreateRequest request) {
        // 参数转化
        val ${modelName} = ${modelName}Convert.to2po(request.get${ModelName}());
        // 创建需求单
        return ${modelName}Convert.po2to(${modelName}Repository.create(${modelName}));
    }

    public void update(${ModelName}UpdateRequest request) {
        update(request.get${ModelName}List());
    }


    private void update(List${r'<'}${ModelName}TO${r'>'} ${modelName}ToList) {
        val ${modelName}List = ${modelName}Convert.to2po4list(${modelName}ToList);
        ${modelName}Repository.updateList(${modelName}List);
    }
}
