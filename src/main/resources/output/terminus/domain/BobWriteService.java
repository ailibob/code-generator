
import com.google.common.collect.Lists;
import io.terminus.trantorframework.sdk.sql.DS;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BobWriteService {
    private final BobRepository bobRepository;
    private final BobConvert bobConvert;

    public BobTO create(BobCreateRequest request) {
        // 参数转化
        val bob = bobConvert.to2po(request.getBob());
        // 创建需求单
        return bobConvert.po2to(bobRepository.create(bob));
    }

    public void update(BobUpdateRequest request) {
        update(request.getBobList());
    }


    private void update(List<BobTO> bobToList) {
        val bobList = bobConvert.to2po4list(bobToList);
        bobRepository.updateList(bobList);
    }
}
