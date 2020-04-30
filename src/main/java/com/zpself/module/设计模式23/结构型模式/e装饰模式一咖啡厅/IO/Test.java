package com.zpself.module.设计模式23.结构型模式.e装饰模式一咖啡厅.IO;

import java.io.*;

/**
 * @author By ZengPeng
 * @Description
 * @date in  2020/4/29 11:18
 * @Modified By
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
                /* 写入当前对象的二进制流 */
        String  zs = new String("张三");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(zs);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        zs =(String) ois.readObject();



        InputStream in = new FileInputStream("C:\\Users\\ying\\Desktop\\aa.TXT");
        InputStream ob = new ObjectInputStream(in);

        BufferedInputStream bf = new BufferedInputStream(in);
        DataInputStream dataInput = new DataInputStream(bf);
        dataInput.read(null);

    }
}
