
import io.terminus.trantorframework.Order;
import io.terminus.trantorframework.Paging;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BobReadService {
    private final BobRepository bobRepository;
    private final BobConvert bobConvert;

    public List<BobTO> query(BobQueryRequest request) {
        val qBob = bobConvert.req2qpo(request.getBob());
        return queryByQModel(qBob);
    }

    public BobTO findById(BobFindByIdRequest request) {
        val bob = bobRepository.findById(request.getId());
        return bob.map(bobConvert::po2to).orElse(null);
    }

    public List<BobTO> findByIds(BobFindByIdsRequest request) {
        QBobPO qBob = new QBobPO();
        QLongId qId = new QLongId(request.getIds());
        qBob.setId(qId);
        return queryByQModel(qBob);
    }

    public Paging<BobTO> page(BobPagingRequest request) {
        val qRequest = bobConvert.req2qpo(request);
        val pagingResult = bobRepository.paging(qRequest);

        if (CollectionUtils.isEmpty(pagingResult.getData())){
            return Paging.empty();
        }

        return new Paging<>(pagingResult.getTotal(),bobConvert.po2to4list(pagingResult.getData()));
    }

    private List<BobTO> queryByQModel(QBobPO qBob) {
        val bobPoList = bobRepository.findAll(qBob);
        if (CollectionUtils.isEmpty(bobPoList)){
            return Collections.emptyList();
        }

        return bobConvert.po2to4list(bobPoList);
    }
}
