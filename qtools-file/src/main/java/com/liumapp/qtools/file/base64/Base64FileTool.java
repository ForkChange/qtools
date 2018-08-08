package com.liumapp.qtools.file.base64;

import java.io.*;
import java.util.Base64;

/**
 * @author liumapp
 * @file Base64FileTool.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/7
 */
public final class Base64FileTool {

    /**
     * all static method , plz do not initialize the class
     */
    private Base64FileTool() {
        throw new UnsupportedOperationException("not allowed to initialize");
    }

    /**
     * read file from file path , and return base64 value
     * @param path file path
     * @return file base64
     */
    public static String filePathToBase64 (String path) throws IOException {
        String base64 = null;
        InputStream in = null;
        try {
            File file = new File(path);
            in = new FileInputStream(file);
            byte[] bytes = new byte[in.available()];
            base64 = Base64.getEncoder().encodeToString(bytes);
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return base64;
    }

    /**
     * require a file object , return base64 value
     * @param file file object
     * @return file base64
     */
    public static String FileToBase64 (File file) throws IOException {
        String base64 = null;
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            byte[] bytes = new byte[in.available()];
            base64 = Base64.getEncoder().encodeToString(bytes);
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return base64;
    }

}