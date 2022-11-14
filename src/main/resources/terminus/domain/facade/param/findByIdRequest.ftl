
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractRequest;
import lombok.*;
import org.springframework.util.Assert;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("${modelDesc} id 查询入参模型")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ${ModelName}FindByIdRequest extends AbstractRequest {
private static final long serialVersionUID = 1L;

    private Long Id;

    @Override
    public void checkParam() {
        super.checkParam();
        Assert.isTrue(this.Id != null, "param lack");
    }
}
