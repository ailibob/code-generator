
import io.terminus.trantorframework.api.BaseModel;
import io.terminus.trantorframework.api.annotation.Field;
import io.terminus.trantorframework.api.annotation.Index;
import io.terminus.trantorframework.api.annotation.Model;
import io.terminus.trantorframework.api.annotation.SearchModel;
import io.terminus.trantorframework.api.annotation.typemeta.DateTimeMeta;
import io.terminus.trantorframework.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantorframework.api.annotation.typemeta.TextMeta;
import io.terminus.trantorframework.api.annotation.typemeta.TimeUnit;
import lombok.*;

/**
* @author ${userName}
* @date ${date}
* description:
**/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SearchModel(desc = "${modelDesc}搜索模型", name = "${modelDesc}搜索模型")
@Model(desc = "${modelDesc}搜索模型", name = "${modelDesc}搜索模型", indexes = {
})
public class ${ModelName}SO extends BaseModel${r'<Long>'} {

    private static final long serialVersionUID = 1L;

    <#list attributes as i>
    @Field(name = "${i.description}")
    private ${i.type} ${i.name};
    </#list>
}
