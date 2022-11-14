
import io.swagger.annotations.ApiModel;
import io.terminus.api.request.AbstractPageRequest;
import lombok.*;
import org.springframework.util.Assert;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类分页入参模型")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BobPagingRequest extends AbstractPageRequest {
private static final long serialVersionUID = 1L;

    @Override
    public void checkParam() {
        super.checkParam();
    }
}
