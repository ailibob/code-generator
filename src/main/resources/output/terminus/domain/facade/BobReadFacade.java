
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.trantorframework.Response;
import org.springframework.cloud.openfeign.FeignClient;

/**
* @author Bob
* @date Mon Nov 14 17:15:29 CST 2022
* description:
**/
@Api("作者类领域层读 Facade")
@FeignClient(todo feign 注册服务名)
public interface BobReadFacade {

    @ApiOperation("列表查询")
    Response<BobQueryResponse> query(BobQueryRequest request);

    @ApiOperation("id 查询")
    Response<BobFindByIdResponse> findById(BobFindByIdRequest request);

    @ApiOperation("ids 查询")
    Response<BobFindByIdsResponse> findByIds(BobFindByIdsRequest request);
    
    @ApiOperation("分页查询")
    Response<BobPagingResponse> page(BobPagingRequest request);

}
