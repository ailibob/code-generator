
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractRequest;
import lombok.*;
import org.springframework.util.Assert;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("${modelDesc} 查询入参模型")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ${ModelName}QueryRequest  extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    private ${ModelName}TO ${modelName};

    @Override
    public void checkParam() {
        super.checkParam();
        Assert.isTrue(this.${modelName} != null, "param lack");
    }
}
