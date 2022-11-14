

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
* @author ${userName}
* @date ${date}
* description:
**/
@EqualsAndHashCode(callSuper = true)
@Data
@Model(name = "${modelDesc}")
public class ${ModelName}PO extends BaseModel${r'<Long>'} {

    private static final long serialVersionUID = 1L;

    <#list attributes as i>
    @Field(name = "${i.description}")
    private ${i.type} ${i.name};
    </#list>
}
