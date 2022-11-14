
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.trantorframework.Response;
import org.springframework.cloud.openfeign.FeignClient;

/**
* @author ${userName}
* @date ${date}
* description:
**/
@Api("${modelDesc}领域层读 Facade")
@FeignClient(todo feign 注册服务名)
public interface ${ModelName}ReadFacade {

    @ApiOperation("列表查询")
    Response${r'<'}${ModelName}QueryResponse${r'>'} query(${ModelName}QueryRequest request);

    @ApiOperation("id 查询")
    Response${r'<'}${ModelName}FindByIdResponse${r'>'} findById(${ModelName}FindByIdRequest request);

    @ApiOperation("ids 查询")
    Response${r'<'}${ModelName}FindByIdsResponse${r'>'} findByIds(${ModelName}FindByIdsRequest request);
    
    @ApiOperation("分页查询")
    Response${r'<'}${ModelName}PagingResponse${r'>'} page(${ModelName}PagingRequest request);

}
