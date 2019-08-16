package com.zpself.module.basic.stringtoimg;

import java.io.*;
import java.util.Base64;

/**
 * @author zengpeng
 * @date 2019/8/7
 */
public class StringChangeImg {
    public static void main(String[] args) throws IOException {
        // 图片资源路径
        //String path = "D:\\B_Link.png";
        String path = "C:\\Users\\cn\\Desktop\\test.png";
        File file = new File(path);
        String imageStr = getImageStr(file);
        System.out.println("BASE64后的图片字符串：" + imageStr);

        File imageFile = getImageFile(imageStr);
        System.out.println(imageFile.getAbsolutePath());

    }

    public static String getImageStr(File imageFile) {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(imageFile));
            byte[] data = new byte[in.available()];
            in.read(data);
            in.close();
            String imageStr = new String(Base64.getEncoder().encode(data));
            return imageStr;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static File getImageFile(String imageStr) throws IOException {
        File file = new File("C:\\Users\\cn\\Desktop\\" + System.currentTimeMillis() + ".jpg");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
        }
        try {
            OutputStream out = new FileOutputStream(file);
            byte[] data = Base64.getDecoder().decode(imageStr);
            out.write(data);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

}
