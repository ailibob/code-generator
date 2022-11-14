
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractRequest;
import lombok.*;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("${modelDesc}更新模型")
public class ${ModelName}UpdateRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    private List${r'<'}${ModelName}TO${r'>'} ${modelName}List;

    @Override
    public void checkParam() {
        if (CollectionUtils.isEmpty(this.${modelName}List)){
            throw new BusinessException("${modelName} update param lack");
        }

        if (${modelName}List.stream().anyMatch(it -> it.getId() == null)){
            throw new BusinessException("${modelName} update param id lack");
        }
    }
}
