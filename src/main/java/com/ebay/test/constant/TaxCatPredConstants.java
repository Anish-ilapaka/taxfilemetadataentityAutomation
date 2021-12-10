package com.ebay.test.constant;

public class TaxCatPredConstants {
    public static final String LOG_STEP = "STEP ";
    public static final String PREDICION_REQUEST_PAYLOAD_JSON = "testdata/besItemTaxCategoryPayload.json";
    public static final String PREDICION_RESPONSE_JSON = "testdata/besItemTaxCategoryPayload.json";
    public static final String DATA_PROVIDER = "configData";

    //FileWriterTask
    public static final String REQ_FILE_LOCATION = "tmp/pred_req";
    public static final String RES_FILE_LOCATION = "tmp/pred_res";
    public static final String AUTOMATION = "AUTOMATION-BESITEMTAXCATPRED";
    public static final String RESULT = "RESULT";
    public static final String NAMESPLITER = "_";
    public static final String JSON_EXTENSION = ".json";
    public static final String PREDICTION_RESPONSE_JSON = "testdata/predictionResult.json";

    //S3UploaderTask
    public static final String PREDICTION_REQUEST_FILES = "prediction-request-files";
    public static final String PREDICTION_RESPONSE_FILES = "prediction-response-files";
    public static final long TTL_FILEUPLOAD = 864000;

    public static final String LUCY_PREDICTION_JOB_STSTUS_PROCESSED = "Processed";

    public static final String BESITEMTAXCATPRED_PREDICTION_COMPLETE_API = "/admin/v3console/BESPageUtil";
    public static final String TAXCATEGORY_GET_BULKITEMIDS ="/tax/v1/itemTaxCategory/getBulkItemIds";


}
