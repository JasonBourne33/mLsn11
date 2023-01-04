package com.example.javaencrypt;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by LK on 2017/9/4.
 */

public class Zipalign {
    public static void zipalign(File unSignedApk, File alignedApk) throws InterruptedException, IOException {
        File jks = new File("JavaProtect/chaosKey.jks");
        String zipCmd="cmd /c zipalign -v -p 4 "+unSignedApk.getAbsolutePath()
                +" "+alignedApk.getAbsolutePath();
        System.out.println("SignatureCmd=== " + zipCmd);

        Process process = Runtime.getRuntime().exec(zipCmd);
//        System.out.println("start sign");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String line;
//        while ((line = reader.readLine()) != null)
//            System.out.println("tasklist: " + line);

//        try {
//            int waitResult = process.waitFor();
//            System.out.println("waitResult: " + waitResult);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            throw e;
//        }
//        System.out.println("process.exitValue() " + process.exitValue());
//        if (process.exitValue() != 0) {
//            InputStream inputStream = process.getErrorStream();
//            int len;
//            byte[] buffer = new byte[2048];
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            while ((len = inputStream.read(buffer)) != -1) {
//                bos.write(buffer, 0, len);
//            }
//            System.out.println(new String(bos.toByteArray(), "GBK"));
//            throw new RuntimeException("对齐执行失败");
//        }
//        System.out.println("finish signed");
        process.destroy();
    }
}
