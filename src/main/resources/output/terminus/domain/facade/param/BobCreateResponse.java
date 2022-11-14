
import io.swagger.annotations.ApiModel;
import io.terminus.api.response.info.ApiInfo;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类返参模型")
public class BobCreateResponse extends ApiInfo {
    private static final long serialVersionUID = 1L;
    private BobTO bob;
}
