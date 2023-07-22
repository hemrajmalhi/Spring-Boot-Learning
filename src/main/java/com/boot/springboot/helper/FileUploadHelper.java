package com.boot.springboot.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {
//    public final String upload_dir="F:\\javaSpringBoot\\SpringBoot\\src\\main\\resources\\static\\image";
    public final String upload_dir=new ClassPathResource("static/image/").getFile().getAbsolutePath();

    public FileUploadHelper()throws IOException
    {}
    public boolean uploadFile(MultipartFile multipartFile){
        boolean f =false;

        try {

            Files.copy(multipartFile.getInputStream(), Paths.get(upload_dir+ File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);

            f=true;
        }
        catch (Exception e){
            e.getStackTrace();
        }
        return f;

    }
}
