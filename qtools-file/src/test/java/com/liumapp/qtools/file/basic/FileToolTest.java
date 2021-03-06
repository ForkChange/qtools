package com.liumapp.qtools.file.basic;

import com.liumapp.qtools.file.config.TestConfig;
import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * author liumapp
 * file FileToolTest.java
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/8
 */
public class FileToolTest extends TestCase {

    public void testWriteStringToFile () throws IOException {
        String str = "sdfsdffqwfasdfawefsadfsdf{dfefd}";
        FileTool.writeStringToNewFile(new File(TestConfig.savePath + "test.txt"), str);
    }

    public void testCreateFileObject () throws IOException {
        FileTool.createFileObject(TestConfig.savePath + "/qq/tt/", "aaa");
        Assert.assertEquals(true, FileTool.isFileExists(TestConfig.savePath + "/qq/tt/aaa"));
        FileTool.deleteDir(TestConfig.savePath + "/qq");
        Assert.assertEquals(false, FileTool.isDirectory(TestConfig.savePath + "/qq"));
    }

    public void testInputSreamToFile () throws IOException {
        InputStream is = new FileInputStream(new File(TestConfig.savePath + "/me.jpg"));
        Assert.assertEquals(true, FileTool.createFileFromInputStream(is, TestConfig.savePath + "/qq/tt/t.jpg"));
        Assert.assertEquals(true, FileTool.isFileExists(TestConfig.savePath + "/qq/tt/t.jpg"));
        FileTool.deleteDir(TestConfig.savePath + "/qq");
        Assert.assertEquals(false, FileTool.isDirectory(TestConfig.savePath + "/qq"));
    }

}
