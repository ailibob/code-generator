
import io.terminus.gaia.domain.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
* @author Bob
* @date Mon Nov 14 17:15:29 CST 2022
* description:
**/
@Mapper(componentModel = "spring")
public abstract class BobConvert extends BaseConverter<BobTO, BobPO> {

    @Mapping(target = "queryParams", source = "request")
    public abstract QBobPO req2qpo(BobTO request);

    @Mapping(target = "queryParams", source = "request")
    public abstract QBobPO req2qpo(BobPagingRequest request);

    public abstract BobSO soConvert(BobPO request);
}
