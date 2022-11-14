package bob.code.generator.terminus.dict;

public interface TemplatePathDict {
     /**
      * common
      * */
     String CONVERT = "terminus/domain/convert.ftl";

     String READ_SERVICE = "terminus/domain/readService.ftl";

     String WRITE_SERVICE = "terminus/domain/writeService.ftl";

     String REPOSITORY = "terminus/domain/repository.ftl";

     /**
      * model
      * */
     String PO = "terminus/domain/model/po.ftl";

     String TO = "terminus/domain/model/so.ftl";

     String SO = "terminus/domain/model/to.ftl";

     /**
      * facade
      * */
     String READ_FACADE = "terminus/domain/facade/readFacade.ftl";

     String READ_FACADE_IMPL = "terminus/domain/facade/readFacadeImpl.ftl";

     String WRITE_FACADE = "terminus/domain/facade/writeFacade.ftl";

     String WRITE_FACADE_IMPL = "terminus/domain/facade/writeFacadeImpl.ftl";

     String FIND_ID_REQ = "terminus/domain/facade/param/findByIdRequest.ftl";

     String FIND_ID_RES = "terminus/domain/facade/param/findByIdResponse.ftl";

     String FIND_IDS_REQ = "terminus/domain/facade/param/findByIdsRequest.ftl";

     String FIND_IDS_RES = "terminus/domain/facade/param/findByIdsResponse.ftl";

     String PAGING_REQ = "terminus/domain/facade/param/pagingRequest.ftl";

     String PAGING_RES = "terminus/domain/facade/param/pagingResponse.ftl";

     String QUERY_REQ = "terminus/domain/facade/param/queryRequest.ftl";

     String QUERY_RES = "terminus/domain/facade/param/queryResponse.ftl";

     String UPDATE_REQ = "terminus/domain/facade/param/updateRequest.ftl";

     String UPDATE_RES = "terminus/domain/facade/param/updateResponse.ftl";

     String WRITE_REQ = "terminus/domain/facade/param/createRequest.ftl";

     String WRITE_RES = "terminus/domain/facade/param/createResponse.ftl";
}
