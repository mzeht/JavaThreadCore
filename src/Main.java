

import com.sun.javadoc.Parameter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    String name;
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello World!");
        fansheshuxin();
    }



    private static void fansheshuxin() throws ClassNotFoundException {
        //获取类
        Class c = Class.forName("java.lang.String");
        // 获取所有的属性
        Field[] fields = c.getDeclaredFields();
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        // 遍历每一个属性
        for (Field field : fields) {
            sb.append("\t");// 空格
            sb.append(Modifier.toString(field.getModifiers()) + " ");// 获得属性的修饰符，例如public，static等等
            sb.append(field.getType().getSimpleName() + " ");// 属性的类型的名字
            sb.append(field.getName() + ";\n");// 属性的名字+回车
        }
        sb.append("}\n");
        System.out.println(sb);
    }
}
