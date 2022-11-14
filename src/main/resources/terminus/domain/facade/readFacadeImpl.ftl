
import io.terminus.trantorframework.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ${ModelName}ReadFacadeImpl implements ${ModelName}ReadFacade{
    private final ${ModelName}ReadService ${modelName}ReadService;

    @Override
    public Response${r'<'}${ModelName}QueryResponse${r'>'} query(${ModelName}QueryRequest request) {
            return Response.ok(${ModelName}QueryResponse
            .builder()
            .${modelName}List(${modelName}ReadService.query(request))
            .build());
    }


    @Override
    public Response${r'<'}${ModelName}FindByIdResponse${r'>'} findById(${ModelName}FindByIdRequest request) {
        return Response.ok(${ModelName}FindByIdResponse
        .builder()
        .${modelName}(${modelName}ReadService.findById(request))
        .build());
    }

    @Override
    public Response${r'<'}${ModelName}FindByIdsResponse${r'>'} findByIds(${ModelName}FindByIdsRequest request) {
        return Response.ok(${ModelName}FindByIdsResponse
        .builder()
        .${modelName}List(${modelName}ReadService.findByIds(request))
        .build());
    }

    @Override
    public Response${r'<'}${ModelName}PagingResponse${r'>'} page(${ModelName}PagingRequest request) {
        return Response.ok(${ModelName}PagingResponse
        .builder()
        .pagingResult(${modelName}ReadService.page(request))
        .build());
    }
}
