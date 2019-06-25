package com.conpay.component.UtilTool;

import java.io.Serializable;
import java.lang.reflect.Field;

public class CustomAssertion extends org.springframework.util.Assert implements Serializable {

    private static final long serialVersionUID = 6340082887981251434L;

    /**
     *  判断字符串是否为null或者空串或者长度小于0
     * @param str
     * @param message
     */
    public static  void stringIsNull(String str, String message){
        if (str==null||str.length()<0||str==""){
            throw new IllegalArgumentException(message);
        }
    }

    public static void objectIsNull(Object object,String message){
        if (object==null){
            throw new IllegalArgumentException(message);
        }
    }
    /**
     *  判断实体类是否有这个属性
     * @param object
     * @param key
     * @param message
     */
    public static void objectHasAttributes(Object object,String key,String message){
        objectIsNull(object,message);
        Class<?> cls = object.getClass();
        Field[] fields = cls.getFields(); //getFields()和getDeclaredFields()区别在于getFields()获得是所有public属性（包括父类），getDeclaredFields()是获得所有属性（包括public private protected)但是不包含父类属性
        for (Field field : fields){
            if (!field.getName().equals(key)){
                throw new IllegalArgumentException(message);
            }
        }
    }
}
