
import io.swagger.annotations.ApiModel;
import io.terminus.api.response.info.ApiInfo;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类 ids 查询返参模型")
public class BobFindByIdsResponse  extends ApiInfo {
    private static final long serialVersionUID = 1L;

    private List<BobTO> bobList;
}
