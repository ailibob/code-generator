
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractRequest;
import lombok.*;
import org.springframework.util.Assert;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类 ids 查询入参模型")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BobFindByIdsRequest extends AbstractRequest {
private static final long serialVersionUID = 1L;

    private List<Long> Ids;

    @Override
    public void checkParam() {
        super.checkParam();
        Assert.isTrue(this.Ids != null, "param lack");
    }
}
