
import io.terminus.gaia.domain.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
* @author ${userName}
* @date ${date}
* description:
**/
@Mapper(componentModel = "spring")
public abstract class ${ModelName}Convert extends BaseConverter${r'<'}${ModelName}TO, ${ModelName}PO${r'>'} {

    @Mapping(target = "queryParams", source = "request")
    public abstract Q${ModelName}PO req2qpo(${ModelName}TO request);

    @Mapping(target = "queryParams", source = "request")
    public abstract Q${ModelName}PO req2qpo(${ModelName}PagingRequest request);

    public abstract ${ModelName}SO soConvert(${ModelName}PO request);
}
