package bob.code.generator.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attribute {
    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性类型
     */
    private String type;

    /**
     * 属性描述
     */
    private String description;
}
