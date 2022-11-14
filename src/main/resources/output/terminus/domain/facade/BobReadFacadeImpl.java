
import io.terminus.trantorframework.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BobReadFacadeImpl implements BobReadFacade{
    private final BobReadService bobReadService;

    @Override
    public Response<BobQueryResponse> query(BobQueryRequest request) {
            return Response.ok(BobQueryResponse
            .builder()
            .bobList(bobReadService.query(request))
            .build());
    }


    @Override
    public Response<BobFindByIdResponse> findById(BobFindByIdRequest request) {
        return Response.ok(BobFindByIdResponse
        .builder()
        .bob(bobReadService.findById(request))
        .build());
    }

    @Override
    public Response<BobFindByIdsResponse> findByIds(BobFindByIdsRequest request) {
        return Response.ok(BobFindByIdsResponse
        .builder()
        .bobList(bobReadService.findByIds(request))
        .build());
    }

    @Override
    public Response<BobPagingResponse> page(BobPagingRequest request) {
        return Response.ok(BobPagingResponse
        .builder()
        .pagingResult(bobReadService.page(request))
        .build());
    }
}
