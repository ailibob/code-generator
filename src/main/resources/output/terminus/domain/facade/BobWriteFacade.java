
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.trantorframework.Response;
import org.springframework.cloud.openfeign.FeignClient;

@Api("作者类领域层写 Facade")
@FeignClient(todo feign 注册服务名)
public interface BobWriteFacade {
    @ApiOperation("创建")
    Response<BobCreateResponse> create(BobCreateRequest request);

    @ApiOperation("更新")
    Response<BobUpdateResponse> update(BobUpdateRequest request);
}
