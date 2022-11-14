package bob.code.generator.example.model;

import bob.code.generator.core.Description;
import lombok.Data;

@Data
@Description("作者类")
public class Bob {

    @Description("id")
    private Integer id;
    @Description("年龄")
    private Integer age;
    @Description("名称")
    private String name;
    @Description("体重")
    private String weight;
    @Description("身高")
    private String height;
}
