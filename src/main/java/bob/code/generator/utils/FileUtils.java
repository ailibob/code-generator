package bob.code.generator.utils;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    /**
     * @param path 相对路径
     * @return 文件
     * 很抱歉全是警告
     */
    public static File getFile(String path){
        File file = new File(path);
        try {
            // 创建文件夹
            Files.createParentDirs(file);
            // 创建当前文件
            if (!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }
}
