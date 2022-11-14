
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.response.info.ApiInfo;
import io.terminus.trantorframework.Paging;
import lombok.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类 分页返参模型")
public class BobPagingResponse extends ApiInfo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分页结果")
    private Paging<BobTO> pagingResult;
}
