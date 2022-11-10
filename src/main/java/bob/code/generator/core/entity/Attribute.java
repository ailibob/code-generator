package bob.code.generator.core.entity;

import lombok.Data;

@Data
public class Attribute {
    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性类型
     */
    private String type;
}
