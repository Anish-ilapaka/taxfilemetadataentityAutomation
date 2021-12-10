package com.ebay.test.task;

import com.ebay.test.constant.TaxCatPredConstants;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterTask {


    public FileWriterTask() {

    }

    public String createPredictionRequestFile(){
       String fileName = null;
        try {
            Path path = Files.createDirectories(Paths.get(TaxCatPredConstants.REQ_FILE_LOCATION));
            fileName =createPredictionRequestFileName();
            path = Files.createFile(Paths.get(path + File.separator + fileName));
            path.toFile();
        } catch (Exception e) {
        }
        return fileName;
    }

    private String createPredictionRequestFileName(){
        String fileName = TaxCatPredConstants.AUTOMATION + TaxCatPredConstants.NAMESPLITER +
                TaxCatPredConstants.NAMESPLITER + System.currentTimeMillis() + TaxCatPredConstants.JSON_EXTENSION;
        System.out.println("Prediction request fileName:"+fileName);
        return fileName;
    }
}
