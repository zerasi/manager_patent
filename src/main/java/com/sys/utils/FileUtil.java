package com.sys.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class FileUtil {

    public static final String path = "C:\\temp\\manager_patent";

    /**
     * 保存上传的文件
     *
     * @param file
     * @return 文件下载的url
     * @throws Exception
     */
    public static String saveFile(MultipartFile file) throws Exception {
        if (file == null || file.isEmpty())
            return "";
        File target = new File(path);
        if (!target.isDirectory()) {
            target.mkdirs();
        }
        String originalFilename = file.getOriginalFilename();
        int begin = file.getOriginalFilename().indexOf(".");
        int last = file.getOriginalFilename().length();
        //获得文件后缀名
        String fileSub = file.getOriginalFilename().substring(begin, last);
        String fileName = new Date().getTime()+fileSub;
        File file1 = new File(target.getPath() + "/" + fileName);
        Files.write(Paths.get(file1.toURI()), file.getBytes(), StandardOpenOption.CREATE_NEW);
        return  fileName;
    }

    /**
     * 获得文件的后缀名
     *
     * @param fileName
     * @return
     */
    public static String getPostfix(String fileName) {
        if (fileName == null || "".equals(fileName.trim())) {
            return "";
        }
        if (fileName.contains(".")) {
            return fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        }
        return "";
    }

}
