
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.ApiBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
* @author ${userName}
* @date ${date}
* description:
**/
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("${modelDesc}")
@NoArgsConstructor
@AllArgsConstructor
public class ${ModelName}TO extends ApiBean {
    private static final long serialVersionUID = 1L;

    <#list attributes as i>
    @ApiModelProperty("${i.description}")
    private ${i.type} ${i.name};
    </#list>
}
