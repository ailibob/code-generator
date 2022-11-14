package bob.code.generator.terminus;

import bob.code.generator.core.CommandContext;
import bob.code.generator.core.CommandExecutor;
import bob.code.generator.core.StandExecutor;
import bob.code.generator.core.command.AnalysisCommand;
import bob.code.generator.example.model.Bob;
import bob.code.generator.terminus.ftl.AnalysisFtl;
import bob.code.generator.terminus.ftl.domain.Convert;
import bob.code.generator.terminus.ftl.domain.ReadService;
import bob.code.generator.terminus.ftl.domain.Repository;
import bob.code.generator.terminus.ftl.domain.WriteService;
import bob.code.generator.terminus.ftl.domain.facade.ReadFacade;
import bob.code.generator.terminus.ftl.domain.facade.ReadFacadeImpl;
import bob.code.generator.terminus.ftl.domain.facade.WriteFacade;
import bob.code.generator.terminus.ftl.domain.facade.WriteFacadeImpl;
import bob.code.generator.terminus.ftl.domain.facade.param.*;
import bob.code.generator.terminus.ftl.domain.model.Po;
import bob.code.generator.terminus.ftl.domain.model.So;
import bob.code.generator.terminus.ftl.domain.model.To;
import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class TerminusApplication {
    public static void main(String[] args) {
        // 作者名字
        CommandContext.getCommandContext().setUserName("Bob");
        // 解析指令
        CommandExecutor commandExecutor = new StandExecutor();
        val analysisCommand = new AnalysisCommand(Bob.class);
        commandExecutor.executor(analysisCommand);
        // 需要执行的 ftl 模版
        List<AnalysisFtl> analysisFtlList = new ArrayList<>();

        // model
        analysisFtlList.add(new So());
        analysisFtlList.add(new To());
        analysisFtlList.add(new Po());
        // convert
        analysisFtlList.add(new Convert());
        // service
        analysisFtlList.add(new WriteService());
        analysisFtlList.add(new ReadService());
        // Repository
        analysisFtlList.add(new Repository());
        // facade
        analysisFtlList.add(new ReadFacade());
        analysisFtlList.add(new ReadFacadeImpl());
        analysisFtlList.add(new WriteFacade());
        analysisFtlList.add(new WriteFacadeImpl());
        // param
        analysisFtlList.add(new FindByIdRequest());
        analysisFtlList.add(new FindByIdResponse());
        analysisFtlList.add(new FindByIdsRequest());
        analysisFtlList.add(new FindByIdsResponse());
        analysisFtlList.add(new PagingRequest());
        analysisFtlList.add(new PagingResponse());
        analysisFtlList.add(new QueryRequest());
        analysisFtlList.add(new QueryResponse());
        analysisFtlList.add(new UpdateRequest());
        analysisFtlList.add(new UpdateResponse());
        analysisFtlList.add(new WriteRequest());
        analysisFtlList.add(new WriteResponse());

        // launch 🚀🚀🚀
        analysisFtlList.forEach(it -> it.analysis(commandExecutor.getClass().getClassLoader()));
    }
}
