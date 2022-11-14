
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractRequest;
import lombok.*;
import org.springframework.util.Assert;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("${modelDesc}创建模型")
public class ${ModelName}CreateRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;

    private ${ModelName}TO ${modelName};

    @Override
    public void checkParam() {
        Assert.notNull(this.${modelName},"${modelName} create param lack");
    }
}
