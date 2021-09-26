package com.lxr.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class apksignerMain {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========开始执行apksigner测试工具==========");
        System.out.println("请输入apk绝对路径：");
        String apkPath = scanner.nextLine();
        Runtime.getRuntime().exec("chmod +x /home/work/appstore/apksignerTools/apksigner");
        Process process = Runtime.getRuntime().exec("/home/work/appstore/apksignerTools/apksigner verify -v " + apkPath);
        InputStream fis = process.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
        String line;
        System.out.println("--------------------");
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("--------------------");
    }
}
