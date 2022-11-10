package bob.code.generator.example;

import bob.code.generator.core.configure.ConfigurationSingleton;
import freemarker.template.Template;

import java.util.HashMap;
import java.util.Map;

public class EasyExample {
    /**
     * 当前用例介绍了对 ftl 的使用
     */
    public static void main(String[] args) throws Exception {
        EasyExample person = new EasyExample();
        person.test();
    }

    public void test() {
        // 获取模版
        Template temp = ConfigurationSingleton.getTemplate("example/site.ftl",this.getClass().getClassLoader());
        // 组装模版参数
        Map<String, Object> root = new HashMap<>();
        root.put("user", "Big Joe");
        Map<String, Object> latest = new HashMap<>();
        root.put("latestProduct", latest);
        latest.put("url", "products/greenmouse.html");
        latest.put("name", "green mouse");
        // 模版文件输出
        ConfigurationSingleton.outputTemplate("src/main/resources/output/site",temp,root);
    }
}
