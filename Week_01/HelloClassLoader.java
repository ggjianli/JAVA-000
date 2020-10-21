import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;

/**
 * @ClassName: HelloClassLoader
 * @Description: TODO
 * @Author: liujianli
 * @Date: 2020/10/19 18:58
 * @Version: v1.0
 */
public class HelloClassLoader extends ClassLoader {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> classed = new HelloClassLoader().findClass("/Users/liujianli/JAVA-HOMEWORK/production/Week_01/Hello.xlass");

        Method method = classed.getDeclaredMethod("hello");
        method.invoke(classed.newInstance());
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File(name);
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] newBytes = decode(bytes);
        return defineClass("Hello",newBytes,0,newBytes.length);
    }

    public byte[] decode(byte[] bytes){
        byte[] newBytes = new byte[bytes.length];
        byte result;
        for (int i = 0; i < bytes.length ; i++) {
            result = (byte)(255-bytes[i]);
            newBytes[i] = result;
        }
        return newBytes;
    }


}
