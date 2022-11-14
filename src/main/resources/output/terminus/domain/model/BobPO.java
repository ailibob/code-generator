

import io.terminus.trantorframework.api.BaseModel;
import io.terminus.trantorframework.api.annotation.Field;
import io.terminus.trantorframework.api.annotation.FieldType;
import io.terminus.trantorframework.api.annotation.Index;
import io.terminus.trantorframework.api.annotation.Model;
import io.terminus.trantorframework.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantorframework.api.annotation.typemeta.TextMeta;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* @author Bob
* @date Mon Nov 14 16:28:19 CST 2022
* description:
**/
@EqualsAndHashCode(callSuper = true)
@Data
@Model(name = "作者类")
public class BobPO extends BaseModel<Long> {

    private static final long serialVersionUID = 1L;

    @Field(name = "id")
    private Integer id;
    @Field(name = "年龄")
    private Integer age;
    @Field(name = "名称")
    private String name;
    @Field(name = "体重")
    private String weight;
    @Field(name = "身高")
    private String height;
}
