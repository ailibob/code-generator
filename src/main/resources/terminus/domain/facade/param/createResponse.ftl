
import io.swagger.annotations.ApiModel;
import io.terminus.api.response.info.ApiInfo;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("${modelDesc}返参模型")
public class ${ModelName}CreateResponse extends ApiInfo {
    private static final long serialVersionUID = 1L;
    private ${ModelName}TO ${modelName};
}
