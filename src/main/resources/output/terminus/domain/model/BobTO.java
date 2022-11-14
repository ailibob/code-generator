
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.ApiBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
* @author Bob
* @date Mon Nov 14 16:28:19 CST 2022
* description:
**/
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("作者类")
@NoArgsConstructor
@AllArgsConstructor
public class BobTO extends ApiBean {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("体重")
    private String weight;
    @ApiModelProperty("身高")
    private String height;
}
