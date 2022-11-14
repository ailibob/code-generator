
import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantorframework.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BobWriteFacadeImpl implements BobWriteFacade{
    private final BobWriteService bobWriteService;

    @Override
    @DSTransaction
    public Response<BobCreateResponse> create(BobCreateRequest request) {
        return Response.ok(BobCreateResponse.builder()
        .bob(bobWriteService.create(request))
        .build());
    }

    @Override
    @DSTransaction
    public Response<BobUpdateResponse> update(BobUpdateRequest request) {
        bobWriteService.update(request);
        return Response.ok();
    }
}
