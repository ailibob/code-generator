
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.trantorframework.Response;
import org.springframework.cloud.openfeign.FeignClient;

@Api("${modelDesc}领域层写 Facade")
@FeignClient(todo feign 注册服务名)
public interface ${ModelName}WriteFacade {
    @ApiOperation("创建")
    Response${r'<'}${ModelName}CreateResponse${r'>'} create(${ModelName}CreateRequest request);

    @ApiOperation("更新")
    Response${r'<'}${ModelName}UpdateResponse${r'>'} update(${ModelName}UpdateRequest request);
}
