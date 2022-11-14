
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractRequest;
import lombok.*;
import org.springframework.util.Assert;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类创建模型")
public class BobCreateRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;

    private BobTO bob;

    @Override
    public void checkParam() {
        Assert.notNull(this.bob,"bob create param lack");
    }
}
