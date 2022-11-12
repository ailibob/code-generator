package bob.code.generator.utils;

public class ClassUtils {
    public static String getSimpleName(String simpleName){
        if (!simpleName.contains(".")){
            throw new RuntimeException("ClassUtils error: simpleName not exist .");
        }
        return simpleName.substring(simpleName.lastIndexOf(".") + 1); // strip the package name
    }
}
