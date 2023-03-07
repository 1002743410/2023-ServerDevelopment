package tacos;

import lombok.Data;

/**
 * 配料的类别
 */
@Data
public class Ingredient {
  
  private final String id;
  private final String name;
  private final Type type;

  public enum Type {//枚举类型
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
