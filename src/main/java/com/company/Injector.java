package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Properties;

public  class  Injector {


    public static void inject(Object ob) {
        Class object = ob.getClass();
        Field[] fields = object.getDeclaredFields();
        Properties prop = new Properties();;
        try{
            FileInputStream stream = new FileInputStream("src/main/resources/InjectorConfig.properties");
            prop.load(stream);

        }catch(IOException e){
            System.err.println("Configuration file not found"); e.printStackTrace();
        }
        for (Field fieldInOb : fields) {
            if (fieldInOb.isAnnotationPresent(AutoInject.class)) {
                for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                    if (entry.getKey().equals(fieldInOb.getType().getName())) {
                        try {
                            System.out.println(fieldInOb.getType().getName());
                            //String valueForClass = prop.getProperty((String)entry.getValue());
                            Class<?> clas = Class.forName((String)entry.getValue());
                            Constructor<?> builder = clas.getDeclaredConstructor();
                            Object objectForField = builder.newInstance();
                            fieldInOb.setAccessible(true);
                            fieldInOb.set(ob, objectForField);
                        } catch (ClassNotFoundException e1) {
                            System.err.println("Class not found");
                            e1.printStackTrace();
                        } catch (IllegalAccessException e2) {
                            System.err.println("Field's not acsesiable");
                            e2.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            System.err.println("Constructor not found");
                            e3.printStackTrace();
                        } catch (InstantiationException e4) {
                            System.err.println("Fail");
                            e4.printStackTrace();
                        } catch (InvocationTargetException e5) {
                            System.err.println("Failed to invoke");
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }

    }
}
