
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
public class ${ModelName}ReadService {
    private final ${ModelName}Repository ${modelName}Repository;
    private final ${ModelName}Convert ${modelName}Convert;

    public List${r'<'}${ModelName}TO${r'>'} query(${ModelName}QueryRequest request) {
        val q${ModelName} = ${modelName}Convert.req2qpo(request.get${ModelName}());
        return queryByQModel(q${ModelName});
    }

    public ${ModelName}TO findById(${ModelName}FindByIdRequest request) {
        val ${modelName} = ${modelName}Repository.findById(request.getId());
        return ${modelName}.map(${modelName}Convert::po2to).orElse(null);
    }

    public List${r'<'}${ModelName}TO${r'>'} findByIds(${ModelName}FindByIdsRequest request) {
        Q${ModelName}PO q${ModelName} = new Q${ModelName}PO();
        QLongId qId = new QLongId(request.getIds());
        q${ModelName}.setId(qId);
        return queryByQModel(q${ModelName});
    }

    public Paging${r'<'}${ModelName}TO${r'>'} page(${ModelName}PagingRequest request) {
        val qRequest = ${modelName}Convert.req2qpo(request);
        val pagingResult = ${modelName}Repository.paging(qRequest);

        if (CollectionUtils.isEmpty(pagingResult.getData())){
            return Paging.empty();
        }

        return new Paging<>(pagingResult.getTotal(),${modelName}Convert.po2to4list(pagingResult.getData()));
    }

    private List${r'<'}${ModelName}TO${r'>'} queryByQModel(Q${ModelName}PO q${ModelName}) {
        val ${modelName}PoList = ${modelName}Repository.findAll(q${ModelName});
        if (CollectionUtils.isEmpty(${modelName}PoList)){
            return Collections.emptyList();
        }

        return ${modelName}Convert.po2to4list(${modelName}PoList);
    }
}
