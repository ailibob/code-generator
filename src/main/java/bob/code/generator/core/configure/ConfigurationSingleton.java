package bob.code.generator.core.configure;


import bob.code.generator.utils.FileUtils;
import com.google.common.io.CharSink;
import com.google.common.io.Files;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ConfigurationSingleton {
    private static volatile Configuration configuration;

    private static Configuration getConfigure(ClassLoader classLoader){
        if (configuration != null){
            return configuration;
        }
        synchronized (ConfigurationSingleton.class){
            if (configuration != null){
                return configuration;
            }
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
            String path = classLoader.getResource("").getPath();
            try {
                cfg.setDirectoryForTemplateLoading(new File(path));
                cfg.setDefaultEncoding("UTF-8");
                cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                configuration = cfg;
                return cfg;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Template getTemplate(String path,ClassLoader classLoader){
        Configuration cfg = getConfigure(classLoader);
        try {
            return cfg.getTemplate(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void outputTemplate(String outputPath, Template template, Map<String,Object> params){
        File file = FileUtils.getFile(outputPath);
        CharSink charSink = Files.asCharSink(file, StandardCharsets.UTF_8);
        try (Writer out  = charSink.openStream()) {
            template.process(params,out);
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
