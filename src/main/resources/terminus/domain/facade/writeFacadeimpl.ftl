
import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantorframework.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ${ModelName}WriteFacadeImpl implements ${ModelName}WriteFacade{
    private final ${ModelName}WriteService ${modelName}WriteService;

    @Override
    @DSTransaction
    public Response${r'<'}${ModelName}CreateResponse${r'>'} create(${ModelName}CreateRequest request) {
        return Response.ok(${ModelName}CreateResponse.builder()
        .${modelName}(${modelName}WriteService.create(request))
        .build());
    }

    @Override
    @DSTransaction
    public Response${r'<'}${ModelName}UpdateResponse${r'>'} update(${ModelName}UpdateRequest request) {
        ${modelName}WriteService.update(request);
        return Response.ok();
    }
}
