package bob.code.generator.example.model;

import bob.code.generator.core.Description;
import lombok.Data;

@Data
@Description("Bob 的 description")
public class Bob {

    @Description("age 的 description")
    private Integer age;
    @Description("name 的 description")
    private String name;
    @Description("weight 的 description")
    private String weight;
    @Description("height 的 description")
    private String height;
    @Description("length 的 description")
    private Integer length;
}
