package bob.code.generator.terminus.dict;

public interface OutputPathDict {
    /**
     * common
     * */
    String CONVERT = "src/main/resources/output/terminus/domain/%PlaceHolder%Convert.java";

    String READ_SERVICE = "src/main/resources/output/terminus/domain/%PlaceHolder%ReadService.java";

    String WRITE_SERVICE = "src/main/resources/output/terminus/domain/%PlaceHolder%WriteService.java";

    String REPOSITORY = "src/main/resources/output/terminus/domain/%PlaceHolder%Repository.java";

    /**
     * model
     * */
    String PO = "src/main/resources/output/terminus/domain/model/%PlaceHolder%PO.java";
    String TO = "src/main/resources/output/terminus/domain/model/%PlaceHolder%SO.java";
    String SO = "src/main/resources/output/terminus/domain/model/%PlaceHolder%TO.java";

    /**
     * facade
     * */
    String READ_FACADE = "src/main/resources/output/terminus/domain/facade/%PlaceHolder%ReadFacade.java";

    String READ_FACADE_IMPL = "src/main/resources/output/terminus/domain/facade/%PlaceHolder%ReadFacadeImpl.java";

    String WRITE_FACADE = "src/main/resources/output/terminus/domain/facade/%PlaceHolder%WriteFacade.java";

    String WRITE_FACADE_IMPL = "src/main/resources/output/terminus/domain/facade/%PlaceHolder%WriteFacadeImpl.java";

    String FIND_ID_REQ = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%FindByIdRequest.java";

    String FIND_ID_RES = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%FindByIdResponse.java";

    String FIND_IDS_REQ = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%FindByIdsRequest.java";

    String FIND_IDS_RES = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%FindByIdsResponse.java";

    String PAGING_REQ = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%PagingRequest.java";

    String PAGING_RES = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%PagingResponse.java";

    String QUERY_REQ = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%QueryRequest.java";

    String QUERY_RES = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%QueryResponse.java";
    
    String UPDATE_REQ = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%UpdateRequest.java";
    
    String UPDATE_RES = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%UpdateResponse.java";
    
    String Create_REQ = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%CreateRequest.java";
    
    String Create_RES = "src/main/resources/output/terminus/domain/facade/param/%PlaceHolder%CreateResponse.java";
}
