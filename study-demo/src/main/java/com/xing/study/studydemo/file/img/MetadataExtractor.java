/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: MetadataExtractor
 * Author:   liujx
 * Date:     2020/9/25 10:43
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.file.img;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;
import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/25
 */
public class MetadataExtractor {

    public static void main(String[] args) throws ImageProcessingException, IOException {
        File file = new File("F:\\个人文档\\zp - 副本");
        String copyPath = "F:\\个人文档\\copy";
        File[] files = file.listFiles();
        for (File file1:files) {
            Metadata metadata = ImageMetadataReader.readMetadata(file1);
            Iterator<Directory> directoryIterator = metadata.getDirectories().iterator();
            while (directoryIterator.hasNext()) {
                Directory directory = directoryIterator.next();
                if ("Exif SubIFD".equals(directory.getName())) {
                    Collection<Tag> tags = directory.getTags();
                    for (Tag tag:tags) {
                        if ("Date/Time Original".equals(tag.getTagName())) {
                            String end = StrUtil.split(file1.getName(),".")[1];
                            Console.log(tag.getTagName()+"-->"+tag.getDescription()+" "+file1.getPath());
                            String newFileName = DateUtil.format(DateUtil.parse(tag.getDescription(),"yyyy:MM:dd HH:mm:ss"),"yyyyMMddHHmmss");
                            FileUtil.copy(file1.getPath(),copyPath+"\\"+newFileName+"."+end,false);

                        }
                    }
                }
            }

        }
    }
}