package com.zpself.module.basic.stringtoimg;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zengpeng
 * @date 2019/8/8
 */
public class FindImgAndDelete {

    public static void main(String[] args) {
        findImgAndDelete();
    }
    public static void findImgAndDelete() {
        File file = new File("C:\\Users\\cn\\zpFile\\toolInstall\\newSmartGit\\resource_otherProject\\mt-insight-server\\files\\template-file\\20190807115629933.txt");
        if (file.exists() && file.isFile()) {
            StringBuilder buffer = new StringBuilder();
            try (InputStream input = new FileInputStream(file); InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8)) {
                char[] ch = new char[1024];
                int len;
                while ((len = isr.read(ch)) != -1) {
                    buffer.append(new String(ch, 0, len));
                }
                String regex = "src=\"(.+?)\"";
                Pattern compile = Pattern.compile(regex);
                Matcher matcher = compile.matcher(buffer);
                Set<String> imgS = new HashSet<>(3);
                while (matcher.find()){
                    String img = matcher.group();
                    if(img.contains(".")){
                        img = img.substring(img.lastIndexOf("\\")+1,img.lastIndexOf("."));
                        imgS.add(img);
                    }
                }
                System.out.println(imgS);
                System.out.println(imgS.size());
                for (String img : imgS) {
                    File file1 = new File("C:\\Users\\cn\\zpFile\\toolInstall\\newSmartGit\\resource_otherProject\\mt-insight-server\\files\\Picture-files\\" + img);
                    if (file1.exists() && file1.isFile()) {
                        file1.delete();
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
