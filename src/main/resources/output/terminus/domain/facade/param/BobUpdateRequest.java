
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
@ApiModel("作者类更新模型")
public class BobUpdateRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    private List<BobTO> bobList;

    @Override
    public void checkParam() {
        if (CollectionUtils.isEmpty(this.bobList)){
            throw new BusinessException("bob update param lack");
        }

        if (bobList.stream().anyMatch(it -> it.getId() == null)){
            throw new BusinessException("bob update param id lack");
        }
    }
}
