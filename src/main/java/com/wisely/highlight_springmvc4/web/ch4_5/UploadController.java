package com.wisely.highlight_springmvc4.web.ch4_5;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by lyh on 17-5-23.
 */
@Controller
public class UploadController {

    @RequestMapping(value ="/upload2",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){
        try{
            FileUtils.writeByteArrayToFile(new File(//使用FileUtils.writeByteArrayToFile快速写文件到磁盘
                    "/home/lyh/SpringBoot/src/main/resources"+file.getOriginalFilename()),file.getBytes());
            return "ok";
        }catch (IOException e){
            e.printStackTrace();
            return "wrong";
        }
    }
}
