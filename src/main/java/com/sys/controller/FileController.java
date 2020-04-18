package com.sys.controller;

import com.sys.utils.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

@Controller
@Slf4j
public class FileController {

    @Value("${attach}")
    public String path;


    @RequestMapping(method = RequestMethod.POST, value = "/updateFile.do")
    public String update(
            MultipartFile fujian,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String imgUrl = FileUtil.saveFile(fujian);
        request.setAttribute("imgUrl",imgUrl);
        request.setAttribute("upMsg","上传成功");
        return "upload";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/showImg.do")
    public void update(String imgurl,HttpServletRequest request,
                       HttpServletResponse response) throws Exception {
        String filePath = path + "\\" + imgurl;
        File file = new File(filePath);
        // 获取输出流
        OutputStream outputStream = response.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        // 读数据
        byte[] data = new byte[fileInputStream.available()];
        fileInputStream.read(data);
        fileInputStream.close();
        // 回写
        response.setHeader("Content-Disposition", "attachment; filename="+ URLEncoder.encode(imgurl,"UTF-8"));
        outputStream.write(data);
        outputStream.flush();
        outputStream.close();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
